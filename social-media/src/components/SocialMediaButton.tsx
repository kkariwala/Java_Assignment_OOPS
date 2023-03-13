import React from 'react';
import '../App.css';

interface SocialMediaButtonsProps {
    socialMediaName:String,
    onClickFunction:any
  }  

export const SocialMediaButton:React.FC<SocialMediaButtonsProps> = (props) => {
    const temp = `social-media-${props.socialMediaName} social-media-inner-container`;
    const temp2 = `bi bi-${props.socialMediaName} social-media-icon`
  return (
    <div className={temp} onClick={props.onClickFunction}>
        <i className={temp2}></i>
        <p className="social-media-name">{props.socialMediaName}</p>
    </div>
  )
}
