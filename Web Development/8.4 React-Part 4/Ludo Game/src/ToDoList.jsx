// import { useState } from "react";
// import { v4 as uuidv4 } from "uuid";
// import "./ToDoList.css";

// export default function TodoList() {
//   let [todos, setTodos] = useState([{ task: "Sample Task", id: uuidv4() }]);
//   let [newTodo, setNewTodo] = useState("");
//   let addNewTask = () => {
//     setTodos((pervTodos) => {
//       return [...pervTodos, { task: newTodo, id: uuidv4() }];
//     });
//     setNewTodo("");
//   };
//   let updateTodoValue = (event) => {
//     setNewTodo(event.target.value);
//   };
//   let deleteTodo = (id) => {
//     setTodos((prevTodos) => todos.filter((prevTodos) => prevTodos.id != id));
//   };
//   let toUppercase = () => {
//     setTodos(
//       todos.map((todo) => {
//         return {
//           ...todo,
//           task: todo.task.toUpperCase(),
//         };
//       })
//     );
//   };
//   let markAsDone = (id) => {
//     setTodos(
//       todos.map((todo) => {
//         if (todo.id == id) {
//           return {
//             ...todo,
//             task: todo.task.toUpperCase(),
//           };
//         } else {
//           return todo;
//         }
//       })
//     );
//   };
//   return (
//     <div>
//       <input
//         type="text"
//         placeholder="Add a Task"
//         value={newTodo}
//         onChange={updateTodoValue}
//       ></input>
//       <br />
//       <br />
//       <button onClick={addNewTask}>Add Task</button>
//       <br />
//       <br />
//       <br />
//       <hr />
//       <h4>Tasks Todo</h4>
//       <ul>
//         {todos.map((todo) => (
//           <li key={todo.id}>
//             <span> {todo.task}</span>
//             &nbsp;&nbsp;&nbsp;
//             <button onClick={() => deleteTodo(todo.id)}>Delete</button>
//             &nbsp;&nbsp;&nbsp;
//             <button onClick={() => markAsDone(todo.id)}>Mark as done</button>
//           </li>
//         ))}
//       </ul>
//       <br />
//       <button onClick={toUppercase}>To Uppercase</button>
//     </div>
//   );
// }

import { useState } from "react";
import { v4 as uuidv4 } from "uuid";
import "./ToDoList.css"; // Import the CSS

export default function TodoList() {
  let [todos, setTodos] = useState([
    { task: "Sample Task", id: uuidv4(), completed: false },
  ]);
  let [newTodo, setNewTodo] = useState("");

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

  let markAsDone = (id) => {
    setTodos(
      todos.map((todo) => {
        if (todo.id === id) {
          return {
            ...todo,
            completed: !todo.completed, // Toggle the completed status
          };
        } else {
          return todo;
        }
      })
    );
  };

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
    </div>
  );
}
