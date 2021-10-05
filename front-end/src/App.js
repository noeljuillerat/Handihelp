import React from "react";
import { HashRouter, Route, Switch } from "react-router-dom";
import Home from "./pages/Home";
import NotFound from "./pages/NotFound";
import Profil from "./pages/Profil";
import Contact from "./pages/Contact";
import Missions from "./pages/Missions";

const App = () => {
  return (
    <HashRouter>
      <Switch>
        <Route path="/" exact component={Home} />
        <Route component={NotFound} />
        <Route path="/profil" component={Profil} />
        <Route path="/missions" component={Missions} />
        <Route path="/contact" component={Contact} />
      </Switch>
    </HashRouter>
  );
};

export default App;
