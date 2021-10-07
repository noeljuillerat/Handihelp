import React from "react";
import { Link } from "react-router-dom";

const NotFound = () => {
    return (
        <div className="container">
    <div className="row align-items-center">
        <div className="col-md-6 ">
                    
            <div className="error-template align-items-center">             
                <h1>
                    Oops!</h1>
                <h2>
                    ERREUR 404 </h2>
                <div className="error-details">
                    Désolé, une erreur s'est produite, la page demandée n'a pas été trouvé !
            </div>
            <div classNames="error-actions">
                <Link to={`/`}>
                    <span class="glyphicon glyphicon-home" className="btn btn-primary btn-lg mt-5">Retour à l'accueil</span>
                </Link>
                <Link to={'/contact'} className="btn btn-default btn-lg mt-5">
                Contacter le support<span className="glyphicon glyphicon-envelope"></span>
                </Link>
            </div>
            </div>
        </div>
        <div className="col-md-6">
            <img src="fauteuil.jpg" alt="404"/>
        </div>
    </div>
</div>

    )
}

export default NotFound;