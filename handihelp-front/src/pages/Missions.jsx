import React from "react";

const CreateMissionForm = ({onCreateMission, user}) => {
    const[titre, setTitre] = React.useState("");
    const[date, setDate] = React.useState("");
    const[lieu, setLieu] = React.useState("");
    const[duree, setDuree] = React.useState("");
    const[description, setDescription] = React.useState("");

    // HANDLERS
    const onTitreChange = (e) => setTitre(e.target.value);
    const onDateChange = (e) => setDate(e.target.value);
    const onLieuChange = (e) => setLieu(e.target.value);
    const onDureeChange = (e) => setDuree(e.target.value);
    const onDescriptionChange = (e) => setDescription(e.target.value);

    const handleSubmit = (e) => {
        e.preventDefault();
        e.stopPropagation();
        const requestOptions = {
            method: 'POST',
            body: JSON.stringify({
                titre: titre,
                date: date,
                lieu:lieu,
                duree:duree,
                description: description,
                userid: user.id
            })
        };
        fetch('http://localhost:8080/api/mission/create', requestOptions)
            .then(response => response.json())
            .then(data => {
                if (data.status === "ok") {
                    onCreateMission();
                } else {
                    console.log(data);
                }
            }).catch(err => {console.log(err)});
    }

    return (
        <div className="mt-4">
            <h1>Créer une mission</h1>
            <br />
            <form class="needs-validation" novalidate>
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <h6 htmlFor="titre">Titre</h6>
                        <input type="text" class="form-control" id="titre" value={titre} onChange={onTitreChange} required/>
                    </div>
                    <div class="col-md-6 mb-3">
                        <h6 htmlFor="date">Date</h6>
                        <input type="text" class="form-control" id="date" value={date} onChange={onDateChange} required/>
                    </div>
                
                </div>
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <h6 htmlFor="lieu">Lieu</h6>
                        <input type="text" class="form-control" id="lieu" value={lieu} onChange={onLieuChange} required />
                    </div>
                    <div class="col-md-6 mb-3">
                        <h6 htmlFor="duree">Durée</h6>
                        <input type="text" class="form-control" id="duree" value={duree} onChange={onDureeChange} required />
                    </div>
                    <div class="form-group col-12">
                        <h6 htmlFor="description">Description de la mission</h6>
                        <textarea class="form-control" id="description" rows="3" value={description} onChange={onDescriptionChange} ></textarea>
                    </div>
                </div>
                <br/>
                <button class="btn btn-success" type="submit" onClick={handleSubmit}>Envoyer</button>
            </form>
            <br />
            <hr />
        </div>
    )
}


const MissionBlock = ({data}) => {
    return (
        <div className="card mission-block">
            {/* Conditionnelle pour changer la couleur du header de la mission selon le statut */}
            {data.statutMission.statut === "DEPOSEE" ? <h5 className="card-header"><i className="bi-bell"></i> Nouvelle mission</h5> : null}
            {data.statutMission.statut === "EN_COURS" ? <h5 className="card-header bg-warning"><i className="bi-patch-check"></i> Mission acceptée</h5> : null}
            {data.statutMission.statut === "TERMINEE" ? <h5 className="card-header bg-success"><i className="bi-patch-check-fill"></i> Mission terminée</h5> : null}
            
            <div className="card-body">
                <h5 className="card-title">{data.titre}</h5>
                <p className="card-text">{data.description}</p>
                <p className="card-text"><i className="bi-calendar-3"></i>Date : {data.dateHeure}</p>
                <p className="card-text"><i className="bi-clock"></i>Temps estimé : {data.duree}</p>
                <p className="card-text"><i className="bi-bullseye"></i>Lieu de la mission: {data.lieu}</p>

                {/* Conditionnelle pour déterminer si le bouton est cliquable */}
                {data.statutMission.statut === "DEPOSEE" ?
                    // Si la mission est : DEPOSEE
                    <button href="/#" className="btn btn-outline-success">
                        Accepter la mission
                        <i className="bi-award"></i>
                    </button> :
                    // Sinon
                    <button href="/#" className="btn btn-outline-secondary" disabled>
                        Mission déjà acceptée
                        <i className="bi-trophy"></i>
                    </button>}
            </div>
        </div>
    )
}

const Missions = ({user}) => {
    // constante représentant le state (état) du composant Missions
    const [missions, setMissions] = React.useState([]);
    const[newMission, setNewMission] = React.useState(0);

    // Hook se lançant lorsque le composant est appelé :
    // Récupère (fetch) les missions, les tries dans le sens inverse
    // et les stocke dans le state du composant (setMissions) 
    React.useEffect(() => {
        const url = "http://localhost:8080/api/mission/list"
        fetch(url).then(res => res.json()).then(data => {
            data.reverse()
            setMissions(data)
        }).catch(err => {console.log(err)});
    }, [newMission])

    const handleCreateMission = () => {
        const count = newMission + 1;
        setNewMission(count)
    }

    return (
        <div className="col-md-6 ms-auto me-auto">
            <CreateMissionForm onCreateMission={handleCreateMission} user={user}/>
            <h1 className="mt-5 mb-5">Missions</h1>
            {/* Mapping des missions, forEach mission => return un composant MissionBlock 
            et lui passe UNE mission en props */}
            {missions.map(mission => <MissionBlock data={mission}  key={mission.id}/>)}
        </div>
    )
}

export default Missions;