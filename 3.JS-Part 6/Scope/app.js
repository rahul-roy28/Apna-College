let sum = 65;// Global scope

function calSum(a,b){
  let sum =a+b; //Function scope
  console.log(sum);
}
calSum(2,3);
console.log(sum)

{
  let a=24;//Block scope
}
console.log(a) // This will not execute