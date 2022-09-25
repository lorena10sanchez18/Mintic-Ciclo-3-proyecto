import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from '@containers/administrador/home/home.component';
import { InventariosComponent } from '@containers/administrador/inventarios/inventarios.component';
import { VentasComponent } from '@containers/administrador/ventas/ventas.component';
import { AjusteInventarioComponent } from '@containers/administrador/ajuste-inventario/ajuste-inventario.component';
import { CrearProductoComponent } from '@containers/administrador/crear-producto/crear-producto.component';
import { ActualizarProductoComponent } from '@containers/administrador/actualizar-producto/actualizar-producto.component';
import { CrearUsuarioComponent } from '@containers/administrador/crear-usuario/crear-usuario.component';
import { ActualizarUsuarioComponent } from '@containers/administrador/actualizar-usuario/actualizar-usuario.component';

const routes: Routes = [
  {
    path: '',
    children: [
      {
        path: 'home',
        component: HomeComponent,
      },
      {
        path: 'inventarios',
        component: InventariosComponent,
      },
      {
        path: 'ventas',
        component: VentasComponent,
      },
      {
        path: 'ajuste-inventario',
        component: AjusteInventarioComponent,
      },
      {
        path: 'crear-producto',
        component: CrearProductoComponent,
      },
      {
        path: 'actualizar-producto',
        component: ActualizarProductoComponent,
      },
      {
        path: 'crear-usuario',
        component: CrearUsuarioComponent,
      },
      {
        path: 'actualizar-usuario',
        component: ActualizarUsuarioComponent,
      }
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AdministradorRoutingModule {}
