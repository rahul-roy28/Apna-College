import Product from "./product";
function ProductTab() {
  return (
    <>
      <Product
        title="Phone"
        price={24999}
        features={["Fast Charging", "Sony camera sensor"]}
      />
      <Product
        title="Laptop"
        price={54999}
        features={["intel H series Processor", "Backlit Keyboard"]}
      />
      <Product
        title="Head Phone"
        price={4999}
        features={["ANC", "30 hours playback"]}
      />
    </>
  );
}
export default ProductTab;
