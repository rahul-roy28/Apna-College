// Question 1 :

let arr=[1,3,7,2,9]

const arrayAverage=(arr)=>{
 let total=0;
 for (i=0;i<arr.length;i++){
  total+=arr[i];
 }
 return total/arr.length;

}
console.log(arrayAverage(arr));

// Question 2 :

const isEven=(n)=>(n%2==0);
console.log(isEven(3));

// Question 3 :

const object1={
 message:'Hello, World',
 logMessage(){
  console.log(this.message);
 }
};
setTimeout(object.logMessage,1000);

// Question 4 :

let length=4;
function callback(){
 console.log(this.length);
}
const object={
 length:5,
 method(callback){
  callback();
 },
};
