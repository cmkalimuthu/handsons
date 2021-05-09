import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { department } from '../departments';
import { employees } from '../employees';
import { skills } from '../skills';
import { ActivatedRoute } from "@angular/router";
import { FormGroup, Validators } from '@angular/forms';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
@Component({
  selector: 'app-modify-emp',
  templateUrl: './modify-emp.component.html',
  styleUrls: ['./modify-emp.component.css']
})
export class ModifyEmpComponent implements OnInit {
  constructor(private route : ActivatedRoute, private employeeService : EmployeeService) { 

  }
id:string;
  ngOnInit(): void {
    var employeeId = this.route.snapshot.paramMap.get('id');
    console.log(employeeId);
    this.id=employeeId;

  }
  employeeId = this.route.snapshot.paramMap.get('id');

  
  
  employee:Employee=this.employeeService.getEmployee(+this.employeeId);
  
  department=department;
  skills=skills;
  //name = new FormControl(this.employee.name);
  empForm = new FormGroup({

    'name': new FormControl(this.employee.name, [
    
    Validators.required,
    
    Validators.minLength(4),
    
    Validators.maxLength(20)
    
    ])
    
    });
    departments=[

      { id: 1, name: "Payroll" },
      
      { id: 2, name: "Internal" },
      
      { id: 3, name: "HR" }
      
      ];
      depc=new FormControl(this.departments);
      salary=new FormControl(this.employee.salary,[
    
        Validators.required,
        
        Validators.min(2000),
        
        Validators.max(100000)
        
        ]);
  
    get name() { return this.empForm.get('name'); }
   
}
