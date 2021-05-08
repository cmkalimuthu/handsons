import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifyEmpComponent } from './modify-emp.component';

describe('ModifyEmpComponent', () => {
  let component: ModifyEmpComponent;
  let fixture: ComponentFixture<ModifyEmpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModifyEmpComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ModifyEmpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
