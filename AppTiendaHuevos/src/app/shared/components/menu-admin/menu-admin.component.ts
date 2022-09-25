import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu-admin',
  templateUrl: './menu-admin.component.html',
  styleUrls: ['./menu-admin.component.css'],
})
export class MenuAdminComponent {
  constructor(private router: Router) {}

  irInventarios() {
    this.router.navigate(['admin/inventarios']);
  }
  irVentas() {
    this.router.navigate(['admin/ventas']);
  }
  irAjuste() {
    this.router.navigate(['admin/ajuste-inventario']);
  }
  irCrearProducto() {
    this.router.navigate(['admin/crear-producto']);
  }
  irActualizarProducto() {
    this.router.navigate(['admin/actualizar-producto']);
  }
  irCrearUsuario() {
    this.router.navigate(['admin/crear-usuario']);
  }
  irActualizarUsuario() {
    this.router.navigate(['admin/actualizar-usuario']);
  }
}
