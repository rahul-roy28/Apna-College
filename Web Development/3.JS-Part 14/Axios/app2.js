let url="https://dog.ceo/api/breeds/image/random";


let btn=document.querySelector('button')
btn.addEventListener('click', async ()=>{
 let pic= await getfetch()
 let img=document.querySelector('#para')
 img.setAttribute("src",pic)

})
async function getfetch(){
 try{
  let res=await axios.get(url)
  return res.data.message
  }catch(e){
   console.log("Error--",e)
  }
}