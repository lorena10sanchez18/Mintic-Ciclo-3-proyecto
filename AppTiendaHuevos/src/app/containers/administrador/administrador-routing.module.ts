import { InventariosComponent } from '@containers/administrador/inventarios/inventarios.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from '@containers/administrador/home/home.component';

const routes: Routes = [
  {
    path: '', 
    children: [
      {
        path: 'home', component: HomeComponent
      },
      {
        path: 'inventarios', component: InventariosComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdministradorRoutingModule { }
