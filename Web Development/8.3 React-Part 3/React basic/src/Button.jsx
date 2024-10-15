function handleClick() {
  console.log("Hello World!");
}
function handleMouseOver() {
  console.log("Bye!");
}
function handleDblClick() {
  console.log("Double Clicked");
}

export default function Button() {
  return (
    <div>
      <button onClick={handleClick}>Click me</button>
      <p onMouseOver={handleMouseOver}>My name is Rahul Roy.</p>
      <button onDoubleClick={handleDblClick}>Double Click Me</button>
    </div>
  );
}
