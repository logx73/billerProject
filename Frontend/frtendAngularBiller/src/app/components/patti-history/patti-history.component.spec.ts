import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PattiHistoryComponent } from './patti-history.component';

describe('PattiHistoryComponent', () => {
  let component: PattiHistoryComponent;
  let fixture: ComponentFixture<PattiHistoryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PattiHistoryComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PattiHistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
