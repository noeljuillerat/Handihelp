import React from "react";

const Profil = ({user}) => {
    console.log(user)
    return (
        <div>
            <div>Profil</div>
            <p>Prénom : <input type="text" value={user.prenom}/></p>
            <p>Nom : {user.nom}</p>
            <p>Username : {user.username}</p>
            <p>Password : {user.password}</p>
            <p>Email : {user.email}</p>
            <p>Téléphone : {user.telephone}</p>
        </div>
    )
}

export default Profil;