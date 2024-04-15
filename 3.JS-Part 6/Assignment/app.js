// Q1 : Write a JavaScript function that returns array elements larger than a number
let arr=[1,6,9,2,3,8,4,7];
let num=5;

function largerarray(arr,num){
 for (i=0;i<=arr.length;i++){
  if(arr[i]>num){
   console.log(arr[i]);
  }
 }
}
largerarray(arr,num);