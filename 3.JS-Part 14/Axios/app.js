let url="https://catfact.ninja/fact";


let btn=document.querySelector('button')
btn.addEventListener('click', async ()=>{
 let text= await getfetch()
 let p=document.querySelector('#para')
 p.innerText=text

})
async function getfetch(){
 try{
  let res=await axios.get(url)
  return res.data.fact
  }catch(e){
   console.log("Error--",e)
  }
}
