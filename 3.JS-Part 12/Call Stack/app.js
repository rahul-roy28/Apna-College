// // Call Stack

// function hello(){
//  console.log('hello function')
//  console.log('Hello')
// }

// function demo(){
//  console.log('demo function')
//  hello();
// }

// console.log('Calling Demo function')
// demo()
// console.log('Demo was executed');


// // Visualizing Call Stack

// function one(){
//  return 1;
// }

// function two(){
//  return one()+one();
// }

// function three(){
//  let ans =one()+two();
//  console.log(ans);
// }
// three();

// Setting up for Promises

function savetoDB(data,success,failuer){
 let netconnection=Math.floor(Math.random()*10)+1;
 if(netconnection>4){
  success();
 }else{
  failuer();
 }
}
savetoDB('Rahul Roy',()=>{
 console.log('Success: Your data was saved.')
 savetoDB('Puchki',()=>{
  console.log('Success2: Your data was saved')
  savetoDB('Raj',()=>{
   console.log('Success3: Your data was saved');
   savetoDB('Ash',()=>{
    console.log('Success4: Your data was saved');
   },()=>{
    console.log('Failure4: Weak Connection.');
   })
  },()=>{
   console.log('Failure3: Weak Connection.');
  })
 },()=>{
  console.log('Failure2: Weak Connection.')
 })
},()=>{
 console.log('Failure: Weak Connection.')
})