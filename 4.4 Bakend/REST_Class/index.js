const express = require("express");
const app = express();
const port = 3000;

const path = require("path");

app.use(express.urlencoded({ extended: true }));

app.set("view engine", "ejs");
app.set("views", path.join(__dirname, "views"));
app.use(express.static(path.join(__dirname, "public")));

let posts = [
  {
    username: "rahulroy",
    content: "I love coding.",
  },
  {
    username: "pujamondal",
    content: "I love biology.",
  },
  {
    username: "sajeebbiswas",
    content: "I love cooking.",
  },
  {
    username: "hillolghosh",
    content: "I love gameing.",
  },
];

app.get("/posts", (req, res) => {
  res.render("index.ejs", { posts });
});

app.get("/posts/new", (req, res) => {
  res.render("new.ejs");
});

app.post("/posts", (req, res) => {
  let { username, content } = req.body;
  posts.push({ username, content });
  res.redirect("/posts");
});
app.listen(port, () => {
  console.log("Listening to port no.:3000");
});
