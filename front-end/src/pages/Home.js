import React from "react";
import { Link } from "react-router-dom";
import Footer from "../components/Footer";
import Navigation from "../components/Navigation";

const Home = () => {
  return (
    <main>
      <header>
        <Navigation />
      </header>
      <section></section>
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
