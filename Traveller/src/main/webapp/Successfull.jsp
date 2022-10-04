<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" type="model.Client" scope="session"/> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Perfil do usuario</title>
  <!-- Nosso CSS -->
  <link rel="stylesheet" href="./assets/css/style.css">
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
  <!-- Google Fonts -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300&display=swap" rel="stylesheet">



</head>

<body>

  <!-- Início do header -->
  <header>
    <nav class="navbar navbar-expand-lg bg-azul-claro-degrade">
      <div class="container-fluid">
        <a class="navbar-brand" href="index.html"><img class="header-logo" src="./assets/images/traveller-logo.svg"
            alt="Traveller"></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse menu-link " id="navbarSupportedContent">
          <ul class="navbar-nav mb-2 mb-lg-0 ms-auto">
            <li class="nav-item my-auto">
              <a class="nav-link text-menu-hover" aria-current="page" href="index.html">Início</a>
            </li>
            <li class="nav-item my-auto">
              <a class="nav-link text-menu-hover" href="servicos.html">Serviços</a>
            </li>
            <li class="nav-item  dropdown my-auto">
              <a class="nav-link dropdown-toggle text-menu-hover" href="#" role="button" data-bs-toggle="dropdown"
                aria-expanded="false">
                Onde quer ir?
              </a>
              <ul class="dropdown-menu bg-azul-escuro">
                <li><a class="dropdown-item menu-dropdown-item" href="#">Sul</a></li>
                <li><a class="dropdown-item menu-dropdown-item" href="#">Sudeste</a></li>
                <li><a class="dropdown-item menu-dropdown-item" href="#">Nordeste</a></li>
                <li><a class="dropdown-item menu-dropdown-item" href="#">Centro Oeste</a></li>
                <li><a class="dropdown-item menu-dropdown-item" href="#">Norte</a></li>
                <li>
                  <hr class="dropdown-divider bg-light ">
                </li>
                <li><a class="dropdown-item menu-dropdown-item" href="#">Pesquisar onde ir</a></li>
              </ul>
            </li>
            <li class="nav-item">
              <a class="nav-link text-menu-hover my-auto" href="#">Contato</a>
            </li>
            <li class="nav-item bt-destaque bt-destaque-escuro my-auto">
              <a class="nav-link  px-2 max-widht" href="#">Cadastre-se</a>
            </li>
            <li class="nav-item bt-destaque bt-destaque-borda my-auto">
              <a class="nav-link px-4 max-widht" href="/frontend 2.0/html/login.html">Login</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  </header>
  <!-- fim do header -->

  <main>
    <section class="user row">
      <div class="foto-perfil col-4">
        <div class="foto">
          <img src="/icons/user_logo.svg" alt="ícone de usuário">
          <h4 class="my-1">Nome: <c:out value="${Usuario.nome}"/></h4>
        </div>
        <div class="perfil-informacoes">
          <h3>Alterar Foto</h3>

          <h3 class="my-1">Email:<c:out value="${Usuario.email}"/></h3>

          <button type="button">Alterar Senha</button>
        </div>
      </div>
      <div class="box-icones col-8">
        <div class="icones">
          <img src="/icons/notification.svg" alt="ícone de notificação">
          <img src="/icons/chat.svg" alt="ícone de chat">
          <img src="/icons/estrela.svg" alt="ícone de notificação">


        </div>
        <button class="editar-dados" type="button">Editar Dados</button>
      </div>
    </section>

  </main>
  <div class="empurra-footer">

  </div>


  <footer class="bg-azul-claro-degrade container-fluid">
    <section class="row text-center">
      <div class="footer-logo col-xl-3">
        <h1>Traveller</h1>
        <p>Aventure-se conosco!</p>
        <div class="footer-icones">
          <img src="/icons/facebook.png" alt="">
          <img src="/icons/twitter.png" alt="">
          <img src="/icons/instagram.png" alt="">
        </div>
      </div>
      <div class="col-xl-2 links">
        <p>Sobre nós</p>
        <p><a href="#">Quem somos?</a></p>
        <p><a href="#">Missão e Valores</a></p>
      </div>
      <div class="col-xl-2 links">
        <p>Suporte</p>
        <p><a href="#">Contato</a></p>
        <p><a href="#">FAQ</a></p>
      </div>
      <div class="col-xl-2 links">
        <p>Comunidade</p>
        <p><a href="#">Contato</a></p>
        <p><a href="#">FAQ</a></p>
      </div>
      <div class="col-xl-2 links">
        <p>Privacidade</p>
        <p><a href="#">Termos de Uso</a></p>
        <p><a href="#">Proteção de dados</a></p>
      </div>
      <p class="text-center mt-2">2022 Traveller, Inc.</p>
    </section>

  </footer>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous">
  </script>

  <!-- <script src="/frontend 2.0/js/usability.js"></script> -->

  <script>
    document.getElementById("go-hospedagem").onclick = function () {
      window.location.href = "http://127.0.0.1:5503/frontend%202.0/html/hospedagem.html"
    };;
  </script>
</body>

</html>