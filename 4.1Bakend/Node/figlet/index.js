let figlet = require("figlet");

figlet("My name is Rahul Roy", function (err, data) {
 if (err) {
   console.log("Something went wrong...");
   console.dir(err);
   return;
 }
 console.log(data);
});