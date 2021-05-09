import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ViewEmpComponent } from './view-emp/view-emp.component';
import { EditEmpComponent } from './edit-emp/edit-emp.component';
import { QualityIncrementComponent } from './quality-increment/quality-increment.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ModifyEmpComponent } from './modify-emp/modify-emp.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { EmployeeInfoComponent } from './employee-info/employee-info.component';
import { LoginComponent } from './login/login.component';
import { HttpClientModule } from '@angular/common/http';
import { UserComponent } from './user/user.component';

@NgModule({
  declarations: [
    AppComponent,
    ViewEmpComponent,
    EditEmpComponent,
    QualityIncrementComponent,
    ModifyEmpComponent,
    EmployeeListComponent,
    EmployeeInfoComponent,
    LoginComponent,
    UserComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
