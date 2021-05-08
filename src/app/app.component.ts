import { Component,OnInit } from '@angular/core';
import { Employee } from './employee';
import {employees } from "./employees";
import { department} from "./departments";
import {skills} from "./skills";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  constructor(){
    
  }
  ngOnInit(){
  }
  title="hello"
 
}
