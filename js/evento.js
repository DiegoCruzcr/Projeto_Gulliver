const btn = document.querySelector(".btn-pcd");
const pagina = document.querySelector("body");
const rodape = document.querySelector("footer");

// Evento de click para ativar e desativar
btn.addEventListener("click", function(){
    pagina.classList.toggle("modo-contraste");
});

btn.addEventListener("click", function(){
    rodape.classList.toggle("rodape-contraste"); 
});