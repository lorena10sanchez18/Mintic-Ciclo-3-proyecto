import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { VendedorRoutingModule } from './vendedor-routing.module';
import { InventarioComponent } from './inventario/inventario.component';
import { TrasladoMercanciaComponent } from './traslado-mercancia/traslado-mercancia.component';
import { CajaComponent } from './caja/caja.component';
import { HomeComponent } from './home/home.component';


@NgModule({
  declarations: [
    InventarioComponent,
    TrasladoMercanciaComponent,
    CajaComponent,
    HomeComponent
  ],
  imports: [
    CommonModule,
    VendedorRoutingModule
  ]
})
export class VendedorModule { }
