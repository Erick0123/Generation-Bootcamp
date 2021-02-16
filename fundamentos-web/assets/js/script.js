/*
    por tag: getElementByTag()
    por Id: getElementById()
    por nome: getElementByName()
    por classe: getElementByClass()
    por seletor:querySelector()
*/
let nome = window.document.getElementById('nome')
let email = document.querySelector('#email')
let descricao = document.querySelector('#descricao')
let nomeOk = false
let emailOk = false
let descricaoOk = false
let mapa = document.querySelector('#mapa')

nome.style.width = '100%'
email.style.width = '100%'




function validaNome() {
    let txtNome = document.querySelector('#txtNome')
    if (nome.value.length < 3) {
        txtNome.innerHTML = 'Nome inválido'
        txtNome.style.color = "red"
    } else {
        txtNome.innerHTML = 'Nome válido'
        txtNome.style.color = "green"
        nomeOk = true
    }

}
function validaEmail() {
    let txtEmail = document.querySelector('#txtEmail')

    if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
        txtEmail.innerHTML = 'Email inválido'
        txtEmail.style.color = "red"
    } else {
        txtEmail.innerHTML = 'Email válido'
        txtEmail.style.color = "green"
        emailOk = true
    }

}
function validaDescricao() {
    let txtDescricao = document.querySelector('#txtDescricao')

    if (descricao.value.length >= 100) {
        txtDescricao.innerHTML = 'Limite de ate 100 caracteres'
        txtDescricao.style.color = 'red'
        txtDescricao.style.display = 'block'
    } else {
        txtDescricao.style.display = 'none'
        descricaoOk = true
    }
}

function enviar() {
    if (nomeOk == true && emailOk == true && descricaoOk == true) {
        alert('Formulário enviado com sucesso')
    } else {
        alert('Prencha o formulario corretamente antes de enviar...')
    }
}
function mapaZoom() {
    mapa.style.width='800px'
    mapa.style.height='600px'
}
function mapaNormal() {
    mapa.style.width='400px'
    mapa.style.height='250px'
}