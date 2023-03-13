import React from 'react'
import '../styles/FormPage.css'
import { useNavigate } from 'react-router-dom';
import FinalPage from './FinalPage';
import EquinixLogo from '../public/images/Equinix_logo.png';
import IBXImage from '../public/images/leftdiv.jpeg';
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';

export interface FormPageProps {
  onSubmit: any;
  stateEmployee: any;
}

const FormPage: React.FC<FormPageProps> = (props) => {
  const navigate = useNavigate();
  const onChangeClick = (event: { target: { name: any; value: any } }) => {
    const { name, value } = event.target;
    console.log(name);
    console.log(value);
    props.onSubmit((prevProps: any) => ({
      ...prevProps,
      [name]: value
    }));
  }
  const onSubmitChange = (event:any) => {
    event.preventDefault();
    const formDiv = document.getElementsByClassName("form-div");
    const columns = document.getElementsByClassName("custom-col");
    console.log(columns);
    columns[0].classList.remove("custom-col-left");
    columns[0].classList.add("custom-col-right");
    columns[1].classList.remove("custom-col-right");
    columns[1].classList.add("custom-col-left");
    formDiv[0].classList.remove("form-unactive");
    formDiv[0].classList.add("form-active");
    formDiv[1].classList.remove("form-active");
    formDiv[1].classList.add("form-unactive");
    console.log(props.stateEmployee);
  }

  return (
    <>
      <div className='container-custom'>
        <div className='row custom-row'>
          <div className='col-sm custom-col custom-col-left'>
            <div className='form-div form-unactive'>
                <div className='equinix-logo'>
                  <img src={EquinixLogo} className='equinix-logo-img' />
                </div>
                <Form onSubmit={onSubmitChange} className="form-custom">
                  <Form.Group className="mb-3 form-group-custom" controlId="formBasicEmail">
                    <Form.Label>Email address</Form.Label>
                    <Form.Control type="email" placeholder="Enter email" onChange={onChangeClick} disabled name="email" value={props.stateEmployee.email}/>
                    <Form.Text className="text-muted">
                      We'll never share your email with anyone else.
                    </Form.Text>
                  </Form.Group>

                  <Form.Group className="mb-3 form-group-custom" controlId="formBasicEmail">
                    <Form.Label> Name</Form.Label>
                    <Form.Control type="name" placeholder="Enter Name" onChange={onChangeClick} disabled name="name" value={props.stateEmployee.name}/>
                  </Form.Group>

                  <Form.Group className="mb-3 form-group-custom" controlId="formBasicEmail">
                    <Form.Label>  Mobile </Form.Label>
                    <Form.Control type="name" placeholder="Enter Mobile Number" onChange={onChangeClick} disabled name="mobile" value={props.stateEmployee.mobile}/>
                  </Form.Group>

                  <Form.Group className="mb-3 form-group-custom" controlId="formBasicEmail">
                    <Form.Label>  ID </Form.Label>
                    <Form.Control type="name" placeholder="Enter ID Number" onChange={onChangeClick} disabled name="id" value={props.stateEmployee.id}/>
                  </Form.Group>
                  <Button variant="primary" className='button-submit'>
                    Clear
                  </Button>
                  <Button variant="primary" type="submit" className='button-submit'>
                    Submit
                  </Button>
                </Form>
              </div>
          </div>
          <div className='col-sm custom-col custom-col-right'>
            <div className='form-div form-active'>
              <div className='equinix-logo'>
                <img src={EquinixLogo} className='equinix-logo-img' />
              </div>
              <Form onSubmit={onSubmitChange} className="form-custom">
                <Form.Group className="mb-3 form-group-custom" controlId="formBasicEmail">
                  <Form.Label>Email address</Form.Label>
                  <Form.Control type="email" placeholder="Enter email" name="email" onChange={onChangeClick} required/>
                  <Form.Text className="text-muted">
                    We'll never share your email with anyone else.
                  </Form.Text>
                </Form.Group>

                <Form.Group className="mb-3 form-group-custom" controlId="formBasicEmail">
                  <Form.Label> Name</Form.Label>
                  <Form.Control type="name" placeholder="Enter Name" name="name" onChange={onChangeClick} required/>
                </Form.Group>

                <Form.Group className="mb-3 form-group-custom" controlId="formBasicEmail">
                  <Form.Label>  Mobile </Form.Label>
                  <Form.Control type="name" placeholder="Enter Mobile Number" name="mobile" onChange={onChangeClick} required/>
                </Form.Group>

                <Form.Group className="mb-3 form-group-custom" controlId="formBasicEmail">
                  <Form.Label>  ID </Form.Label>
                  <Form.Control type="name" placeholder="Enter ID Number" name="id" onChange={onChangeClick} required/>
                </Form.Group>
                <Button variant="primary" className='button-submit'>
                  Clear
                </Button>
                <Button variant="primary" type="submit" className='button-submit' onSubmit={onSubmitChange}>
                  Submit
                </Button>
              </Form>
            </div>
          </div>
        </div>
      </div>
    </>
  )
}

export default FormPage
