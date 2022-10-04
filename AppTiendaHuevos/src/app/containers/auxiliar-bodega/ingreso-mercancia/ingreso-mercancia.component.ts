import { formatDate, FormatWidth } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { IngresoMercanciaService } from '@core/Services/ingreso-mercancia.service';
import { BodegasService } from '@core/Services/bodegas.service';
import { MotivosService } from '@core/Services/motivos.service';
import { UbicacionesService } from '@core/Services/ubicaciones.service';
import { ProductosService } from '@core/Services/productos.service';


@Component({
  selector: 'app-ingreso-mercancia',
  templateUrl: './ingreso-mercancia.component.html',
  styleUrls: ['./ingreso-mercancia.component.css']
})
export class IngresoMercanciaComponent implements OnInit {
  formIngresoMercancia: FormGroup;
  resMostrarProductos!: any;
  resMostrarBodegas!: any;
  resMostrarMotivos!: any;
  resMostrarUbicaciones!: any;
  fecha!: any;
  factura!: any;
  descripcionProductos!: number;
  descripcionBodega!: number;
  descripcionMotivo!: number;
  cantidad!: number;
  observaciones!: string;
  id_producto !: any;
  valor_unitario !: any;
  id_ubicacion!: any;
  ingresosBodega!: {};
  ingreso!: {};
  respuestaPostIngresoProducto!: any;
  respuestaback !: any;

  constructor(
    private servicesProducto: ProductosService,
    private servicesBodega: BodegasService,
    private servicesMotivo: MotivosService,
    private servicesUbicaciones: UbicacionesService,
    private fb: FormBuilder,
    private serviceMercancia: IngresoMercanciaService
  ) {
    this.formIngresoMercancia = this.fb.group({
      descripcionProductos: ['Tipo de producto', [Validators.required]],
      descripcionBodega: ['Almacen', [Validators.required]],
      descripcionMotivo: ['Motivo', [Validators.required]],
      cantidad: ['', [Validators.required]],
      observaciones: ['', [Validators.required]],
      descripcionUbicacion: [''],
      fecha: [''],
      factura: ['']
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
    this.servicesUbicaciones.mostrarUbicaciones().subscribe((respuestaback) => {
      this.resMostrarUbicaciones = respuestaback;
    });
    
  }

  
guardar() {
  this.factura = "100" ;
  this.observaciones = "ninguna";
  this.fecha = "2022-10-02";
  this.id_producto = 1;
  this.cantidad = 10;
  this.valor_unitario = 1000;
  this.id_ubicacion = 1;

  this.ingresosBodega = {
     factura : this.factura ,
     observaciones : this.observaciones,
     fecha : this.fecha ,
     id_producto : this.id_producto ,
     cantidad : this.cantidad ,
     valor_unitario : this.valor_unitario ,
     id_ubicacion : this.id_ubicacion 
  };
  
  console.log(this.ingresosBodega);

  this.serviceMercancia
    .ingresosProducto(this.ingresosBodega )
    .subscribe((response: any) => {
      this.respuestaback = response.body;
    });
}
 
  
  cancelar(){};
}
