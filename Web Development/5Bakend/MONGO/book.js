const mongoose = require("mongoose");

// Connection with mongoDB
main()
  .then(() => {
    console.log("Connection Successful");
  })
  .catch((err) => console.log(err));

async function main() {
  await mongoose.connect("mongodb://127.0.0.1:27017/amazon");

  // use `await mongoose.connect('mongodb://user:password@127.0.0.1:27017/test');` if your database has auth enabled
}

// Schema
const userSchema = new mongoose.Schema({
  Title: {
    type: String,
    require: true,
  },
  Author: {
    type: String,
  },
  Price: {
    type: Number,
    min: [1, "Please enter a valid price"],
  },
  Discount: {
    type: Number,
    default: 0,
  },
  Category: {
    type: String,
    enum: ["fiction", "non-fiction"],
  },
  genre: [String],
});

// Models
const Book = mongoose.model("Book", userSchema);

// Insert Data
const book2 = new Book({
  Title: "Marvel Comic",
  Author: "Stan Lee",
  Price: 400000,
  Category: "fiction",
  genre: [
    "Iron Man",
    "captaim America",
    "Thor",
    "Hulk",
    "Thanose",
    "Black Panther",
  ],
});

book2
  .save()
  .then((res) => {
    console.log(res);
  })
  .catch((err) => {
    console.log(err);
  });
