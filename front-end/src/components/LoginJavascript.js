import React from "react";
import $ from "jquery";

const LoginJavascript = () => {
  const login = () => {
    $("#login-button").Onclick(function (event) {
      event.preventDefault();

      $("form").fadeOut(500);
      $(".wrapper").addClass("form-success");
    });
  };

  return;
};

export default LoginJavascript;
