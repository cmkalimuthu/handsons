import { Component, OnInit } from '@angular/core';
import { department } from '../departments';
import { employees } from '../employees';
import { skills } from '../skills';

@Component({
  selector: 'app-view-emp',
  templateUrl: './view-emp.component.html',
  styleUrls: ['./view-emp.component.css']
})
export class ViewEmpComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  title = 'demo-app';
  name='chief';
  employee=employees;
  department=department;
  skills=skills;
  dateOfBirth=employees.dateOfBirth;

}
