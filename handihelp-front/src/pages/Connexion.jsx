import React from "react";

const Connexion = () => {
    return (
        <div>
            <form className="form-connexion me-auto ms-auto" method="POST">
                <div className="mb-3">
                    <label for="email" className="form-label">Adresse mail</label>
                    <input type="email" className="form-control" id="email"/>
                </div>
                <div className="mb-3">
                    <label for="password" className="form-label">Mot de passe</label>
                    <input type="password" className="form-control" id="password"/>
                </div>
                <div className="mb-3 form-check">
                    <input type="checkbox" className="form-check-input" id="rememberCheck"/>
                    <label className="form-check-label" for="rememberCheck">Rester connecté</label>
                </div>
                <button type="submit" className="btn btn-primary">Login</button>
            </form>
        </div>
    )
}

export default Connexion;