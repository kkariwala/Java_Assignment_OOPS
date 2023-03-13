import React from 'react'

export interface FinalPageProps {
  name: string
  id: string
  email: string
  mobile: string
  address?: string
  designation?: string
}

const FinalPage: React.FC<FinalPageProps> = (props) => {
  return (
    <>
      <div className='App'>
        <form >
          <div className='form-control'>
            <label>Name</label>
            <input
              type='text'
              name="name"
              placeholder='Enter your name here'
              value={props.name}
              disabled
            />
          </div>
          <div className='form-control'>
            <label>ID</label>
            <input
              type='text'
              name="id"
              placeholder='Enter your ID here'
              value={props.id}
              disabled
            />
          </div>
          <div className='form-control'>
            <label>Email</label>
            <input
              type='text'
              name="email"
              placeholder='Enter your email here'
              value={props.email}
              disabled
            />
          </div>
          <div className='form-control'>
            <label>Mobile Number</label>
            <input
              type='text'
              name="mobile"
              placeholder='Enter your Mobile Number here'
              value={props.mobile}
              disabled
            />
          </div>
          <div className='form-control'>
            <label>Address</label>
            <input
              type='text'
              name="address"
              placeholder='Enter your Address here'
              value={props.address}
              disabled
            />
          </div>
          <div className='form-control'>
            <label>Designation</label>
            <input
              type='text'
              name="designation"
              placeholder='Enter your Designation here'
              value={props.designation}
              disabled
            />
          </div>
        </form>
      </div>
    </>
  )
}

export default FinalPage
