import React from 'react';
import logo from './logo.svg';
import './App.css';
import { SocialMediaButton } from './components/SocialMediaButton';
function App() {
  const onClickSocialMediaCart = (event:any) => {
    console.log(event);
    event.target.classList.add("social-media-inner-container-active")
  }
  return (
    <div className='container-custom'>
      <div className='row-custom'>
        <div className='social-media-container'>
          <SocialMediaButton onClickFunction={onClickSocialMediaCart} socialMediaName="instagram" />
        </div>
        <div className='social-media-container'>
          <SocialMediaButton onClickFunction={onClickSocialMediaCart} socialMediaName="twitter" />
        </div>
      </div>
      <div className='row-custom'>
        <div className='social-media-container'>
          <SocialMediaButton onClickFunction={onClickSocialMediaCart} socialMediaName="linkedin" />
        </div>
        <div className='social-media-container'>
          <SocialMediaButton onClickFunction={onClickSocialMediaCart} socialMediaName="whatsapp" />
        </div>
      </div>
    </div>
  );
}

export default App;
