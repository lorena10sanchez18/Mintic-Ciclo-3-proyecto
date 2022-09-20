import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ContainersRoutingModule } from './containers-routing.module';
import { InventariosComponent } from './administrador/components/inventarios/inventarios.component';
import { VentasComponent } from './administrador/components/ventas/ventas.component';
import { AjusteInventarioComponent } from './administrador/components/ajuste-inventario/ajuste-inventario.component';
import { CrearProductoComponent } from './administrador/components/crear-producto/crear-producto.component';
import { ActualizarProductoComponent } from './administrador/components/actualizar-producto/actualizar-producto.component';
import { CrearUsuarioComponent } from './administrador/components/crear-usuario/crear-usuario.component';
import { ActualizarUsuarioComponent } from './administrador/components/actualizar-usuario/actualizar-usuario.component';
import { IngresoMercanciaComponent } from './auxiliar-bodega/components/ingreso-mercancia/ingreso-mercancia.component';
import { TrasladoMercanciaComponent } from './auxiliar-bodega/components/traslado-mercancia/traslado-mercancia.component';
import { InventarioMercanciaComponent } from './auxiliar-bodega/components/inventario-mercancia/inventario-mercancia.component';
import { CajaComponent } from './vendedor/components/caja/caja.component';


@NgModule({
  declarations: [
    InventariosComponent,
    VentasComponent,
    AjusteInventarioComponent,
    CrearProductoComponent,
    ActualizarProductoComponent,
    CrearUsuarioComponent,
    ActualizarUsuarioComponent,
    IngresoMercanciaComponent,
    TrasladoMercanciaComponent,
    InventarioMercanciaComponent,
    CajaComponent
  ],
  imports: [
    CommonModule,
    ContainersRoutingModule
  ]
})
export class ContainersModule { }
