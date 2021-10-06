import React from "react";
import CreateMission from "../components/CreateMission";
import Footer from "../components/Footer";
import Navigation from "../components/Navigation";

const Missions = () => {
  return (
    <main>
      <header>
        <h1>Missions</h1>
        <Navigation />
      </header>

      <section>
        <CreateMission />
      </section>
      <footer>
        <Footer />
      </footer>
    </main>
  );
};

export default Missions;
