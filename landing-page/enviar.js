let email = document.querySelector('#email')
let assunto = document.querySelector('#assunto')
let emailOk = false
let assuntoOk = false

function validaEmail() {
    let txtEmail = document.querySelector('#txtEmail')
    if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1){
        txtEmail.innerHTML='Email Inválido'
        txtEmail.style.color='red'
    }else{
        txtEmail.innerHTML='Email Válido'
        txtEmail.style.color='green'
        emailOk=true
    }
}
function validaAssunto(){
    let txtAssunto=document.querySelector('#txtAssunto')
    if(assunto.value.lenght>=5){
        txtAssunto.innerHTML='Somente até 200 caracteres...'
        txtAssunto.style.color='red'
        txtAssunto.style.display='block'
    }else{
        txtAssunto.style.display='none'
        assuntoOk=true
    }
}
function enviar(){
    if(emailOk==true || assuntoOk==true){
        alert('Enviado')
    }else{
        alert('Preencha corretamente')
    }
}