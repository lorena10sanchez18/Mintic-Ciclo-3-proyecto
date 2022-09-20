import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TrasladoMercanciaComponent } from './traslado-mercancia.component';

describe('TrasladoMercanciaComponent', () => {
  let component: TrasladoMercanciaComponent;
  let fixture: ComponentFixture<TrasladoMercanciaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TrasladoMercanciaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TrasladoMercanciaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
