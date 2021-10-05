import React from "react";
import Login from "../components/Login";
import Navigation from "../components/Navigation";
import Footer from "../components/Footer";

const Connexion = () => {
  return (
    <main>
      <header>
        <h1>Connexion</h1>
        <Navigation />
      </header>

      <section>
        <Login />
      </section>
      <footer>
        <Footer />
      </footer>
    </main>
  );
};

export default Connexion;
