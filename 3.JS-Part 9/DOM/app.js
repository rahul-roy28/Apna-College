// let text=document.querySelector('p');
// text.innerText='Hi! My name is Rahul Roy.';
// text.innerHTML='<b>Hi!</b> My mane is Rahul Roy.'

// console.log(text.innerText);
// console.log(text.innerHTML);
// console.log(text.textContent);

// let heading=document.querySelector('h1');

// heading.innerHTML="<u>SpiderMan</u>"
// heading.innerHTML=`<u>${heading.innerText}</u>`;

// let img=document.querySelector('img');
// console.log(img.getAttribute('src'));
// console.log(img.getAttribute('id'));
// img.setAttribute('id','spiderman');
// img.setAttribute('src',"assets/creation_3.jpeg");

// let links=document.querySelectorAll(".box a");

// for (i=0;i<links.length;i++){
//  links[i].style.color="red";
// }

// for (link of links){
//  link.style.color='red';
// }

// let heading=document.querySelector('h1');

// heading.classList.add('green');
// heading.classList.add('underline');
// heading.classList.add('backgroundcolor');

// heading.classList.remove('backgroundcolor');

// heading.classList.toggle('underline');
// heading.classList.toggle('backgroundcolor');


// Adding Element

// appendChild
let newP=document.createElement('p');
newP.innerText='Hi! My name is Rahul Roy';
let body=document.querySelector('body');
body.appendChild(newP)
let box=document.querySelector('.box');
box.appendChild(newP);
let button=document.createElement('button');
button.innerText='Click me!'
box.appendChild(button);
// append
newP.append(' I am a web developer ')
newP.append(button);
newP.append(' Do not click me.');
// Prepend
let button2=document.createElement('button')
button2.innerText='Click me!'
box.prepend(button2);
box.prepend('Click me ');
// insertAdjacentElement
let btn=document.createElement('button')
btn.innerText='Click me!!!';
let p=document.querySelector('p');
p.insertAdjacentElement("beforebegin",btn);
p.insertAdjacentElement('afterbegin',btn);
p.insertAdjacentElement("beforeend",btn);
p.insertAdjacentElement("afterend",btn);
