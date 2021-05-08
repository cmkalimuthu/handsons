import { Injectable } from '@angular/core';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor() { }
  employeeList:Employee[]=[{
    id: 1,
    name: "sam",
    salary: 2000,
    permanent: true,
    dateOfBirth: new Date()

  }, {
    id: 2,
    name: "rebecca",
    salary: 3000,
    permanent: false,
    dateOfBirth: new Date()
  },{
    id: 3,
    name: "valerio",
    salary: 4000,
    permanent: true,
    dateOfBirth: new Date()
  },{
    id: 4,
    name: "marina",
    salary: 3000,
    permanent: true,
    dateOfBirth: new Date()
  },{
    id: 5,
    name: "andres",
    salary: 1000,
    permanent: false,
    dateOfBirth: new Date()
  }];
  emp:Employee;
  getAllEmployees() : Employee[]{
    return this.employeeList;
  }
  getEmployee(employeeId: number): Employee{
    for(this.emp of this.employeeList){
      if(this.emp.id==employeeId)
      return this.emp;

    }
    return null;
  }
}
