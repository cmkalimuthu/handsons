import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ViewEmpComponent } from "./view-emp/view-emp.component";
import { EditEmpComponent } from "./edit-emp/edit-emp.component";
import { QualityIncrementComponent } from './quality-increment/quality-increment.component';
import { ModifyEmpComponent } from './modify-emp/modify-emp.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { LoginComponent } from './login/login.component';
import { AuthGuard } from './auth/auth.guard';
import { UserComponent } from './user/user.component';


const routes: Routes = [
  { path: 'view-emp', component:ViewEmpComponent },
  { path: 'edit-emp', component:EditEmpComponent },
  { path: 'quality-inc', component:QualityIncrementComponent },
  { path: 'modify-emp/:id', component:ModifyEmpComponent,canActivate:[AuthGuard]},
  { path: 'emp-list', component:EmployeeListComponent },
  { path: 'login', component:LoginComponent },
  { path: 'user-list', component:UserComponent },
 
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
 
})
export class AppRoutingModule { }
