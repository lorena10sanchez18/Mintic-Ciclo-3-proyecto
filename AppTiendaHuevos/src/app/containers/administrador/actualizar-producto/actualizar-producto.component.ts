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
  producto!: {};
  nombreProducto!: string;
  valorProducto!: number;
  resActualizarProducto!: any;

  constructor(
    private fb: FormBuilder,
    private serviciesProductos: ProductosService
  ) {
    this.formularioBuscar = this.fb.group({
      nombreProducto: ['', [Validators.required]],
    });

    this.formularioActualizar = this.fb.group({
      ventaUnitaria: ['', [Validators.required]],
    });
  }

  ngOnInit(): void {
    this.serviciesProductos.mostrarProducto().subscribe((respuestaback) => {
      this.resMostrarProductos = respuestaback;
    });
  }

  actualizar() {
    this.nombreProducto = this.formularioBuscar.value.nombreProducto;
    this.valorProducto = this.formularioActualizar.value.ventaUnitaria;
    this.producto = {
      descripcionProductos: this.nombreProducto,
      valorVenta: this.valorProducto,
    };
    this.serviciesProductos
      .actualizarValorProducto(this.producto)
      .subscribe((response) => {
        this.resActualizarProducto = response.body;
      });
  }
  cancelar() {
    this.formularioBuscar.reset();
    this.formularioActualizar.reset();
  }
}
