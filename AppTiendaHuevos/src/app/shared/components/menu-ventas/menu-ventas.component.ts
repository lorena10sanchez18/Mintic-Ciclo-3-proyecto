import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu-ventas',
  templateUrl: './menu-ventas.component.html',
  styleUrls: ['./menu-ventas.component.css'],
})
export class MenuVentasComponent {
  constructor(private router: Router) {}
  irTraslados() {
    this.router.navigate(['vendedor/traslados']);
  }
  irInventario() {
    this.router.navigate(['vendedor/inventario']);
  }
  irCaja() {
    this.router.navigate(['vendedor/caja']);
  }
}
