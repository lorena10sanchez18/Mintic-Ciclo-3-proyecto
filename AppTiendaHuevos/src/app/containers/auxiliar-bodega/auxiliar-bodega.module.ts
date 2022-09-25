import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AuxiliarBodegaRoutingModule } from '@containers/auxiliar-bodega/auxiliar-bodega-routing.module';
import { IngresoMercanciaComponent } from '@containers/auxiliar-bodega/ingreso-mercancia/ingreso-mercancia.component';
import { TrasladoMercanciaComponent } from '@containers/auxiliar-bodega/traslado-mercancia/traslado-mercancia.component';
import { InventarioComponent } from '@containers/auxiliar-bodega/inventario/inventario.component';
import { HomeComponent } from '@containers/auxiliar-bodega/home/home.component';
import { SharedModule } from '@shared/shared.module';


@NgModule({
  declarations: [
    IngresoMercanciaComponent,
    TrasladoMercanciaComponent,
    InventarioComponent,
    HomeComponent
  ],
  imports: [
    CommonModule,
    AuxiliarBodegaRoutingModule,
    SharedModule
  ]
})
export class AuxiliarBodegaModule { }
