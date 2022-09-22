import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'login',
    loadChildren:()=> import('@auth/auth.module').then((m)=> m.AuthModule)
  },
  {
    path: 'admin',
    loadChildren:()=> import('@containers/administrador/administrador.module').then((m)=> m.AdministradorModule)
  },
  {
    path: 'aux',
    loadChildren:()=> import('@containers/auxiliar-bodega/auxiliar-bodega.module').then((m)=> m.AuxiliarBodegaModule)
  },
  {
    path: 'vendedor',
    loadChildren:()=> import('@containers/vendedor/vendedor.module').then((m)=> m.VendedorModule)
  },
  {
    path: '**',
    redirectTo: 'login'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
