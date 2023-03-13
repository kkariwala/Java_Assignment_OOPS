import React,{useState} from 'react'
import '../styles/HomePage.css'
import {Item} from '../components/Item'
export interface HomePageProps {
  content: any
  onChange: any
}

interface arr_todos {
  id: string;
  message: string;
  completed: boolean;
}

const HomePage: React.FC<HomePageProps> = (props) => {
  const [todos, setTodo] = useState<{id:string,message:string,completed:boolean} []>([]);
  const [todoDescription,setTodoDescription] = useState("");

  // const onChangeSubmit = (e: { target: { name: any; value: any } }) => {
  //   const { value } = e.target;
  //   props.onChange(value);
  // }

  const onSubmitChange = (e: { preventDefault: () => void }) => {
    e.preventDefault();
    console.log(todoDescription);
    const newTodo = {
      id: Math.floor(Math.random() * 100).toString(),
      message:todoDescription,
      completed:false
    };
    setTodo(todos => [...todos,newTodo]);
    setTodoDescription("");
  }

  return (
    <>
      <div className='container-custom'>
        <div className='todo-box'>
          <div className='todo-box-header'>TODOs</div>
          <div className='form-add-todo'>
            <form className='form form-custom' onSubmit={onSubmitChange}>
              <div className='form-control form-control-custom'>
                <label></label>
                <input
                  className='enter-task-input'
                  type='text'
                  name="task"
                  placeholder='Enter your task here'
                  value={todoDescription}
                  onChange={(e) => {
                    setTodoDescription(e.target.value);
                  }}
                />
              </div>
              <div className="form-button form-button-custom">
                <label></label>
                <button type="submit" className='custom-button'>Add Task</button>
              </div>
            </form>
          </div>
          <div className='todos'>
            {todos.map((todo) => {
              return <Item id={todo.id} message={todo.message} completed={todo.completed} />
            })}
          </div>
        </div>
        {/* <h1 className='header'>TODO LIST</h1>
        <form className='form' onSubmit={onSubmitChange}>
          <div className='form-control'>
            <label></label>
            <input
              type='text'
              name="task"
              placeholder='Enter your task here'
              value={todoDescription}
              onChange={(e) => {
                setTodoDescription(e.target.value);
              }}
            />
          </div>
          <div className="form-button">
            <label></label>
            <button type="submit" >Add Task</button>
          </div>
        </form>
        <ul className='list-todos'>
          {todos.map((todo) => {
            return <Item id={todo.id} message={todo.message} completed={todo.completed} />
          })}
        </ul> */}
      </div>
    </>
  )
}

export default HomePage
