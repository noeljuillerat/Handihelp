import React from "react";
import { Link, NavLink } from "react-router-dom";
import Footer from "../components/Footer";
import Formulaire from "../components/Formulaire";
import Navigation from "../components/Navigation";
import Missions from "./Missions";

const Home = () => {
  return (
    <main>
      <header>
        <Navigation />
      </header>
      <section>
        {/* Formulaire juste pour le test */}
        <div className="home">
          <Formulaire />
        </div>
      </section>
      <section>
        {/* Lien vers la création de missions pour l'apprenants en situation d'handicap */}
        <Link to={`/missions`}>
          <span>J'ai besoin d'aide</span>
        </Link>
        {/* Lien vers la recherche de mission avec paramètre pour le bénévole */}
        <Link to={`/missions`}>
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
