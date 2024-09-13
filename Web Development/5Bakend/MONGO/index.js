const mongoose = require("mongoose");

// Connection with mongoDB
main()
  .then(() => {
    console.log("Connection Successful");
  })
  .catch((err) => console.log(err));

async function main() {
  await mongoose.connect("mongodb://127.0.0.1:27017/test");

  // use `await mongoose.connect('mongodb://user:password@127.0.0.1:27017/test');` if your database has auth enabled
}

// Schema
const userSchema = new mongoose.Schema({
  name: String,
  email: String,
  age: Number,
});

// Models
const User = mongoose.model("User", userSchema);

// Insert in mongoDB
// const user2 = new User({
//   name: "Hillol Ghosh",
//   email: "hillolg60@gmail.com",
//   age: 22,
// });

// user1.save();

// user2
//   .save()
//   .then((res) => {
//     console.log(res);
//   })
//   .catch((err) => {
//     console.log(err);
//   });

// Inserting Multiple
// User.insertMany([
//   { name: "Sajeeb", email: "sajeeb@gmail.com", age: 22 },
//   { name: "Ayeshee", email: "ash@gmail.com", age: 21 },
//   { name: "Udita", email: "udunath@gmail.com", age: 22 },
//   { name: "Raj", email: "ironraper@gmail.com", age: 23 },
// ]).then((data) => {
//   console.log(data);
// });

// Find in DB
// User.find({ age: { $gte: 23 } }).then((data) => {//find all
//   console.log(data);
// });

// User.findOne({ age: { $gte: 23 } }).then((data) => {
//   //find one
//   console.log(data);
// });

// User.findById("66e3d5b136a66d6d781fde38").then((data) => {
//   //find by ID
//   console.log(data);
// });

// // Update one
// User.updateOne({ name: "Raj" }, { age: 24 }).then((res) => {
//   console.log(res);
// });

// Update many
// User.updateMany({ age: { $gte: 22 } }, { age: 20 }).then((res) => {
//   console.log(res);
// });

// Find one and Update
// User.findOneAndUpdate({ age: 20 }, { age: 24 }, { new: true }).then((res) => {
//   console.log(res);
// });

// find by ID and update
// User.findByIdAndUpdate(
//   "66e3d5b136a66d6d781fde36",
//   { age: 24 },
//   { new: true }
// ).then((res) => {
//   console.log(res);
// });

//*** Delete***
// Delete One
// User.deleteOne({ age: 21 }).then((res) => {
//   console.log(res);
// });

// Delete many
// User.deleteMany({ age: 20 }).then((res) => {
//   console.log(res);
// });

// Find One and Delete
// User.findOneAndDelete({ name: "Sajeeb" }).then((res) => {
//   console.log(res);
// });

// Find by ID and Delete
User.findByIdAndDelete("66e3d34dcc2b0640f326aa49").then((res) => {
  console.log(res);
});
