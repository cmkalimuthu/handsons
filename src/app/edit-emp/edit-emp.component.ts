import { Component, OnInit } from '@angular/core';
import { department } from '../departments';
import { employees } from '../employees';

@Component({
  selector: 'app-edit-emp',
  templateUrl: './edit-emp.component.html',
  styleUrls: ['./edit-emp.component.css']
})
export class EditEmpComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  employee=employees;
  department=department;
  name=employees.name;
  departments=[

    { id: 1, name: "Payroll" },
    
    { id: 2, name: "Internal" },
    
    { id: 3, name: "HR" }
    
    ];

}
