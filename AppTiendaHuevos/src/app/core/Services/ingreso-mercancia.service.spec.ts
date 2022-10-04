import { TestBed } from '@angular/core/testing';

import { IngresoMercanciaService } from './ingreso-mercancia.service';

describe('IngresoMercanciaService', () => {
  let service: IngresoMercanciaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(IngresoMercanciaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
