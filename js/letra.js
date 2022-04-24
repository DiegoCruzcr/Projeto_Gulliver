window.onload = function() {
    var elementBody = document.querySelector("body");
    var elementBtnIncreaseFont = document.querySelector("#aumentar");
    var elementBtnDecreaseFont = document.querySelector("#diminuir");
    
    // Padrão de tamanho, equivale a 100% do valor definido
    var fontSize = 100;
    
    // Valor de incremento ou decremento, equivale a 10% do valor da fonte
    var increaseDecrease = 10;

    // Evento de click para aumentar a fonte
    elementBtnIncreaseFont.addEventListener("click", function(event) {
        fontSize = fontSize + increaseDecrease;
        elementBody.style.fontSize = fontSize + '%';
    });

    // Evento de click para diminuir a fonte
    elementBtnDecreaseFont.addEventListener("click", function(event) {
        fontSize = fontSize - increaseDecrease;
        elementBody.style.fontSize = fontSize + '%';
    });
}