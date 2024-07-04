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

// function savetoDB(data,success,failuer){
//  let netconnection=Math.floor(Math.random()*10)+1;
//  if(netconnection>4){
//   success();
//  }else{
//   failuer();
//  }
// }
// savetoDB('Rahul Roy',()=>{
//  console.log('Success: Your data was saved.')
//  savetoDB('Puchki',()=>{
//   console.log('Success2: Your data was saved')
//   savetoDB('Raj',()=>{
//    console.log('Success3: Your data was saved');
//    savetoDB('Ash',()=>{
//     console.log('Success4: Your data was saved');
//    },()=>{
//     console.log('Failure4: Weak Connection.');
//    })
//   },()=>{
//    console.log('Failure3: Weak Connection.');
//   })
//  },()=>{
//   console.log('Failure2: Weak Connection.')
//  })
// },()=>{
//  console.log('Failure: Weak Connection.')
// })

function savetoDB(data) {
  return new Promise((resolve, reject) => {
    //  Use Promise
    let netconnection = Math.floor(Math.random() * 10) + 1;
    if (netconnection > 4) {
      resolve("Success: Data was saved");
    } else {
      reject("Weak Connection");
    }
  });
}
savetoDB("Apna College")
  .then((result) => {
    console.log("Data 1 was saved"); // Promise Chaining
    console.log("Result of promise :", result);
    return savetoDB("Rahul Roy");
  })
  .then((result) => {
    console.log("Data 2 was saved"); // Promise Chaining
    console.log("Result of promise :", result);
    return savetoDB("Puchki");
  })
  .then((result) => {
    console.log("Data 3 was saved"); // Promise Chaining
    console.log("Result of promise :", result);
    return savetoDB("Raj");
  })
  .then((result) => {
    console.log("Data 4 was saved"); // Promise Chaining
    console.log("Result of promise :", result);
  })
  .catch((error) => {
    console.log("Proise Denied");
    console.log("Error of promise :", error);
  });
