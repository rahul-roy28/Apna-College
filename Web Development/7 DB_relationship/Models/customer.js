const mongoose = require("mongoose");
const { Schema } = mongoose;

main()
  .then(() => {
    console.log("Connection Successful");
  })
  .catch((err) => console.log(err));

async function main() {
  await mongoose.connect("mongodb://127.0.0.1:27017/relationDemo");

  // use `await mongoose.connect('mongodb://user:password@127.0.0.1:27017/test');` if your database has auth enabled
}

const orderSchema = new Schema({
  item: String,
  price: Number,
});

const customerSchema = new Schema({
  name: String,
  Orders: [
    {
      type: Schema.Types.ObjectId,
      ref: "Order",
    },
  ],
});
const Order = mongoose.model("Order", orderSchema);
const Customer = mongoose.model("Customer", customerSchema);

const addCustomer = async () => {
  // let cus1 = new Customer({
  //   name: "Hillol",
  // });
  // let order1 = await Order.findOne({ item: "Chips" });
  // let order2 = await Order.findOne({ item: "Chocolate" });
  // cus1.Orders.push(order1);
  // cus1.Orders.push(order2);

  // let result = await cus1.save();
  // console.log(result);
  let result = await Customer.find({}).populate("Orders");
  console.log(result[0]);
};

addCustomer();
// const addOrder = async () => {
//   let res = await Order.insertMany([
//     { item: "Samosa", price: 20 },
//     { item: "Chips", price: 10 },
//     { item: "Chocolate", price: 100 },
//   ]);
//   console.log(res);
// };
// addOrder();
