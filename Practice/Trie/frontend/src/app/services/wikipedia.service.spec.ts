import { TestBed } from '@angular/core/testing';

import { WikipediaService } from './wikipedia.service';

describe('WikipediaService', () => {
  let service: WikipediaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(WikipediaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
