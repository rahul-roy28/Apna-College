let form=document.querySelector('form');

form.addEventListener('submit',function(event){
 event.preventDefault();
 
 // let user=document.querySelector('#user');
 // let pass=document.querySelector('#pass');

 let user=this.elements[0]; //form.elements[0]
 let pass=this.elements[1]; //form.elements[1]

 console.log(`Username = ${user.value}`);
 console.log(`Password = ${pass.value}`);

 alert(`Hi ${user.value}! Your password is ${pass.value}`);
})
let inp=document.querySelector('#text');
let p=document.querySelector('p');
inp.addEventListener('input',function(){
 console.log(inp.value);
 p.innerText=inp.value;
})