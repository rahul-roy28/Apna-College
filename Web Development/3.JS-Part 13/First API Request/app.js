let url="https://catfact.ninja/fact";

// Using then & catch

// fetch(url)
// .then((res)=>{
//  return res.json()
// })
// .then((data1)=>{
//  console.log("Data 1:",data1.fact);
// return fetch(url)
// })
// .then((res)=>{
//  return res.json()
// })
// .then((data2)=>{
//  console.log("Data 2:",data2.fact)
// })
// .catch((err)=>{
//  console.log("Error--",err)
// })

// Using async & await
async function getfetch(){
 try{
  let res=await fetch(url)
  let data=await res.json()
  console.log(data.fact)
  }catch(e){
   console.log("Error--",e)
  }
}
getfetch()