import { Router } from '@angular/router';
import { Component } from '@angular/core';

@Component({
  selector: 'app-menu-aux',
  templateUrl: './menu-aux.component.html',
  styleUrls: ['./menu-aux.component.css'],
})
export class MenuAuxComponent {
  constructor(private router: Router) {}
  
  irIngresos() {
    this.router.navigate(['aux/ingreso']);
  }
  irTraslados() {
    this.router.navigate(['aux/traslados']);
  }
  irInventario() {
    this.router.navigate(['aux/inventario']);
  }
}
