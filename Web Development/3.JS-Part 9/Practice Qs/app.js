// (i) a <p> with red text that says "Hay I'm red!"
let p=document.createElement('p');
p.innerText="Hey I'm red!";
document.querySelector('body').append(p);
p.classList.add("red")

// (ii) a <h3> with blue text that says "I'm a blue h3!"
let h3=document.createElement('h3');
h3.innerText="I'm a blue h3!";
document.querySelector('body').append(h3);
h3.classList.add("blue")

// (iii) a <div> with a black border and pink background color with the folowing elements inside of it : [: another <h1> that says "I'm in a div". : a <p> that says "ME TOO!"]
let div=document.createElement('div');
let h1=document.createElement('h1');
let p1=document.createElement('p');

h1.innerText="I'm in a div";
p1.innerText="ME TOO!";
div.append(h1);
div.append(p1);
div.classList.add("box");
document.querySelector('body').append(div);
