import React from "react";
function myFunction1() {
        let height = document.getElementById("login-html");
        height.style.height = "100%";
    }
    function myFunction2() {
        let height = document.getElementById("login-html");
        height.style.height = "150%";
    }
const Login = () => {
    
    return (
        <div className="login-wrap">
            <div id="login-html">
                <input id="tab-1" type="radio" name="tab" className="sign-in" onClick={myFunction1}checked></input><label for="tab-1" className="tab">Connexion</label>
                <input id="tab-2" type="radio" name="tab" className="sign-up" onClick={myFunction2}></input><label for="tab-2" className="tab">Inscription</label>
                <div className="login-form">
                    <div className="sign-in-htm">
                        <div className="group">
                            <label for="user" className="label">Pseudo</label>
                            <input id="user" type="text" className="input"></input>
                        </div>
                        <div className="group">
                            <label for="pass" className="label">Mot de passe</label>
                            <input id="pass" type="password" className="input" data-type="password"></input>
                        </div>

                        <div className="group">
                            <input type="submit" className="button" value="Sign In"></input>
                        </div>
                        <div className="hr"></div>
                        <div className="foot-lnk">
                            <a href="#forgot">Mot de passe oublié?</a>
                        </div>
                    </div>
                    <div className="sign-up-htm">
                        <div className="group">
                            <label for="user" className="label">Prénom</label>
                            <input id="user" type="text" className="input"></input>
                        </div>
                        <div className="group">
                            <label for="user" className="label">Nom</label>
                            <input id="user" type="text" className="input"></input>
                        </div>
                        <div className="group">
                            <label for="pass" className="label">Mot de passe</label>
                            <input id="pass" type="password" className="input" data-type="password"></input>
                        </div>

                        <div className="group">
                            <label for="pass" className="label">Email </label>
                            <input id="pass" type="text" className="input"></input>
                        </div>
                        <div className="group">
                            <label for="pass" className="label">Username </label>
                            <input id="pass" type="text" className="input"></input>
                        </div>
                        <div className="group">
                            <label for="pass" className="label">Téléphone </label>
                            <input id="pass" type="text" className="input"></input>
                        </div>
                        <div className="group">
                            <input type="submit" className="button" value="Sign Up"></input>
                        </div>
                        <div className="hr"></div>
                        <div className="foot-lnk">
                            <label for="tab-1">Déja membre?</label>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Login;