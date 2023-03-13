const http = require('http');
const PORT = process.env.PORT || 5000;
const Employee = require("./controller");
const {getReqData} = require("./utils");

const server = http.createServer(async (req,res) => {
    //GET Route 
    if(req.url === "/api/employees" && req.method === "GET"){
        const employees = await new Employee().getEmployees();
        res.writeHead(200,{'content-Type':'application/json'});
        res.end(JSON.stringify(employees));
    }
    else if(req.url.match(/\/api\/employees\/([0-9]+)/) && req.method === "GET"){
        try {
            const id = req.url.split("/")[3];
            const employee = await new Employee().getEmployee(id);
            res.writeHead(200,{'content-Type':'application/json'});
            res.end(JSON.stringify(employee));
        } catch (error) {
            res.writeHead(200,{'content-Type':'application/json'});
            res.end(JSON.stringify({message : error}));
        }
    }
    else if(req.url.match(/\/api\/employees\/([0-9]+)/) && req.method === "DELETE"){
        try {
            const id = req.url.split("/")[3];
            const employee = await new Employee().deleteEmployee(id);
            res.writeHead(200,{'content-Type':'application/json'});
            res.end(JSON.stringify(employee));
        } catch (error) {
            res.writeHead(200,{'content-Type':'application/json'});
            res.end(JSON.stringify({message : error}));
        }
    }
    else if(req.url.match(/\/api\/employees\/([0-9]+)/) && req.method === "PATCH"){
        try {
            const id = req.url.split("/")[3];
            const employee = await new Employee().updateEmployee(id);
            res.writeHead(200,{'content-Type':'application/json'});
            res.end(JSON.stringify(employee));
        } catch (error) {
            res.writeHead(200,{'content-Type':'application/json'});
            res.end(JSON.stringify({message : error}));
        }
    }
    else if(req.url === "/api/employees" && req.method === "POST"){
        try {
            const employee_data = await getReqData(req);
            let newEmployee = await new Employee().createEmployee(JSON.parse(employee_data));
            res.writeHead(200,{'content-Type':'application/json'});
            res.end(JSON.stringify(newEmployee));
        } catch (error) {
            res.writeHead(200,{'content-Type':'application/json'});
            res.end(JSON.stringify({message : error}));
        }
    }
    else{
         res.writeHead(400,{'content-Type':'application/json'});
         res.end(JSON.stringify({message : "Route not found"}));
    }
})

server.listen(PORT,() => {console.log(`Server is listening at port ${PORT}`)});