import { useState } from "react";

export default function LudoBoard() {
  let [moves, setMoves] = useState({ blue: 0, yellow: 0, red: 0, green: 0 });
  let updateBlue = () => {
    setMoves((prevMoves) => {
      return { ...prevMoves, blue: prevMoves.blue + 1 };
    });
  };
  let updateYellow = () => {
    setMoves((prevMoves) => {
      return { ...prevMoves, yellow: prevMoves.yellow + 1 };
    });
  };
  let updateRed = () => {
    setMoves((prevMoves) => {
      return { ...prevMoves, red: prevMoves.red + 1 };
    });
  };
  let updateGreen = () => {
    setMoves((prevMoves) => {
      return { ...prevMoves, green: prevMoves.green + 1 };
    });
  };
  return (
    <div>
      <p>Game Begin</p>
      <div className="board">
        <p>Blue Moves = {moves.blue}</p>
        <button
          style={{ backgroundColor: "blue", color: "aqua" }}
          onClick={updateBlue}
        >
          +1
        </button>
        <p>Yellow Moves ={moves.yellow} </p>
        <button
          style={{ backgroundColor: "yellow", color: "black" }}
          onClick={updateYellow}
        >
          +1
        </button>
        <p>Red Moves ={moves.red} </p>
        <button
          style={{ backgroundColor: "red", color: "black" }}
          onClick={updateRed}
        >
          +1
        </button>
        <p>Green Moves ={moves.green} </p>
        <button
          style={{ backgroundColor: "green", color: "black" }}
          onClick={updateGreen}
        >
          +1
        </button>
      </div>
    </div>
  );
}
