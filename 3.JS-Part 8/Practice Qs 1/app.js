// Check if all numbers in our array are multiples of 10 or not.
let arr=[10,20,30,40,50,60];
let newArr=arr.every((el)=>(el%10==0));
console.log(newArr);

// Create a function to find the min number in an array
let num=[7,3,9,2,5,4,8];
let min=num.reduce((min,el)=>{
 if(min<el){
  return min;
 }else{
  return el;
 }
})
console.log(min);