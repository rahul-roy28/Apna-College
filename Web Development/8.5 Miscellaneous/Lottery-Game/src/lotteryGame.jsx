import React, { useState } from "react";
import "./lotteryGame.css";

const LotteryGame = () => {
  const [ticket, setTicket] = useState("");
  const [message, setMessage] = useState("");

  const generateTicket = () => {
    const newTicket = Math.floor(100 + Math.random() * 900).toString(); // Generates a random 3-digit number
    setTicket(newTicket);

    const digitSum = newTicket
      .split("")
      .reduce((sum, digit) => sum + parseInt(digit), 0);

    if (digitSum === 15) {
      setMessage("Congratulations! You won the Lottery!");
    } else {
      setMessage("Sorry, you did not win. Better luck next time!");
    }
  };

  return (
    <div className="lottery-container">
      <h1 className="title">Lottery Game</h1>
      <button onClick={generateTicket} className="generate-button">
        Generate Lottery Ticket
      </button>
      {ticket && <h2 className="ticket">Your Ticket: {ticket}</h2>}
      {message && <p className="message">{message}</p>}
    </div>
  );
};

export default LotteryGame;
