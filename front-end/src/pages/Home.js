import React from "react";
import Formulaire from "../components/Formulaire";
import Navigation from "../components/Navigation";

const Home = () => {
  return (
    <main>
      <header>
        <Navigation />
      </header>
      <section>
        <div className="home">
          <Formulaire />
        </div>
      </section>
      <section></section>

      <footer></footer>
    </main>
  );
};

export default Home;
