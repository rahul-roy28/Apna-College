const express = require("express");
const app = express();
const path = require("path");
const mongoose = require("mongoose");
const Chat = require("./models/chat.js");
const methodOverride = require("method-override");
const ExpressError = require("./ExpressError");

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

app.set("views", path.join(__dirname, "views"));
app.set("view engine", "ejs");
app.use(express.static(path.join(__dirname, "public")));
app.use(express.urlencoded({ extended: true }));
app.use(methodOverride("_method"));

// Index Route
app.get(
  "/chats",
  asyncWrap(async (req, res) => {
    // try {
    let chats = await Chat.find(); //This is a Asyncronus Function
    // console.log(chats);
    res.render("index.ejs", { chats });
    // } catch (err) {
    // next(err);
    // }
  })
);

//New Route
app.get("/chats/new", (req, res) => {
  // throw new ExpressError(404, "Chat not found");
  res.render("new.ejs");
});

// Create Route
app.post("/chats", (req, res) => {
  // try {
  let { from, to, msg } = req.body;
  let newChat = new Chat({
    from: from,
    to: to,
    msg: msg,
    created_at: new Date(),
  });
  newChat
    .save()
    .then((res) => {
      console.log("Chat was saved");
    })
    .catch((err) => {
      console.log(err);
    });
  res.redirect("/chats");
  // } catch (err) {
  //   next(err);
  // }
});
// Use wrapAsync function for error handling
function asyncWrap(fn) {
  return function (req, res, next) {
    fn(req, res, next).catch((err) => next(err));
  };
}

// New -Show Route
// Edit Route
app.get(
  "/chats/:id",
  asyncWrap(async (req, res, next) => {
    // try { (Using try and catch method for error handling)
    let { id } = req.params;
    let chat_id = await Chat.findById(id);
    if (!chat_id) {
      return next(new ExpressError(404, "Chat not found or Delete"));
    }
    res.render("edit.ejs", { chat_id });
    // } catch (err) {
    //   next(err);
    // }
  })
);

// Edit Route
app.get(
  "/chats/:id/edit",
  asyncWrap(async (req, res) => {
    // try {
    let { id } = req.params;
    let chat_id = await Chat.findById(id);
    res.render("edit.ejs", { chat_id });
    // } catch (err) {
    //   next(err);
    // }
  })
);

// Update Route
app.put(
  "/chats/:id",
  asyncWrap(async (req, res) => {
    // try {
    let { id } = req.params;
    let { msg: newMsg } = req.body;
    let updatedChat = await Chat.findByIdAndUpdate(
      id,
      { msg: newMsg },
      { runValidators: true },
      { new: true }
    );
    console.log(updatedChat);
    res.redirect("/chats");
    // } catch (err) {
    //   next(err);
    // }
  })
);

// Delete Route
app.delete(
  "/chats/:id",
  asyncWrap(async (req, res) => {
    // try {
    let { id } = req.params;
    let deletedChat = await Chat.findByIdAndDelete(id);
    console.log(deletedChat);
    res.redirect("/chats");
    // } catch (err) {
    //   next(err);
    // }
  })
);

app.get("/", (req, res) => {
  res.send("Working root");
});

// Error Handling Middleware
app.use((err, req, res, next) => {
  let { status = 500, message = "Some Error Occurred" } = err;
  res.status(status).send(message);
});
app.listen(8080, () => {
  console.log("server is listening on port 8080");
});
