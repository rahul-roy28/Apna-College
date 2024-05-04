// Getting started with Express

const express = require("express");
const app = express();
let port = 3000;
app.listen(port, () => {
  console.log(`app listening at port ${port}`);
});

// Handling Request

// app.use((req,res)=>{
//  console.log("new incoming request")
//  // res.send({
//  //  Name:"Rahul",
//  //  Roll:44,
//  //  Dept:"ECE"
//  // })
//  res.send("<h1>About</h1> <ul><li>Rahul Roy</li><li>ECE2021044</li></ul>")
// });

// Routing

// app.get("/",(req,res)=>{
//  res.send({
//   name:"Fruits"
//  })
// })
// app.get("/apple",(req,res)=>{
//  res.send({
//   name:"Apple",
//   color:"Red"
//  })
// })
// app.get("/orange",(req,res)=>{
//  res.send({
//   name:"Orange",
//   color:"Orange"
//  })
// })
// app.get("/mango",(req,res)=>{
//  res.send({
//   name:"Mango",
//   color:"yellow"
//  })
// })
// app.get("/coconut",(req,res)=>{
//  res.send({
//   name:"Coconut",
//   color:"Green"
//  })
// })
// app.get("*",(req,res)=>{
//  res.send("This page does not exist")
// })

// Path Parameters

app.get("/:username/:id", (req, res) => {
  let { username, id } = req.params;
  console.log(username, id);
  res.send(`Welcome to the page of @${username}.`);
});

// Query Strings
app.get("/search", (req, res) => {
  let { q } = req.query;
  res.send(`Search result for query ${q}`);
});
