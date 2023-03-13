import React from 'react'
import './Item.css';
export interface todoProps {
  id:string,
  message:string,
  completed:boolean
}
export const Item:React.FC<todoProps> = (props) => {
  const strikeThrough = props.completed ? {textDecoration :'line-through'} : {textDecoration:'none'};
  const onButtonClick = (event:any) => {
    let temp = document.getElementsByClassName(`todo-text-${event.target.classList[1]}`);
    temp[0].classList.add('todo-text-completed');
    event.target.classList.add("pressed-button");
    event.target.innerHTML = "Completed";
    console.log(event.target);
  };
  
  const stringTemp = `complete-button ${props.id}`;
  const stringTemp2 = `todo-text-${props.id}`;
  return (
    <div key={props.id} className="individual-item-text">
      <p className={stringTemp2}>{props.message}</p>
      <div className={stringTemp} onClick={onButtonClick}>Done</div>
    </div>
  )
}

