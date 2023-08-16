import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PattiComponent } from './patti.component';

describe('PattiComponent', () => {
  let component: PattiComponent;
  let fixture: ComponentFixture<PattiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PattiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PattiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
