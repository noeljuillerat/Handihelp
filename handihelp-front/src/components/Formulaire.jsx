import React from "react";
import { useState } from "react";
import emailjs from "emailjs-com";

const ContactForm = () => {
  const [name, setName] = useState("");
  const [phone, setPhone] = useState("");
  const [email, setEmail] = useState("");
  const [message, setMessage] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    let nameS = document.getElementById("name");
    let emailS = document.getElementById("email");
    let messageS = document.getElementById("message");
    let phoneS = document.getElementById("message");
    let formMess = document.querySelector(".formMessage");

    const isEmail = () => {
      let isMail = document.getElementById("not-mail");
      let regex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;

      if (email.match(regex)) {
        isMail.style.display = "none";
        return true;
      } else {
        isMail.style.display = "block";
        isMail.style.animation = "dongle 1s";
        setTimeout(() => {
          isMail.style.animation = "none";
        }, 1000);
        return false;
      }
    };

    if (name && isEmail() && message) {
      nameS.classList.remove("red");
      emailS.classList.remove("red");
      messageS.classList.remove("red");

      formMess.innerHTML = "Message en cours d'envoi...";
      formMess.style.background = "#00c1ec";
      formMess.style.opacity = "1";

      // voir doc : https://www.emailjs.com/docs/examples/reactjs/
      emailjs
        .send(
          // your service ID
          "service_bdkocoo",
          // your template ID
          "template_3xer5ky",

          {
            name,
            email,
            message,
            phone,
          },
          // your user ID (protégé par .env)
          process.env.REACT_APP_EMAILJS_KEY
        )
        .then(
          () => {
            formMess.innerHTML =
              "Message envoyé ! Je vous recontacterai dès que possible.";

            document.getElementById("name").classList.remove("error");
            document.getElementById("email").classList.remove("error");
            document.getElementById("message").classList.remove("error");
            document.getElementById("phone").classList.remove("error");
            setName("");
            setEmail("");
            setMessage("");
            setPhone("");

            setTimeout(() => {
              formMess.style.opacity = "0";
            }, 5000);
          },
          (err) => {
            console.log(err);
            formMess.style.background = "rgb(253, 87, 87)";
            formMess.innerHTML =
              "Une erreur s'est produite, veuillez réessayer.";
          }
        );
    } else {
      formMess.innerHTML = "Merci de remplir correctement les champs requis *";
      formMess.style.background = "rgb(253, 87, 87)";
      formMess.style.opacity = "1";

      if (!name) {
        nameS.classList.add("error");
      }
      if (!email) {
        emailS.classList.add("error");
      }
      if (!message) {
        messageS.classList.add("error");
      }
      if (!phone) {
        phoneS.classList.add("error");
      }
    }
  };

    return (
<section class="mb-6">
    <h2 class="h1-responsive font-weight-bold text-center my-4">Contactez nous</h2>
                <p class="text-center w-responsive mx-auto mb-5">Avez-vous des questions?</p>
                <p class="text-center w-responsive mx-auto mb-5">N'hésitez pas à nous contacter directement.
                Notre équipe reviendra vers vous pour vous aider.</p>
    <div class="row">
          <div align="center">
            <form className='contact-form' id="contact-form" name="contact-form" style={{margin: "0"}} >
                {/* Nom Prénom */}
                <div className="row">
                    <div className="col-md-12">
                        <div className="md-form mb-0">
                            <input type="text" type="text"
                                    id="name"
                                    name="name"
                                    required
                                    onChange={(e) => setName(e.target.value)}
                                    placeholder="Nom Prénom *"
                                    value={name}
                                    className="form-control" />
                       </div>
                    </div>
                </div>
                {/* Téléphone */}
                <div className="row">
                    <div className="col-md-12">
                        <div className="md-form mb-0">
                            <input
                                type="text"
                                id="phone"
                                name="phone"
                                onChange={(e) => setPhone(e.target.value)}
                                placeholder="téléphone"
                                value={phone}
                                className="form-control" />                        </div>
                    </div>
                </div>
                {/* Email */}      
                <div class="row">           
                    <div className="email-content md-form mb-0">
                        <label id="not-mail">Email non valide</label>
                        <input
                            type="mail"
                            id="email"
                            name="email"
                            required
                            onChange={(e) => setEmail(e.target.value)}
                            placeholder="Adresse mail *"
                            value={email}
                            className="form-control"
                        />
                    </div>                   
                </div>
                 {/* Sujet */}        
                <div className="row">
                    <div className="col-md-12">
                        <div className="md-form mb-0">
                            <input type="text"
                                    id="subject"
                                    name="subject"
                                className="form-control"
                                placeholder='Sujet *'
                                required />
                        </div>
                    </div>
                </div>
                {/* Message */}       
                <div classNames="row">
                    <div className="col-md-12">
                        <div className="md-form">
                            <textarea
                                id="message"
                                name="message"
                                onChange={(e) => setMessage(e.target.value)}
                                placeholder="message *"
                                value={message}
                                required
                                className="form-control md-textarea"
                                rows="2"
                            />
                        </div>
                    </div>
                </div>
                {/* Message informatif */}
                <div className="formMessage"></div>
            </form>

            <div className="text-center text-md-left">
                <input
                    className="formButton hover button btn btn-success"
                    type="submit"
                    value="Envoyer"
                    style={{width: "30%"}}
                    onClick={(e) => handleSubmit(e)}
                />
            </div>
            <div className="status"></div>
        </div>

        
    </div>

    </section>
  );
};

export default ContactForm;
