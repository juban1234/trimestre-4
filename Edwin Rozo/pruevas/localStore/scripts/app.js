import { data } from "./data.js" 

const crearTargeta = (contenido) => {
    const almacenamiento = document.createElement('div')

    const nombre = document.createElement('p')  
    nombre.classList.add('nombre')
    nombre.textContent = `Nombre del producto: ${contenido.nombre}`

    const stock = document.createElement('p') 
    stock.classList.add('stock')
    stock.textContent = `Número del producto: ${contenido.stock}`

    almacenamiento.appendChild(nombre)
    almacenamiento.appendChild(stock)

}

const renderizar = () => {


    Object.values(data.categorias).forEach(producto => {
        crearTargeta(producto)  
        console.log(1);
        
    })
}


window.addEventListener('DOMContentLoaded', renderizar)
