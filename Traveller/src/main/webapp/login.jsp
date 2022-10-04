<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="Pt-BR">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Nosso CSS -->
    <link rel="stylesheet" href="./assets/css/login.css">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <!-- Google Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300&display=swap" rel="stylesheet">
    <script src="https://accounts.google.com/gsi/client" async defer></script>
    <script src="https://unpkg.com/jwt-decode/build/jwt-decode.js"></script>
    <script src="./assets/js/main.js"></script>
    <title>Login</title>
</head>

<body>
    <article class="container">
        <section>
            <figure class="text-center">
                <img id="logo-login" src="/assets/images/traveller-logo.svg" alt="">
            </figure>
        </section>

        <section class="fundo-branco">
            <div class="text-center">
                <h3 class="display-5 lead">Login</h3>
            </div>

            <form action="./login" method="POST">
                <div class="mb-3">
                    <label for="email" class="form-label">E-mail:</label>
                    <input type="email" class="form-control" id="email" name = "email" placeholder="Digite seu e-mail">
                </div>

                <div class="mb-3">
                    <label for="password" class="form-label">Senha:</label>
                    <input type="password" class="form-control" id="password" name="password" placeholder="Digite sua senha">
                </div>

                <div class="form-check mb-3">
                    <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                    <label class="form-check-label" for="flexCheckDefault">
                      Manter conectado
                    </label>
                  </div>

                  <div class="text-center">
                    <button class="btn-login">
                        Entrar
                    </button>
                </div>
            </form>

            <section class="cadastro">
                <p>Não tem conta? <a class="cadastro-destaque" href="cadastro.html">Cadastre-se</a></p>
            </section>

            <section class="text-center">
                <h4 class="mt-4">Outras Formas de Login</h4>
                <div id="buttonDiv"></div>
            </section>
        </section>
    </article>
</body>

</html>