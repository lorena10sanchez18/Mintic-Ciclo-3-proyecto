import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProductosService } from '@core/Services/productos.service';

@Component({
  selector: 'app-actualizar-producto',
  templateUrl: './actualizar-producto.component.html',
  styleUrls: ['./actualizar-producto.component.css'],
})
export class ActualizarProductoComponent implements OnInit {
  formularioBuscar: FormGroup;
  formularioActualizar: FormGroup;
  resMostrarProductos!: any;

  constructor(
    private fb: FormBuilder,
    private servicioBuscar: ProductosService
  ) {
    this.formularioBuscar = this.fb.group({
      nombreProducto: ['', [Validators.required]],
    });

    this.formularioActualizar = this.fb.group({
      ventaUnitaria: ['', [Validators.required]]
    }); 
  }

  ngOnInit(): void {
    this.servicioBuscar.mostrarProducto().subscribe((respuestaback) => {
      this.resMostrarProductos = respuestaback;
    });
  }

  actualizar(){

  }
  cancelar(){
    this.formularioBuscar.reset();
    this.formularioActualizar.reset();
  }
}
