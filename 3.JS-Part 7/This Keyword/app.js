const student={
 name:'Rahul',
 age:22,
 eng:98,
 math:99,
 science:97,
 marks(){
  let avg=(this.eng+this.math+this.science)/3;
  console.log(avg);
 }
}
student.marks();