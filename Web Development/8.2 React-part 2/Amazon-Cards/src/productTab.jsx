import Product from "./product";
function ProductTab() {
  let styles = {
    display: "flex",
    flexWrap: "wrap",
    justifyContent: "center",
    alignItems: "center",
  };
  return (
    <div style={styles}>
      <Product
        title="boAt Airdopes 311 Pro"
        idx={0}
        features={["Transparent design", "50hrs Playtime"]}
      />
      <Product
        title="Boult K10"
        idx={1}
        features={["50H Playtime", "4 Mics Calling"]}
      />
      <Product
        title="Firbeoltt Phoenix Pro"
        idx={2}
        features={["1.39 Round dial", "AI Voice assistant"]}
      />
      <Product
        title="Noise Twist"
        idx={3}
        features={["1.38 TFT display", "Up to 7 days battery"]}
      />
    </div>
  );
}
export default ProductTab;
