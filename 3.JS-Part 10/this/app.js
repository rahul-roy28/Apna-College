let h1=document.querySelector('h1');
let h2=document.querySelector('h2');
let h3=document.querySelector('h3');
let btn=document.querySelector('button');

function colorchange(){
 console.log(this.innerText);
 this.style.backgroundColor='blue';
}
h1.addEventListener('click',colorchange);
h2.addEventListener('click',colorchange);
h3.addEventListener('click',colorchange);
btn.addEventListener('click',colorchange);

// h1.addEventListener('click',function(){
//  console.log(this.innerText);
//  h1.style.backgroundColor='blue';
// })

// h2.addEventListener('click',function(){
//  console.log(this.innerText);
//  h2.style.backgroundColor='blue';
// })

// h3.addEventListener('click',function(){
//  console.log(this.innerText);
//  h3.style.backgroundColor='blue';
// })

// btn.addEventListener('click',function(){
//  console.log(this.innerText);
//  btn.style.backgroundColor='blue';
// })


// let but=document.createElement('button');
// but.innerText='Click me!';
// h1.append(but);