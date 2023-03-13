import React, { useState } from 'react';
import './App.css';
import FormPage from './components/FormPage';
import { Routes, Route } from 'react-router-dom';
import FinalPage from './components/FinalPage';

export interface FormPageProps {
  name: string
  id: number
  email: string
  mobile: number
  address?: string
  designation?: string
}

const App: React.FC = () => {
  const [stateEmployee, setStateEmployee] = useState({
    name: '',
    id: '',
    email: '',
    mobile: '',
    address: '',
    designation: ''
  });

  return (
    <>
      <Routes>
        <Route path='/' element={<FormPage onSubmit={setStateEmployee} stateEmployee={stateEmployee} />} />
        <Route path='/finalpage' element={<FinalPage name={stateEmployee.name} id={stateEmployee.id} email={stateEmployee.email} mobile={stateEmployee.mobile} />} />
      </Routes>
    </>
  );
}

export default App;
