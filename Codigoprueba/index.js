function getCharacters(done){
    fetch("https://rickandmortyapi.com/api/character")
        .then(response => response.json())
        .then(data => {
            done(data.results)
        });
}
getCharacters(data => {
    data.forEach(personaje => {
        const article=document.createRange().createContextualFragment(
            `
            <article>
                <div class="imagen">
                    <img src="${personaje.image}" alt="Personaje">
                 </div>
                <h2>${personaje.name}</h2>
                <span>${personaje.status}</span>
            </article>
            `
        );
        const main = document.querySelector("main");
        main.append(article);
    });
});
var nombre = 'Grover';
var edad = 11;

if(edad < 12){
    console.log(nombre + ' es un niño.');
}else if((edad > 11)&&(edad < 18)){
    console.log(nombre + ' es un adolescente.');
}else if((edad > 17)&&(edad < 60)){
    console.log(nombre + ' es un adulto.');
}else{
    console.log(nombre + ' es un anciano.');
}

let hora = 15;
if (hora > 0 && hora < 6){
    console.log("Dejame dormir");
}else if(hora > 5 && hora < 12){
    console.log("Buenos dias");
}else if(hora > 11 && hora < 19){
    console.log("Buenas tardes");
}else{
    console.log("Buenas noches");
}