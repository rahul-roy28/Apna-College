const express = require("express");
const app = express();
const path = require("path"); //Host from parent folder

let port = 3000;

// app.use(express.static('public'))
app.use(express.static(path.join(__dirname, "public")));
app.set("view engine", "ejs"); //Using EJS
app.set("views", path.join(__dirname, "/views")); // Views directory (Host from parent folder)
app.get("/", (req, res) => {
  res.render("home.ejs"); //Using EJS
});

// Passing data to EJS
app.get("/rolldice", (req, res) => {
  let num = Math.floor(Math.random() * 6) + 1;
  res.render("rolldice.ejs", { rolldice: num });
});
app.get("/main", (req, res) => {
  res.send("main");
});
// Instagram EJS

app.get("/ig/:username", (req, res) => {
  let { username } = req.params;
  const instaData = require("./data.json");
  const data = instaData[username];
  if (data) {
    res.render("instagram.ejs", { data });
  } else {
    res.render("error.ejs");
  }
});

app.listen(port, () => {
  console.log(`Listening on port ${port}`);
});
