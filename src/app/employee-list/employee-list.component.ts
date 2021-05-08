import { Component, OnInit } from '@angular/core';
import { Department } from '../department';
import { Employee } from '../employee';
import { Skill } from '../skill';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  employeeList: Employee[] = [{
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
  searchKey='';
  skills: Skill[] = [{
    id: 1,
    name: "html"
  }, {
    id: 2,
    name: "css"
  }];
departments:Department[]=[{
  id:1,
  name:"pay-roll"
},{ id:2,
  name:"Hr"},{
    id:3,
    name:"product"
  }];
  fin='';
  sortedList:Employee[];
search(event):void{
  this.fin=event.target.value;
 this.sortedList= this.employeeList.filter(name => name.name.includes(this.fin));

}

}
