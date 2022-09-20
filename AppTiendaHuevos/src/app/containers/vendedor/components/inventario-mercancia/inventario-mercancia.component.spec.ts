import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InventarioMercanciaComponent } from './inventario-mercancia.component';

describe('InventarioMercanciaComponent', () => {
  let component: InventarioMercanciaComponent;
  let fixture: ComponentFixture<InventarioMercanciaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InventarioMercanciaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InventarioMercanciaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
