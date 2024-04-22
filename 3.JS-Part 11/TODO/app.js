let inp=document.querySelector('input');
let but=document.querySelector('button');
let ul=document.querySelector('ul');
let lis=document.querySelectorAll('li')

but.addEventListener('click',function(){
 let li=document.createElement('li');
 li.innerText=inp.value;
 
 let del=document.createElement('button');
 del.innerText='Delete';
 del.classList.add('del');
 li.appendChild(del);

 ul.appendChild(li); 
 inp.value='';

 del.addEventListener('click',function(){
  li.remove();
 }) 
});

let de=document.querySelectorAll('.delete');
for(dele of de){
 dele.addEventListener('click',function(){
  let par=this.parentElement
  par.remove();
 })
}