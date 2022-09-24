import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdministradorRoutingModule } from './administrador-routing.module';
import { InventariosComponent } from './inventarios/inventarios.component';
import { VentasComponent } from './ventas/ventas.component';
import { AjusteInventarioComponent } from './ajuste-inventario/ajuste-inventario.component';
import { CrearProductoComponent } from './crear-producto/crear-producto.component';
import { ActualizarProductoComponent } from './actualizar-producto/actualizar-producto.component';
import { CrearUsuarioComponent } from './crear-usuario/crear-usuario.component';
import { ActualizarUsuarioComponent } from './actualizar-usuario/actualizar-usuario.component';
import { HomeComponent } from './home/home.component';
import { SharedModule } from '@shared/shared.module';


@NgModule({
  declarations: [
    InventariosComponent,
    VentasComponent,
    AjusteInventarioComponent,
    CrearProductoComponent,
    ActualizarProductoComponent,
    CrearUsuarioComponent,
    ActualizarUsuarioComponent,
    HomeComponent
  ],
  imports: [
    CommonModule,
    AdministradorRoutingModule,
    SharedModule
  ]
})
export class AdministradorModule { }
