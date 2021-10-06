import React from "react";
import Login from "../components/Login"
import { Redirect, useLocation } from 'react-router-dom';

const Connexion = ({onLogin}) => {
    const [redirectToReferrer, setRedirectToReferrer] = React.useState(false)
    const [redirectToAccountCreated, setRedirectToAccountCreated] = React.useState(false)
    const { state } = useLocation()

    const handleSubmit = (username) => {
        console.log(username)
        const url = 'http://localhost:8080/api/user/find?username=' + username;
        fetch(url)
            .then(response => response.json())
            .then(data => {
                console.log(data)
                if (data.username === username) {
                    onLogin(data);
                    setRedirectToReferrer(true)
                }
            }).catch(err => {console.log(err)});
    }
    const handleRegister = () => {
        setRedirectToAccountCreated(true)
    }

    // Si Login, rediriger l'utilisateur sur une autre page
    if (redirectToReferrer) {
        return <Redirect to={state?.from.pathname || '/'} />
    }
    // Si compte créé, rediriger vers la page AccountCreated
    if (redirectToAccountCreated) {
        return <Redirect to={state?.from.pathname || '/new-account'} />
    }
    return (
        <div className="imageConnexion row">
            <div className="col-lg-3 divperso"><img className="personnage1" src="/perso1.png" alt="Un apprenant"/></div>
            <div className="col-sm-12 col-lg-6"><Login onSubmit={handleSubmit} onRegister={handleRegister}/></div>
            <div className="col-lg-3 divperso"><img className="personnage2" src="/perso2.png" alt="Une apprenante"/></div>
        </div>
    )
}

export default Connexion;