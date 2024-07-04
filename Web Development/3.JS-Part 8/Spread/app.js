let arr=[1,2,3,4,5,6,7,8,9,0]
let newarr=[...arr]
console.log(newarr);
let str=[...'Hello'];
console.log(str);

let odd=[1,3,5,7,9]
let even=[2,4,6,8,0]
console.log([...odd,...even]);

const student={
 name:'Rahul Roy',
 roll:44
}
const newstudent={...student,college:'RCCIIT'}
console.log(newstudent);

let a=[2,46,87,23,7,9,4,26,7,8,1,]
let aa={...a}
console.log(aa)

let b='Rahul Roy'
let bb={...b}
console.log(bb)