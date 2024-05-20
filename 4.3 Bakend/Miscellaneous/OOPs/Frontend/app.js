// Factory Function

function personMaker(name, age) {
  const person = {
    name: name,
    age: age,
    talk() {
      console.log(`Hi, my name is ${this.name}`);
    },
  };
  return person;
}
let p1 = personMaker("Rahul", 22);
let p2 = personMaker("Ayeshee", 21);
let p3 = personMaker("Raj", 22);
console.log(p1);
console.log(p2);
console.log(p3);

// New Operator
function Person(name, age) {
  //Constructors:-Doesn't return anything and start with capital
  this.name = name;
  this.age = age;
}
Person.prototype.talk = function () {
  console.log(`Main Hoon ${this.name}`);
};
let p4 = new Person("Rahul", 22);
let p5 = new Person("Ayeshee", 21);
let p6 = new Person("Raj", 22);
console.log(p4);
console.log(p5);
console.log(p6);

// Classes

class Student1 {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }
  talk() {
    console.log(`Main Hoon ${this.name}`);
  }
}
let p7 = new Student1("Rahul", 22);
let p8 = new Student1("Ayeshee", 21);
let p9 = new Student1("Raj", 22);
console.log(p7);
console.log(p8);
console.log(p9);

// Inheritance

class Demo {
  constructor(name, age, subject) {
    this.name = name;
    this.age = age;
  }
  talk() {
    console.log(`Main Hoon ${this.name}`);
  }
}

class Student extends Demo {
  constructor(name, age, marks) {
    super(name, age);
    this.marks = marks;
  }
}
class Teacher extends Demo {
  constructor(name, age, subject) {
    super(name, age);
    this.subject = subject;
  }
}
let i1 = new Student("Rahul", 22, 76);
let i2 = new Student("Ayeshee", 21, 81);
let i3 = new Student("Raj", 22, 89);
console.log(i1);
console.log(i2);
console.log(i3);
