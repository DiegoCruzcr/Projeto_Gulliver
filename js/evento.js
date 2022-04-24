/* Manipulando o DOM */
const btn = document.querySelector(".btn-pcd");
const pagina = document.querySelector("body");

// Evento de click para ativar e desativar
btn.addEventListener("click", function(){
    pagina.classList.toggle("modo-contraste");
    if(btn.textContent == 'Ativar') {
        btn.textContent = 'Desativar';
    } else {
        btn.textContent = 'Ativar';
    }
});