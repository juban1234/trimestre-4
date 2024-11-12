
import { countries } from "../scripts/countries.js";



const makeCountry = (country)=>{
    const container = document.createElement('div')
    container.classList.add('card-country')
    container.addEventListener('mouseenter',showInfo)

    const imgContainer = document.createElement('img')
    imgContainer.src = country.flag
    imgContainer.alt = country.name

    const nameContainer = document.createElement('h2')
    nameContainer.textContent = country.name

    container.appendChild(imgContainer)
    container.appendChild(nameContainer)

    document.querySelector('main > section').appendChild(container)
}

const renderCountries = () =>{
    countries.forEach(country => makeCountry(country))
}

const showInfo = (event)=>{
    let currentCountry =  event.target.children[1].textContent;
    let foundCountry = countries.find(country => country.name === currentCountry )
   
    const Country = document.querySelector('#demographics')
    Country.children[0].textContent = foundCountry.name
    Country.children[1].textContent = foundCountry.capital
    Country.children[2].textContent = foundCountry.population
}

const filter = ( ) =>{
    
}

window.addEventListener('DOMContentLoaded',renderCountries)

// crear filtros por busqueda , pais y por capital