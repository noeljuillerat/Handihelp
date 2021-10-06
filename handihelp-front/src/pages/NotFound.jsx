import React from "react";
import { Link } from "react-router-dom";

const NotFound = () => {
    return (
        <div className="container">
    <div className="row">
        <div className="col-md-12">
            <div className="error-template">
                <h1>
                    Oops!</h1>
                <h2>
                     ERREUR 404 </h2>
                <div className="error-details">
                    Désolé, une erreur s'est produite, la page demandée n'a pas été trouvé !
                </div>
                        <div claclassNamess="error-actions">
                        <Link to={`/`}>
                            <span class="glyphicon glyphicon-home" className="btn btn-primary btn-lg">Retour à l'accueil</span>
                        </Link>
                        <Link to={'/contact'} className="btn btn-default btn-lg">
                        Contacter le support<span className="glyphicon glyphicon-envelope"></span>
                        </Link>
                </div>
            </div>
        </div>
    </div>
</div>

    )
}

export default NotFound;