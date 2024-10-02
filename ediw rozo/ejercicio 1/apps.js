//const username = document.getElementById('username')
//const btnGreat = document.querySelector('#btnGreat')

//btnGreat.addEventListener('click',great)


// funcion de saludar
//function great() {
//    alert(username.value)  
//
//great()

const username = document.getElementById('nombre')
const data1 = document.getElementById('nota1') 
const data2 = document.getElementById('nota2') 
const data3 = document.getElementById('nota3') 
const bntCalculate = document.getElementById('bntCalculate')
const respone = document.getElementById('resultado') 

bntCalculate.addEventListener('click', calculatenotes)

function calculatenotes(event) {

    event.preventDefault()

    // con esto se canbi el tipo de dato a numerico ,cualquiera de las dos formas son validas
    let nota1 = Number(data1.value)
    let nota2 = parseInt(data2.value)
    let nota3 = Number(data3.value)

    let result = ((nota1 * 0.3)+(nota2 * 0.3)+(nota3 * 0.4)).toFixed(2)
    // las comillas invertidad permiten colocar texto y opreciones 
    respone.style.color = "green"
    respone.textContent = `SR/SRA/SRE ${username.value} su nota definitiva es: ${result}`

    
    
}