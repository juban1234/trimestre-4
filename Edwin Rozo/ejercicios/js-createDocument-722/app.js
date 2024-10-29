
import { environments } from "./environment.js"


window.addEventListener('DOMContentLoaded',makeCards)



function makeCard(card) {
    
    const container = document.createElement('div')
    container.id = 'card'
    container.classList.add('card')

    const imgcard = document.createElement('img')
    imgcard.src = card.img
    imgcard.alt = card.description

    const titleCard = document.createElement('h2')
    titleCard.textContent = card.title

    const descriptionCard = document.createElement('p')
    descriptionCard.textContent = card.description

    container.appendChild(imgcard)
    container.appendChild(titleCard)
    container.appendChild(descriptionCard)

    document.querySelector('main').appendChild(container)

}

function makeCards() {
    environments.forEach(card => makeCard(card))
    
}