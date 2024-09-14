const mongoose = require("mongoose");
const Chat = require("./models/chat.js");

// Connection with mongoDB
main()
  .then(() => {
    console.log("Connection Successful");
  })
  .catch((err) => console.log(err));

async function main() {
  await mongoose.connect("mongodb://127.0.0.1:27017/Whatsapp");

  // use `await mongoose.connect('mongodb://user:password@127.0.0.1:27017/test');` if your database has auth enabled
}

let allchat = [
  {
    from: "Rahul",
    to: "Puja",
    msg: "I Love You",
    created_at: new Date(),
  },
  {
    from: "Hillol",
    to: "Gita",
    msg: "Give me a kiss",
    created_at: new Date(),
  },
  {
    from: "Sajeeb",
    to: "Mona",
    msg: "Come home",
    created_at: new Date(),
  },
  {
    from: "Raj",
    to: "Ayeshee",
    msg: "let's do some naughty things",
    created_at: new Date(),
  },
  {
    from: "Dev",
    to: "Rakhi",
    msg: "Can we meet today?",
    created_at: new Date(),
  },
  {
    from: "Srijan",
    to: "Udita",
    msg: "Come to my room",
    created_at: new Date(),
  },
  {
    from: "Nayan",
    to: "Piyali",
    msg: "Give me a hug",
    created_at: new Date(),
  },
];
Chat.insertMany(allchat)
  .then((res) => {
    console.log(res);
  })
  .catch((err) => {
    console.log(err);
  });
