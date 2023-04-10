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