//const username = document.getElementById('username')
//const btnGreat = document.querySelector('#btnGreat')

//btnGreat.addEventListener('click',great)


// funcion de saludar
//function great() {
//    alert(username.value)  
//
//great()


// tarea
// Tarea1:
// Realiza una función que:
// si la nota definitiva es menor a 3.5 debe informar al usuario que perdió la materia en color negro
// si la nota definitiva es está entre 3.5 y 4.5 debe informar al usuario que ganó la materia en color naranja
// si la nota definitiva es mayor a 4.5 debe informar al usuario que su nota es sobresaliente en color verde.

// Tarea2:

// Al dar click en el botón predecir, el sistema deberá agregar de manera automática la nota mínima en el input
// de la nota3(Dícese de nota mínima la nota que debe sacar para que su definitiva quede en 3.5)

const username = document.getElementById('nombre')
const data1 = document.getElementById('nota1') 
const data2 = document.getElementById('nota2') 
const data3 = document.getElementById('nota3') 
const bntCalculate = document.getElementById('bntCalculate')
const bntPredict = document.getElementById('bntPredict')
const respone = document.getElementById('resultado') 
const respone2 = document.getElementById('resultado2') 


bntCalculate.addEventListener('click', calculatenotes)
bntPredict.addEventListener('click',prediction)

function calculatenotes(event) {

    event.preventDefault()

    // con esto se canbi el tipo de dato a numerico ,cualquiera de las dos formas son validas
    let nota1 = Number(data1.value)
    let nota2 = Number(data2.value)
    let nota3 = Number(data3.value)

    let result = ((nota1 * 0.3)+(nota2 * 0.3)+(nota3 * 0.4)).toFixed(2)
    // las comillas invertidad permiten colocar texto y opreciones 
    respone.style.color = "green"
    respone.textContent = `SR/SRA/SRE ${username.value} su nota definitiva es: ${result}`  
    validatenotes(result)
}

function validatenotes(result) {
    if (result > 4.5) {
        respone2.style.color = "green"
        respone2.textContent = `gano superior: ${result}`   
    } else if (result >= 3.5 && result <= 4.5){
        respone2.style.color = "orange"
        respone2.textContent = `gano : ${result}`
    }else{
        respone2.style.color = "black"
        respone2.textContent =`perdio la materia: ${result}`
    }
}

function prediction(event) {
    event.preventDefault()
    let nota1 = Number(data1.value)
    let nota2 = Number(data2.value)
    let result = ((3.5 - (nota1 * 0.3) - (nota2 * 0.3))/0.4).toFixed(2)

    respone.textContent = `la nota minima que necesita para aprobar con 3.5 es de :  ${result}`
}