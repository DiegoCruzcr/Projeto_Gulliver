let btnSenha = document.querySelector ('#senha1');

btnSenha.addEventListener ('click', () => {
    let inputSenha = document.querySelector ('#senha')
    if (inputSenha.getAttribute('type') == 'password') {
        inputSenha.setAttribute('type', 'text')
    } else {
        inputSenha.setAttribute ('type', 'password')
    }
})

let btnConfirmar = document.querySelector ('#senha2');
btnConfirmar.addEventListener ('click', () => {
    let inputSenha = document.querySelector ('#confirmaSenha')
    if (inputSenha.getAttribute('type') == 'password') {
        inputSenha.setAttribute('type', 'text')
    } else {
        inputSenha.setAttribute ('type', 'password')
    }
}) 