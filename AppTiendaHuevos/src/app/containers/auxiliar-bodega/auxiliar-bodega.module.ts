import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AuxiliarBodegaRoutingModule } from './auxiliar-bodega-routing.module';
import { IngresoMercanciaComponent } from './ingreso-mercancia/ingreso-mercancia.component';
import { TrasladoMercanciaComponent } from './traslado-mercancia/traslado-mercancia.component';
import { InventarioComponent } from './inventario/inventario.component';
import { HomeComponent } from './home/home.component';


@NgModule({
  declarations: [
    IngresoMercanciaComponent,
    TrasladoMercanciaComponent,
    InventarioComponent,
    HomeComponent
  ],
  imports: [
    CommonModule,
    AuxiliarBodegaRoutingModule
  ]
})
export class AuxiliarBodegaModule { }
