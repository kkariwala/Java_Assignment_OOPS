import React, { useState } from 'react';
import './App.css';
import HomePage from './pages/HomePage';

const App: React.FC = () => {
  const [content, setContent] = useState('');
  return (
    <>
      <HomePage content={content} onChange={setContent} />
    </>
  );
}

export default App;
