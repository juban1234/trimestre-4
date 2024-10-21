const body = document.getElementsByTagName("body")[0]
const div = document.querySelector("div")
const span = document.querySelector("span")
const button = document.querySelector("button")

body.addEventListener('click', () => {
  console.log("se hizo clic en el body")
})

div.addEventListener('click', () => {
  console.log("se hizo clic en el div")
})

span.addEventListener('click', () => {
  console.log("se hizo clic en el span")
})

button.addEventListener('click', (event) => {
    event.stopPropagation()
    console.log("se hizo clic en el button")
})