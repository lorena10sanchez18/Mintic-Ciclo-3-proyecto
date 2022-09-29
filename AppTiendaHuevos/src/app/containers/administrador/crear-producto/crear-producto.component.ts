import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProductosService } from '@core/Services/productos.service';

@Component({
  selector: 'app-crear-producto',
  templateUrl: './crear-producto.component.html',
  styleUrls: ['./crear-producto.component.css'],
})
export class CrearProductoComponent implements OnInit {
  formularioCrearProducto: FormGroup;
  nombreProducto!: String;
  ventaUnitaria!: Number;
  productos!: {};
  respuestaback!: any;

  constructor(
    private fb: FormBuilder,
    private servicesCrearProducto: ProductosService
  ) {
    this.formularioCrearProducto = this.fb.group({
      nombreProducto: ['', [Validators.required]],
      ventaUnitaria: ['', [Validators.required]],
    });
  }

  ngOnInit(): void {}

  crear() {
    this.nombreProducto = this.formularioCrearProducto.value.nombreProducto;
    this.ventaUnitaria = this.formularioCrearProducto.value.ventaUnitaria;
    this.productos = {
      descripcionProductos: this.nombreProducto,
      valorVenta: this.ventaUnitaria,
    };
    this.servicesCrearProducto
      .crearProducto(this.productos)
      .subscribe((response: any) => {
        this.respuestaback = response.body;
      });
  }

  cancelar() {
    this.formularioCrearProducto.reset();
  }
}
