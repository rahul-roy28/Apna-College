import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { useState, useEffect } from "react";
import { v4 as uuidv4 } from "uuid";
import "./ToDoList.css"; // Import the CSS

export default function TodoList() {
  let [todos, setTodos] = useState([
    // { task: "Sample Task", id: uuidv4(), completed: false },
  ]);
  let [newTodo, setNewTodo] = useState("");
  const [quote, setQuote] = useState(""); // State to store the quote

  let addNewTask = () => {
    setTodos((prevTodos) => {
      return [...prevTodos, { task: newTodo, id: uuidv4(), completed: false }];
    });
    setNewTodo("");
  };

  let updateTodoValue = (event) => {
    setNewTodo(event.target.value);
  };

  let deleteTodo = (id) => {
    setTodos((prevTodos) => prevTodos.filter((todo) => todo.id !== id));
  };

  let markAllAsDone = () => {
    setTodos(
      todos.map((todo) => {
        return {
          ...todo,
          completed: true, // Set all tasks to completed
        };
      })
    );
  };

  // async function fetchQuote() {
  //   const response = await fetch("https://dummyjson.com/quotes/random");
  //   const jsonData = await response.json();
  //   setQuote(jsonData.quote); // Set the fetched quote into state
  // }
  async function fetchQuote() {
    try {
      const response = await fetch("https://dummyjson.com/quotes/random");
      const jsonData = await response.json();
      setQuote(jsonData.quote); // Update state
      toast.success(
        <>
          🎉 Congratulations!
          <br />
          You got this!
        </>,
        {
          className: "custom-toast",
        }
      );
    } catch (error) {
      toast.error("Failed to fetch quote.");
    }
  }

  const markAsDone = (id) => {
    setTodos(
      todos.map((todo) => {
        if (todo.id === id) {
          const updatedTodo = { ...todo, completed: !todo.completed };
          if (updatedTodo.completed) {
            fetchQuote(); // Show toast only when marking as done
          }
          return updatedTodo;
        } else {
          return todo;
        }
      })
    );
  };

  // Separate function to fetch and show motivational quote
  return (
    <div className="container">
      <h4>Tasks Todo</h4>

      <div className="input-section">
        <input
          type="text"
          placeholder="Add a Task"
          value={newTodo}
          onChange={updateTodoValue}
          className="task-input"
        />
        <button onClick={addNewTask} className="add-btn">
          Add Task
        </button>
      </div>
      {quote && (
        <div className="quote-box">
          <p>"{quote}"</p>
        </div>
      )}

      <ul className="task-list">
        {todos.map((todo) => (
          <li key={todo.id} className="task-item">
            {/* Apply the "completed" class if the task is marked as done */}
            <span className={`task-name ${todo.completed ? "completed" : ""}`}>
              {todo.task}
            </span>
            <div className="task-actions">
              <button
                onClick={() => deleteTodo(todo.id)}
                className="delete-btn"
              >
                Delete
              </button>
              <button onClick={() => markAsDone(todo.id)} className="done-btn">
                {todo.completed ? "Undo" : "Mark as done"}
              </button>
            </div>
          </li>
        ))}
      </ul>

      {/* Replace the "To Uppercase" button with "Mark All as Done" */}
      <button onClick={markAllAsDone} className="mark-all-btn">
        Mark All as Done
      </button>

      <ToastContainer
        position="top-center"
        autoClose={4000}
        hideProgressBar={false}
        newestOnTop
        closeOnClick
        pauseOnFocusLoss
        draggable
        pauseOnHover
      />
    </div>
  );
}
