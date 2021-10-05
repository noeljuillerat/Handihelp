import React from "react";
import Navigation from "../components/Navigation";
import { CopyToClipboard } from "react-copy-to-clipboard";
import Formulaire from "../components/Formulaire";

const Contact = () => {
  return (
    <div className="contact">
      <Navigation />
      <div className="contactContent">
        <div className="header"></div>
        <div className="contactBox">
          <h1>Contactez-nous</h1>
          <ul>
            <li className="fas fa-map-marker-alt"></li>
            <span>Montpellier</span>
            <li className="fas fa-mobile-alt">
              <CopyToClipboard text="0601020304">
                <span
                  className="clickInput"
                  onClick={() => {
                    alert("Numéro de téléphone copié !");
                  }}
                >
                  06.01.02.03.04
                </span>
              </CopyToClipboard>
            </li>
            <li className="far fa-envelope">
              <CopyToClipboard text="test@gmail.com">
                <span
                  className="clickInput"
                  onClick={() => {
                    alert("Adresse mail copié !");
                  }}
                >
                  test@gmail.com
                </span>
              </CopyToClipboard>
            </li>
            <li>
              <Formulaire />
            </li>
          </ul>
        </div>

        <div className="socialNetwork">
          <ul>
            <a
              href="https://www.google.fr/"
              target="_blank"
              rel="noopener noreferrer"
            >
              <h4>LinkedIn</h4>
              <i className="fab fa-linkedin"></i>
            </a>

            <a
              href="https://www.google.fr/"
              target="_blank"
              rel="noopener noreferrer"
            >
              <h4>Github</h4>
              <i className="fab fa-github"></i>
            </a>
          </ul>
        </div>
      </div>
    </div>
  );
};

export default Contact;
