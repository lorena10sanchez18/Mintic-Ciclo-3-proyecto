import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProductosService } from '@core/Services/productos.service';

@Component({
  selector: 'app-ajuste-inventario',
  templateUrl: './ajuste-inventario.component.html',
  styleUrls: ['./ajuste-inventario.component.css'],
})
export class AjusteInventarioComponent implements OnInit {
  formAjusteInventario: FormGroup;
  resMostrarProductos!: any;

  constructor(private services: ProductosService, private fb: FormBuilder) {
    this.formAjusteInventario = this.fb.group({
      descripcionProductos: ['', [Validators.required]],
      descripcionBodega: ['', [Validators.required]],
      desctipcionMotivo: ['', [Validators.required]],
      cantidad: ['', [Validators.required]],
      observaciones: ['', [Validators.required]],
    });
  }

  ngOnInit(): void {
    this.services.mostrarProducto().subscribe((respuestaback)=>{
      this.resMostrarProductos = respuestaback;
      console.log(this.resMostrarProductos)
    })
    
  }

  guardar() {}

  cancelar() {}
}
