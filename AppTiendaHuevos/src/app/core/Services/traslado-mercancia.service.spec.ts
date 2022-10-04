import { TestBed } from '@angular/core/testing';

import { TrasladoMercanciaService } from './traslado-mercancia.service';

describe('TrasladoMercanciaService', () => {
  let service: TrasladoMercanciaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TrasladoMercanciaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
