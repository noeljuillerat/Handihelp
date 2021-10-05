import React from "react"; 


const LoginJavascript = () => {
  return (
    $("#login-button").click(function(event){
      event.preventDefault();
    
      $('form').fadeOut(500);
      $('.wrapper').addClass('form-success');
    })
  );
};

export default LoginJavascript; 