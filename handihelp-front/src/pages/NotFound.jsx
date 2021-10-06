import React from "react";

const NotFound = () => {
    return (
        <div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="error-template">
                <h1>
                    Oops!</h1>
                <h2>
                     ERREUR 404 </h2>
                <div class="error-details">
                    Désolé, une erreur s'est produite, la page demandée n'a pas été trouvé !
                </div>
                <div class="error-actions">
                            <a href="http://www.jquery2dotnet.com" class="btn btn-primary btn-lg">
                                <span class="glyphicon glyphicon-home"></span>
                                Retour à l'accueil </a>
                            <a href="http://www.jquery2dotnet.com" class="btn btn-default btn-lg">
                                <span class="glyphicon glyphicon-envelope"></span>
                                Contacter le support </a>
                </div>
            </div>
        </div>
    </div>
</div>

    )
}

export default NotFound;