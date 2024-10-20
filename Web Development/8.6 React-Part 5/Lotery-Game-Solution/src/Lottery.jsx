import { useState } from "react";
import { getNumber, sum, winning } from "./helper";
import "./Lottery.css";

export default function Lottery() {
  let [ticket, setTicket] = useState("");
  let [message, setMessage] = useState("");
  // let isWinnung = sum(ticket);
  let generateTicket = () => {
    let tic = getNumber(3);
    setTicket(tic);
    let s = sum(tic);
    setMessage(winning(s));
  };

  return (
    <div className="lottery-container">
      <h1 className="title">Lottery Game</h1>
      <button onClick={generateTicket} className="generate-button">
        Generate Lottery Ticket
      </button>
      <div>
        <h2 className="ticket">
          Your Ticket:<span>{ticket[0]}</span>
          <span>{ticket[1]}</span>
          <span>{ticket[2]}</span>
        </h2>
      </div>
      {message && <p className="message">{message}</p>}
    </div>
  );
}
