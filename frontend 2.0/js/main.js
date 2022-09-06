function handleCredentialResponse(response) {
    console.log("Encoded JWT ID token: " + response.credential);
  }
  window.onload = function () {
    const clientID = "608648568209-kilnh6rq4q1j1p6uc2pqb45ddl4erflp.apps.googleusercontent.com"
  google.accounts.id.initialize({
      client_id: clientID,
      callback: handleCredentialResponse
  });
  google.accounts.id.renderButton(
    document.getElementById("buttonDiv"),
    { theme: "outline", size: "large" }  // customization attributes
  );

  google.accounts.id.prompt();
  }