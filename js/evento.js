const btn = document.querySelector(".btn-pcd");
const pagina = document.querySelector("body");

// Evento de click para ativar e desativar
btn.addEventListener("click", function(){
    pagina.classList.toggle("modo-contraste");
    if(btn.textContent == 'Ativar Contraste') {
        btn.textContent = 'Desativar Contraste';
    } else {
        btn.textContent = 'Ativar Contraste';
    }
});