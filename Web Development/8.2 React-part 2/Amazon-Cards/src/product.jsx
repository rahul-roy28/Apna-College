import "./product.css";
import Price from "./Price.jsx";
function Product({ title, idx, features }) {
  let oldPrice = ["₹4,999", "₹2,499", "₹11,999", "₹4,999"];
  let newPrice = ["₹799", "₹699", "₹1,199", "₹999"];
  return (
    <div className="Product">
      <h4>{title}</h4>
      <p>
        {features.map((feature) => (
          <li>{feature}</li>
        ))}
      </p>
      <Price oldPrice={oldPrice[idx]} newPrice={newPrice[idx]} />
    </div>
  );
}
export default Product;
