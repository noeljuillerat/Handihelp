import React from "react";
import Login from "../components/Login"
import { Redirect, useLocation } from 'react-router-dom';

const Connexion = ({onLogin}) => {
    const [redirectToReferrer, setRedirectToReferrer] = React.useState(false)
    const { state } = useLocation()

    const handleSubmit = (e) => {
        onLogin()
        setRedirectToReferrer(true)
    }

    if (redirectToReferrer) {
        return <Redirect to={state?.from.pathname || '/'} />
    }
    return (
        <div className="imageConnexion row">
            <div className="col-lg-3 divperso"><img className="personnage1" src="/perso1.png"/></div>
            <div className="col-sm-12 col-lg-6"><Login onSubmit={handleSubmit}/></div>
            <div className="col-lg-3 divperso"><img className="personnage2" src="/perso2.png"/></div>
           
        </div>
    )
}

export default Connexion;