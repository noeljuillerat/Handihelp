import React from "react";

const FormulaireConnexion = () => {
  return (

  <div className="wrapper">
    <div className="container">
        <h1>Connexion</h1>
        
        <form className="form">
            <input type="text" name="username" placeholder="Username"/>
            <input type="password" name="password" placeholder="Password"/>
            <button type="submit" id="login-button">Login</button>
        </form>
    </div>
    <div>
      <ul className="bg-bubbles">
          <li></li>
          <li></li>
          <li></li>
          <li></li>
          <li></li>
          <li></li>
          <li></li>
          <li></li>
          <li></li>
          <li></li>
      </ul> 
      
    </div>
    
  </div>
  );
};

export default FormulaireConnexion; 


