import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from '@containers/auxiliar-bodega/home/home.component';
import { IngresoMercanciaComponent } from '@containers/auxiliar-bodega/ingreso-mercancia/ingreso-mercancia.component';
import { TrasladoMercanciaComponent } from '@containers/auxiliar-bodega/traslado-mercancia/traslado-mercancia.component';
import { InventarioComponent } from './inventario/inventario.component';

const routes: Routes = [
  {
    path: '', 
    children: [
      {
        path: 'home', component: HomeComponent
      },
      {
        path: 'ingreso', component: IngresoMercanciaComponent
      },
      {
        path: 'traslados', component: TrasladoMercanciaComponent
      },
      {
        path: 'inventario', component: InventarioComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AuxiliarBodegaRoutingModule { }
