const url = 'https://rickandmortyapi.com/api/character';

let currentPage = 1;

// Función 1: Obtener los personajes desde la API
const getCharacter = async (page = 1, filters = '') => {
    const response = await fetch(`${url}?page=${page}${filters}`);
    const data = await response.json();
    return data; // Devuelve toda la respuesta, incluyendo resultados y metadatos (paginación)
}

// Función 2: Filtrar personajes por nombre
const searchCharacters = async (query) => {
    const filters = filterBySpecies();  // Obtiene los filtros adicionales (por especie)
    const data = await getCharacter(currentPage, `&name=${query}${filters}`);
    return data.results || []; // Devuelve solo los personajes que coinciden con la búsqueda
}

// Función 3: Filtrar personajes por especie seleccionada
const filterBySpecies = () => {
    const filters = [];
    if (document.getElementById('human').checked) filters.push('human');
    if (document.getElementById('alien').checked) filters.push('alien');
    return filters.length ? `&species=${filters.join(',')}` : '';
}

// Función 4: Renderizar los personajes en tarjetas
const renderCards = (characters) => {
    const container = document.getElementById('targets');
    container.innerHTML = '';  // Limpiar el contenido anterior
    characters.forEach(character => createCard(character)); // Llamar a la función para crear cada tarjeta
}

// Función 5: Crear una tarjeta de personaje
const createCard = (character) => {
    const container = document.createElement('div');
    container.classList.add('card');  // Añadir clase para estilo

    const imgCard = document.createElement('img');
    imgCard.src = character.image;
    imgCard.alt = character.name;

    const nameCard = document.createElement('h2');
    nameCard.textContent = `Nombre: ${character.name}`;

    const status = document.createElement('h3');
    status.textContent = `Estado: ${character.status}`;

    const specie = document.createElement('h4');
    specie.textContent = `Especie: ${character.species}`;

    const gender = document.createElement('h4');
    gender.textContent = `Género: ${character.gender}`;

    container.appendChild(imgCard);
    container.appendChild(nameCard);
    container.appendChild(status);
    container.appendChild(specie);
    container.appendChild(gender);

    document.getElementById('targets').appendChild(container);
}

// Función 6: Cargar una página específica de resultados
const loadPage = async (page) => {
    currentPage = page;
    const filters = filterBySpecies();  // Obtiene los filtros seleccionados
    const data = await getCharacter(page, filters);  // Llama a la API con los filtros y la página actual
    renderCards(data.results);  // Muestra los resultados en tarjetas
}

// Función 7: Control de la búsqueda en tiempo real
const handleSearch = async () => {
    const query = document.getElementById('nombres').value.trim();
    const characters = query ? await searchCharacters(query) : await getCharacter(currentPage);
    renderCards(characters);
}

// Función 8: Configuración de eventos (escuchar entradas de usuario)
const setupEventListeners = () => {
    // Evento para realizar la búsqueda en tiempo real
    document.getElementById('nombres').addEventListener('input', handleSearch);
    
    // Eventos para manejar la paginación
    document.getElementById('prevPage').addEventListener('click', () => {
        if (currentPage > 1) loadPage(currentPage - 1);
    });

    document.getElementById('nextPage').addEventListener('click', () => {
        loadPage(currentPage + 1);
    });
}

// Función 9: Cargar personajes cuando la página se carga por primera vez
window.addEventListener('DOMContentLoaded', async () => {
    const data = await getCharacter(currentPage);
    renderCards(data.results);
    setupEventListeners();  // Configurar los eventos al cargar la página
});
