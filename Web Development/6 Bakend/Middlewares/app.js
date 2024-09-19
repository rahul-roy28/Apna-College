const express = require("express");
const app = express();
const ExpressError = require("./ExpressError");

// app.use((req, res, next) => {
//   console.log("Hi, I am the 1st middleware");
//   next();
// });
// app.use((req, res, next) => {
//   console.log("Hi, I am the 2st middleware");
//   next();
// });

// Api token
app.use("/api", (req, res, next) => {
  let { token } = req.query;
  if (token === "giveaccess") {
    next();
  }
  throw new ExpressError(404, "ACCESS DENIED !!!!");
});
app.use("/api", (req, res, next) => {
  res.send("DAta");
  next();
});
// app.use callback
app.use("/random", (req, res, next) => {
  console.log("I am only for random");
  next();
});

// Error

app.use("/err", (req, res) => {
  abcd = abcd;
});

//Activity
app.use("/admin", (req, res) => {
  throw new ExpressError(403, "Access to admin is Forbidden");
});

// Error Handling Middleware
app.use((err, req, res, next) => {
  let { status = 500, message = "Some Error Occurred" } = err;
  res.status(status).send(message);
});
// // Logger
// app.use((req, res, next) => {
//   req.responseTime = new Date(Date.now()).toString();
//   console.log(req.method, req.path, req.responseTime, req.hostname);
//   next();
// });

app.get("/", (req, res) => {
  res.send("I am the Root");
});
app.get("/random", (req, res) => {
  res.send("This is the random page");
});

// // 404
// app.use((req, res) => {
//   res.status(404).send("Page not found!!!!");
// });
app.listen(8080, () => {
  console.log("app is listening to port 8080");
});
