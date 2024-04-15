// Create a program that generates a random number representing a dice roll.[The number should be between 1 and 6].

const dice=Math.floor(Math.random()*6)+1;
console.log(dice);

// Create an object representing a car that stores the following properties for the
//  car:name,model,color.
// Print the car’s name

const car={
  name:'BMW',
  model:'M760Li xDrive',
  color:'Silver'
}
console.log(car.name);

// Create an object Person with their name, age and city.Edit their city’s original value to change it to “New Town”.Add a new property country and set it to the "India".

const person={
  name:'Rahul Roy',
  age:22,
  city:'Kolkata'
};
person.city='New Town';
person.country='India';
console.log(person);