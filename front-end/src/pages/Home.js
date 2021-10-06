import React from "react";
import { Link } from "react-router-dom";
import Footer from "../components/Footer";
import Navigation from "../components/Navigation";
<<<<<<< HEAD
import Missions from "./Missions";
import LoginJavascript from "../components/LoginJavascript";
=======
>>>>>>> e2c6b3ae3ae4ce31f736f751361ba6e4dad0a818

const Home = () => {
  return (
    <main>
<<<<<<< HEAD
      <div className="home">
       
      </div>
      <header>
        <Navigation />
      </header>
      <section>
        {/* Formulaire juste pour le test */}
        <div className="home">
        <Login />
        <LoginJavascript />
        </div>
      </section>
=======
      <header>
        <Navigation />
      </header>
      <section></section>
>>>>>>> e2c6b3ae3ae4ce31f736f751361ba6e4dad0a818
      <section>
        {/* Lien vers la création de missions pour l'apprenants en situation d'handicap */}
        <Link to={`/connexion`}>
          <span>J'ai besoin d'aide</span>
        </Link>
        {/* Lien vers la recherche de mission avec paramètre pour le bénévole */}
        <Link to={`/connexion`}>
          <span>Je veux aider</span>
        </Link>
      </section>

      <footer>
        <Footer />
      </footer>
    </main>
  );
};

export default Home;
