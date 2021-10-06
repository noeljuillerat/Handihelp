import React from "react";
import Formulaire from "../components/Formulaire"

const Contact = () => {
    return (
        <div className="home-container row align-items-center">
        <div className="col-md-6 text-center home-left">
           <Formulaire />
        </div>

        <div className="col-md-6 home-right">
            <img src="/home.png" alt="Home banner"></img>
        </div>
    </div>
    )
}

export default Contact;