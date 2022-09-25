import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from '@containers/vendedor/home/home.component';
import { TrasladoMercanciaComponent } from '@containers/vendedor/traslado-mercancia/traslado-mercancia.component';
import { InventarioComponent } from '@containers/vendedor/inventario/inventario.component';
import { CajaComponent } from '@containers/vendedor/caja/caja.component';

const routes: Routes = [
  {
    path: '', 
    children: [
      {
        path: 'home', component: HomeComponent
      },
      {
        path: 'traslados', component: TrasladoMercanciaComponent
      },
      {
        path: 'inventario', component: InventarioComponent
      },
      {
        path: 'caja', component: CajaComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class VendedorRoutingModule { }
