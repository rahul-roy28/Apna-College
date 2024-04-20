let btn=document.querySelectorAll('button');
for (buttons of btn){
 // buttons.onclick=hello; //DOM events
 // buttons.onmouseenter=function(){   ////DOM events
 //  console.log('Nice to meet you!')
 // }
 // buttons.addEventListener("click",me)
 // buttons.addEventListener("click",hello)
 buttons.addEventListener("dblclick",i)
}
function hello(){
 alert("Hello");
}
function me(){
 alert("me");
}
function i(){
 alert("i");
}