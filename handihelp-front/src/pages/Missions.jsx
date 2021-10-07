import React from "react";

const CreateMissionForm = () => {
    return (
        <form class="needs-validation" novalidate>
      <div class="form-row">
        <div class="col-md-6 mb-3">
          <h3 for="validationCustom01">Titre</h3>
          <input type="text" class="form-control" id="validationCustom01"  required/>
          <div class="valid-feedback">
            Ca marche!
          </div>
        </div>
        <div class="col-md-6 mb-3">
          <h3 for="validationCustom02">Date</h3>
          <input type="text" class="form-control" id="validationCustom02" required/>
          <div class="valid-feedback">
            Ca marche!
          </div>
        </div>
       
      </div>
      <div class="form-row">
        <div class="col-md-6 mb-3">
          <h3 for="validationCustom03">Lieu</h3>
          <input type="text" class="form-control" id="validationCustom03" required />
          <div class="invalid-feedback">
            Mettre un lieu valide!
          </div>
        </div>
        <div class="col-md-6 mb-3">
          <h3 for="validationCustom04">Durée</h3>
          <input type="text" class="form-control" id="validationCustom04" required />
          <div class="invalid-feedback">
            Mettre une durée valide!
          </div>
        </div>
        <div class="form-group col-12">
          <h3 for="discription">Description de la mission</h3>
          <textarea class="form-control" id="description" rows="3"></textarea>
        </div>
      </div>
      
      <button class="btn btn-success" type="submit">Envoyer</button>
    </form>
    )
}


const MissionBlock = ({data}) => {
    return (
        <div className="card mission-block">
            {/* Conditionnelle pour changer la couleur du header de la mission selon le statut */}
            {data.statutMission.statut === "DEPOSEE" ? <h5 className="card-header">Nouvelle mission</h5> : null}
            {data.statutMission.statut === "EN_COURS" ? <h5 className="card-header bg-warning">Mission acceptée</h5> : null}
            {data.statutMission.statut === "TERMINEE" ? <h5 className="card-header bg-success">Mission terminée</h5> : null}
            
            <div className="card-body">
                <h5 className="card-title">{data.titre}</h5>
                <p className="card-text">{data.description}</p>
                <p className="card-text">Date : {data.dateHeure}</p>
                <p className="card-text">Temps estimé : {data.duree}</p>
                <p className="card-text">Etablissement : {data.etablissement.nom}</p>
                <p className="card-text">Lieu de la mission: {data.lieu}</p>

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

const Missions = () => {
    // constante représentant le state (état) du composant Missions
    const [missions, setMissions] = React.useState([])

    // Hook se lançant lorsque le composant est appelé :
    // Récupère (fetch) les missions, les tries dans le sens inverse
    // et les stocke dans le state du composant (setMissions) 
    React.useEffect(() => {
        const url = "http://localhost:8080/api/mission/list"
        fetch(url).then(res => res.json()).then(data => {
            data.reverse()
            setMissions(data)
            console.log(data)
        }).catch(err => {console.log(err)});
    }, [])

    return (
        <div>
            <h1>Missions</h1>
            {/* Mapping des missions, forEach mission => return un composant MissionBlock 
            et lui passe UNE mission en props */}
            {missions.map(mission => <MissionBlock data={mission}  key={mission.id}/>)}
        </div>
    )
}

export default Missions;