let input=document.querySelector('input');
input.addEventListener('keyup',function(event){
 console.log('key was pressed');
 console.log(event.code)
 console.log(event.key)
})