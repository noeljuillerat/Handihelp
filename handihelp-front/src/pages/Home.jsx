import React from "react";
import { Link } from "react-router-dom";
const Home = () => {
    return (
        <div className="home-container row align-items-center">
            <div className="col-md-6 text-center home-left">
                <h1 className="display-1">Welcome <strong>to</strong></h1>
                <h2  className="display-3">HANDIHELP</h2>
                <blockquote className="blockquote">
                    <p>Le site d'entraide entre apprenants et apprenants en situation d'handicap.</p>
                </blockquote>

                <button type="button" className="btn btn-outline-success home-btn ">
                <Link to={`/connexion`} className="link-success" >
                    J'ai besoin d'aide
                    </Link>
                    <i className="bi-bell btn-icon"></i>
                </button>

                <button type="button" className="btn btn-outline-success home-btn">
                <Link to={`/connexion`} className="link-success">
                Je veux aider</Link>
                    <i className="bi-award btn-icon"></i>
                </button>
            </div>

            <div className="col-md-6 home-right">
                <img src="/home-ban.png" alt="Home banner"></img>
            </div>
        </div>
    )
}

export default Home;