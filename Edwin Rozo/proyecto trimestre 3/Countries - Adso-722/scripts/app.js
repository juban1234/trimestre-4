// <!-- <div class="card-country">
// <img src="assets/images/flags/Colombia.jpeg" alt="colombia">
// <h2>colombia</h2>
// </div>


const makeCountry = (country)=>{
    const container = document.createElement('div')
    container.classList.add('card-country')

    const imgContainer = document.createElement('img')
    imgContainer.src = country.flag
    imgContainer.alt = country.name

    const nameContainer = document.createElement('h2')
    nameContainer.textContent = country.name

    container.appendChild(imgContainer)
    container.appendChild(nameContainer)

    document.querySelector('main > section').appendChild(container)
}