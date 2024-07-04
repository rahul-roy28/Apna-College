const express = require("express");
const methodOverride = require("method-override");
const app = express();
const port = 3000;
const { v4: uuidv4 } = require("uuid");

const path = require("path");
// override with POST having ?_method=POST
app.use(methodOverride("_method"));

app.use(express.urlencoded({ extended: true }));

app.set("view engine", "ejs");
app.set("views", path.join(__dirname, "views"));
app.use(express.static(path.join(__dirname, "/public")));

let posts = [
  {
    id: uuidv4(),
    username: "rahulroy",
    content: "I love coding.",
  },
  {
    id: uuidv4(),
    username: "pujamondal",
    content: "I love biology.",
  },
  {
    id: uuidv4(),
    username: "sajeebbiswas",
    content: "I love cooking.",
  },
  {
    id: uuidv4(),
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
app.get("/posts/:id", (req, res) => {
  let { id } = req.params;
  let post = posts.find((p) => id === p.id);
  res.render("view.ejs", { post });
});

app.post("/posts", (req, res) => {
  let { username, content } = req.body;
  let id = uuidv4();
  posts.push({ id, username, content });
  res.redirect("/posts");
});

app.patch("/posts/:id", (req, res) => {
  let { id } = req.params;
  let newContent = req.body.content;
  let post = posts.find((p) => id === p.id);
  post.content = newContent;
  res.redirect("/posts");
});

app.get("/posts/:id/edit", (req, res) => {
  let { id } = req.params;
  let post = posts.find((p) => id === p.id);
  res.render("edit.ejs", { post });
});

app.delete("/posts/:id", (req, res) => {
  let { id } = req.params;
  posts = posts.filter((p) => id !== p.id);
  res.redirect("/posts");
});

app.listen(port, () => {
  console.log("Listening to port no.:3000");
});
