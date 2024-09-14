const mongoose = require("mongoose");

// Schema
const userSchema = new mongoose.Schema({
  from: {
    type: String,
    require: true,
  },
  to: {
    type: String,
    require: true,
  },
  msg: {
    type: String,
    maxLength: 100,
  },
  created_at: {
    type: Date,
    require: true,
  },
});

// Models
const Chat = mongoose.model("Chat", userSchema);

//Export Module
module.exports = Chat;
