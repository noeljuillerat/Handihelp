import React from "react";
import './styles/App.css';
import {
    BrowserRouter as Router,
    Switch,
    Route,
    NavLink
  } from "react-router-dom";
import Home from './pages/Home';
import Profil from './pages/Profil';
import Missions from './pages/Missions';
import Contact from './pages/Contact';
import Connexion from './pages/Connexion';


function App() {
    const [authenticated, setAuthenticated] = React.useState(false);


    return (
        <div className="App container-fluid d-flex flex-column min-vh-100">
            <Router>
                <header>
                    <nav className="navbar navbar-expand-lg navbar-light bg-light rounded" aria-label="Navigation">
                        <div className="container-fluid">
                            <a className="navbar-brand" href="/#">HandiHelp</a>
                            <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navBarNavigation" aria-controls="navBarNavigation" aria-expanded="false" aria-label="Toggle navigation">
                                <span className="navbar-toggler-icon"></span>
                            </button>

                            <div className="collapse navbar-collapse" id="navBarNavigation">
                                <ul className="nav navbar-nav mb-2 mb-lg-0 navbar-right">
                                    <li className="nav-item">
                                        <NavLink exact to="/" className="nav-link" activeClassName="active">Home</NavLink>
                                    </li>
                                    <li className="nav-item">
                                        <NavLink exact to="/profil" className="nav-link" activeClassName="active">Profil</NavLink>
                                    </li>
                                    <li className="nav-item">
                                        <NavLink exact to="/missions" className="nav-link" activeClassName="active">Missions</NavLink>
                                    </li>
                                    <li className="nav-item">
                                        <NavLink exact to="/contact" className="nav-link" activeClassName="active">Contact</NavLink>
                                    </li>
                                    <li className="nav-item">
                                        <NavLink exact to="/connexion" className="nav-link" activeClassName="active">Connexion</NavLink>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </nav>
                </header>
                <main className="container">
                    <Switch>
                    <Route path="/connexion"><Connexion /></Route>
                    <Route path="/contact"><Contact /></Route>
                    <Route path="/missions"><Missions /></Route>
                    <Route path="/profil"><Profil /></Route>
                    <Route path="/"><Home /></Route>
                    </Switch>
                </main>
                <footer className="footer mt-auto py-3 bg-light">
                    <div className="container">
                        <span className="text-muted">Place sticky footer content here.</span>
                    </div>
                </footer>
            </Router>
        </div>
    );
}

export default App;