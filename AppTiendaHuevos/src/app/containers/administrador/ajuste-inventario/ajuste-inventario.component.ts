import { formatDate, FormatWidth } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AjusteInventarioService } from '@core/Services/ajuste-inventario.service';
import { BodegasService } from '@core/Services/bodegas.service';
import { MotivosService } from '@core/Services/motivos.service';
import { ProductosService } from '@core/Services/productos.service';

@Component({
  selector: 'app-ajuste-inventario',
  templateUrl: './ajuste-inventario.component.html',
  styleUrls: ['./ajuste-inventario.component.css'],
})
export class AjusteInventarioComponent implements OnInit {
  formAjusteInventario: FormGroup;
  resMostrarProductos!: any;
  resMostrarBodegas!: any;
  resMostrarMotivos!: any;
  descripcionProductos!: number;
  fecha!: any;
  descripcionBodega!: number;
  descripcionMotivo!: number;
  cantidad!: number;
  observaciones!: string;
  ajuste!: {};
  respuestaPostAjusteInventario!: any;

  constructor(
    private servicesProducto: ProductosService,
    private servicesBodega: BodegasService,
    private servicesMotivo: MotivosService,
    private servicesAjusteInventario: AjusteInventarioService,
    private fb: FormBuilder
  ) {
    this.formAjusteInventario = this.fb.group({
      descripcionProductos: ['Tipo de producto', [Validators.required]],
      descripcionBodega: ['Almacen', [Validators.required]],
      descripcionMotivo: ['Motivo', [Validators.required]],
      cantidad: ['', [Validators.required]],
      observaciones: ['', [Validators.required]],
    });
  }

  ngOnInit(): void {
    this.servicesProducto.mostrarProducto().subscribe((respuestaback) => {
      this.resMostrarProductos = respuestaback;
    });
    this.servicesBodega.mostrarBodegas().subscribe((respuestaback) => {
      this.resMostrarBodegas = respuestaback;
    });
    this.servicesMotivo.mostrarMotivos().subscribe((respuestaback) => {
      this.resMostrarMotivos = respuestaback;
    });
  }

  guardar() {
    this.descripcionProductos =
      this.formAjusteInventario.value.descripcionProductos;
    this.fecha = new Date(Date.now()).toISOString().substring(0, 10);
    this.descripcionBodega = this.formAjusteInventario.value.descripcionBodega;
    this.descripcionMotivo = this.formAjusteInventario.value.descripcionMotivo;
    this.cantidad = this.formAjusteInventario.value.cantidad;
    this.observaciones = this.formAjusteInventario.value.observaciones;

    this.ajuste = {
      descripcionProductos: this.descripcionProductos,
      fecha: this.fecha,
      descripcionBodega: this.descripcionBodega,
      desctipcionMotivo: this.descripcionMotivo,
      cantidad: this.cantidad,
      observaciones: this.observaciones,
    };
    this.servicesAjusteInventario
      .insertarAjusteInventario(this.ajuste)
      .subscribe((response: any) => {
        this.respuestaPostAjusteInventario = response.body;
      });
  }

  cancelar() {
    this.formAjusteInventario.reset();
  }
}
