import { formatDate, FormatWidth } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { BodegasService } from '@core/Services/bodegas.service';
import { MotivosService } from '@core/Services/motivos.service';
import { ProductosService } from '@core/Services/productos.service';
import { TrasladoMercanciaService } from '@core/Services/traslado-mercancia.service';

@Component({
  selector: 'app-traslado-mercancia',
  templateUrl: './traslado-mercancia.component.html',
  styleUrls: ['./traslado-mercancia.component.css']
})
export class TrasladoMercanciaComponent implements OnInit {
  formTrasladoMercancia: FormGroup;
  resMostrarProductos!: any;
  resMostrarBodegas!: any;
  resMostrarMotivos!: any;
  fecha!: any;
  factura!: any;
  descripcionProductos!: number;
  descripcionBodega!: number;
  descripcionMotivo!: number;
  cantidad!: number;
  observaciones!: string;
  producto!: {};
  respuestaPostTrasladoProducto!: any;

  constructor(
    private servicesProducto: ProductosService,
    private servicesBodega: BodegasService,
    private servicesMotivo: MotivosService,
    private fb: FormBuilder,
    private serviceTrasladoMercancia: TrasladoMercanciaService
  ) {
    this.formTrasladoMercancia = this.fb.group({
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
  
  guardar(){};
  
  cancelar(){};

}
