 async function greed(){
 return "Hello World";
}
greed()
.then((result)=>{
 console.log('Promise was resolved');

})
.catch(()=>{
 console.log("Failed")
})