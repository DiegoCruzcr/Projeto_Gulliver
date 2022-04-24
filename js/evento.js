/* Manipulando o DOM */
const btn = document.querySelector("#contraste");
const pagina = document.querySelector("body");

btn.addEventListener("click", function(){
    pagina.classList.toggle("modo-contraste");
    if(btn.textContent == 'Ativar') {
        btn.textContent = 'Desativar';
    } else {
        btn.textContent = 'Ativar';
    }
});