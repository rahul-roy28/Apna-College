let h1=document.querySelector('h1')
function colorChange(color,delay){
 return new Promise((resolve,reject)=>{
  setTimeout(()=>{
   let num=Math.floor(Math.random()*10)+1;
   
   if(num>5){
    reject('Promise rejected')
   }
   
   h1.style.color=color;
   console.log(`The num is ${num}. Color was changed with ${color} color`)
   resolve('color changed');  
  },delay)


 })
}

async function demo(){
 try{
  await colorChange('red',2000);
  await colorChange('green',2000);
  await colorChange('blue',2000);
  await colorChange('yellow',2000);
  await colorChange('violet',2000);
  
 }catch(err){
  console.log(err);
  console.log('Error catched')
 }

 let a=5;
 console.log(a);
 console.log(`New num :`,a+2)
}
demo();