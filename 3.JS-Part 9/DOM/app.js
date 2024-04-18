let p=document.querySelector('p');
let id=document.querySelector('#mainImg');
let clas=document.querySelector('.box');
let all_p=document.querySelectorAll("p");

console.log(p);
console.log(id);
console.log(clas);
console.log(all_p);

let img=document.querySelector('img');
console.log(img);
let a=img.getAttribute('id');
console.log(a);

img.setAttribute('id','spidermanImg');
img.setAttribute('src',"assets/creation_3.jpeg")

img.setAttribute('class','images');
img.getAttribute('class');
