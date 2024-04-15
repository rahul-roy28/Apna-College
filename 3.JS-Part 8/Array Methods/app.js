//(1).foeEach

let arr=[1,4,7,9];
// Method 1
console.log('Method 1');
function input(el){
 console.log(el);
}
arr.forEach(input);
// Method 2
console.log('Method 2');
arr.forEach((el)=>{
console.log(el);
})

// (2).map

let newArr=arr.map((el)=>{
 return el*2;
});
console.log(newArr);
// Using Object
const student=[{
 name:'Rahul',
 marks:98
},
{
 name:'Ayeshee',
 marks:94
},
{
 name:'Rajorshi',
 marks:99
}]

let newStudent=student.map((el)=>{
 return el.marks/10;
});
console.log(newStudent);

// (3).filter 

let nums=[0,1,2,3,4,5,6,7,8,9];
let even=nums.filter((el)=>(el%2==0));//Even Number
console.log(even);
let odd=nums.filter((el)=>(el%2!=0));//Odd Number
console.log(odd);

// (4).every

let a=[1,2,3,4,5,6];
let b=a.every((el)=>(el%2==0));//output will be false because all the array elements are not even
console.log(b);
let c=[2,4,6];
let d=c.every((el)=>(el%2==0));//output will be true because all the array elements are even
console.log(d);

// (5).some

let e=[1,2,3,4,5,6];
let f=e.some((el)=>(el%2==0));//output will be true because some of the array elements are even
console.log(f);
let g=[1,3,5,7];
let h=g.some((el)=>(el%2==0));//output will be false because none of the array elements is even
console.log(h);

// (6).reduce 

let i=[1,2,3,4,9,12,19,24,13,16];
let newi=i.reduce((Ac,el)=>(Ac+el));
console.log(newi);
// Using reduce find the maximum element of an array
let max=i.reduce((max,el)=>{
 if(max>el){
  return max;
 }else{
  return el;
 }
});
console.log(max);