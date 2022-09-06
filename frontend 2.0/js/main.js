function handleCredentialResponse(response) {
    console.log("Encoded JWT ID token: " + response.credential);
  }
  window.onload = function () {
  google.accounts.id.initialize({
      client_id: "608648568209-kilnh6rq4q1j1p6uc2pqb45ddl4erflp.apps.googleusercontent.com",
      callback: handleCredentialResponse
  });
  google.accounts.id.renderButton(
      document.getElementById("buttonDiv"), {
      theme: "filled_black",
      size: "large",
      type: "standard",
      shape: "pill",
      locale: "pt-BR",
      logo_alignment: "left",
  });

  google.accounts.id.prompt();
  }