import "./product.css";
function Product({ title, price = 1, features }) {
  //price =1 for default price
  return (
    <div
      className="Product"
      style={{ backgroundColor: price > 30000 ? "pink" : "" }}
    >
      <h1>{title}</h1>
      <h2>Price: {price}</h2>
      {/* {price >= 30000 ? <p>Discount :20%</p> : null} */}
      {/* {price > 20000 && price < 30000 ? <p>Discount :10%</p> : null} */}
      {price >= 30000 && <p>Discount :20%</p>}
      {price > 20000 && price < 30000 && <p>Discount :10%</p>}
      {price < 10000 && <p>No Discount</p>}
      <p>
        <b>Features: </b>{" "}
        {features.map((feature) => (
          <li>{feature}</li>
        ))}
      </p>
    </div>
  );
}
export default Product;
