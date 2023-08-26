import { TestBed } from '@angular/core/testing';

import { PattiService } from './patti.service';

describe('PattiService', () => {
  let service: PattiService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PattiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
