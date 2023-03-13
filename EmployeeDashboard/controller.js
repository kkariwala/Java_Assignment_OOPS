const data = require('./data');


class Controller{
    async getEmployees() {
        return new Promise((resolve,_) => resolve(data));
    }

    async getEmployee(employee_id){
        return new Promise((resolve,reject) => {
            let employee = data.find(employee => employee.employee_id === parseInt(employee_id));
            if(employee){
                resolve(employee);
            }else{
                reject(`employee with the id : ${employee_id} not found`);
            }
        })
    }

    async createEmployee(emplopyee){
        return new Promise((resolve,reject)=>{
            let employeeNew = {
                employee_id:Math.floor(4 + Math.random() * 10),
                ...emplopyee
            }
            resolve(employeeNew);
        })
    }

    async updateEmployee(employee_id){
        return new Promise((resolve,reject) => {
            let employee = data.find(employee => employee.employee_id === parseInt(employee_id));
            if(!employee){
                reject(`Employee with the id as ${employee_id} not found!!!`);
            }
            employee['updated'] = true;
            resolve(employee);
        })
    }

    async deleteEmployee(employee_id){
        return new Promise((resolve,reject) => {
            let employee = data.find(employee => employee.employee_id === parseInt(employee_id));
            if(!employee){
                reject(`Employee with the id as ${employee_id} not found!!!`);
            }
            resolve(`employee with id : ${employee_id} deleted successfully!`);
        })
    }
}

module.exports = Controller;