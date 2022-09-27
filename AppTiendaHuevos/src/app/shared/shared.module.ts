import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { FooterComponent } from './components/footer/footer.component';
import { HeaderComponent } from './components/header/header.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MenuAuxComponent } from './components/menu-aux/menu-aux.component';
import { MenuVentasComponent } from './components/menu-ventas/menu-ventas.component';
import { MenuAdminComponent } from './components/menu-admin/menu-admin.component';

@NgModule({
  declarations: [
    FooterComponent,
    HeaderComponent,
    MenuAuxComponent,
    MenuVentasComponent,
    MenuAdminComponent,
  ],
  imports: [CommonModule, ReactiveFormsModule, FormsModule],
  exports: [
    ReactiveFormsModule,
    MenuAuxComponent,
    MenuVentasComponent,
    MenuAdminComponent,
    FooterComponent,
    HeaderComponent,
    FormsModule
  ],
})
export class SharedModule {}
