// Question 1
// Square and sum the array elements using the arrow function and then find the average of the array.
let arr=[2,7,4,9,2,5,6]
let square=arr.map((el)=>{
 return el*el;
});
console.log(square);
let sum=arr.reduce((ac,el)=>{
 return ac+el;
})
console.log(sum);
let average=sum/arr.length;
console.log(average);

// Question 2
// Create a new array using the map function whose each element is equal to the original element plus 5.
let newArr=arr.map((el)=>{
 return el+5;
})
console.log(newArr);

// Question 3
// Create a new array whose elements are in uppercase of words present in the original array.
let name=['Rahul','Puja','Ayeshee','Rajorshi'];
let newName=name.map((words)=>{
 return words.toUpperCase()}
);
console.log(newName);

// Question 4
// Write a function called double And Return Args which accepts an array and a variable number of arguments.The function should return a new array with the original array values and all of the additional arguments doubled.


