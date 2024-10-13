import "./App.css";
import Title from "./Title.jsx";
import Product from "./product.jsx";
import ProductTab from "./producttab.jsx";
import MsgBox from "./MsgBox.jsx";
function Description() {
  return <h3>I am the Description !</h3>;
}
function App() {
  return (
    <>
      <MsgBox userName="Rahul" textColor="red" />
      <ProductTab />
    </>
  );
}
export default App;
