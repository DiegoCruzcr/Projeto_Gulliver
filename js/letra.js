window.onload = function() {
    let pagina = document.querySelector("body");
    let aumentarFonte = document.querySelector("#aumentar");
    let diminuirFonte = document.querySelector("#diminuir");
    
    // Padrão de tamanho, equivale a 100% do valor definido
    let fontSize = 100;
    
    // Valor de incremento ou decremento, equivale a 10% do valor da fonte
    let alternar = 10;

    // Evento de click para aumentar a fonte
    aumentarFonte.addEventListener("click", function(event) {
        fontSize = fontSize + alternar;
        pagina.style.fontSize = fontSize + '%';
    });

    // Evento de click para diminuir a fonte
    diminuirFonte.addEventListener("click", function(event) {
        fontSize = fontSize - alternar;
        pagina.style.fontSize = fontSize + '%';
    });
}