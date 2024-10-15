import { useState } from "react";
let init = () => {
  console.log("Init was called");
  return Math.random();
};
export default function Counter() {
  let [count, setCount] = useState(init);
  console.log("component was rendered");
  function incCount() {
    // setCount(count+1);
    setCount((currCount) => {
      return currCount + 1;
    });
    setCount((currCount) => {
      return currCount + 1;
    });
    // console.log(count);
  }
  return (
    <div>
      <h3>Count = {count}</h3>
      <button onClick={incCount}>Inc Count</button>
    </div>
  );
}
