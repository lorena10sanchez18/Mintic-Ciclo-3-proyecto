import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { VentasService } from '@core/Services/ventas.service';

@Component({
  selector: 'app-ventas',
  templateUrl: './ventas.component.html',
  styleUrls: ['./ventas.component.css'],
})
export class VentasComponent implements OnInit {
  formulariosCalendario: FormGroup;
  resTotalVentas!: any;
  desde!: string;
  hasta!: string;
  fechas!: {};
  resventasPorFechas!: any;
campo: any;

  constructor(private fb: FormBuilder, private servicesVentas: VentasService) {
    this.formulariosCalendario = this.fb.group({
      desde: ['', [Validators.required]],
      hasta: ['', [Validators.required]],
    });
  }

  ngOnInit(): void {}

  buscar() {
    this.desde = this.formulariosCalendario.value.desde;
    this.hasta = this.formulariosCalendario.value.hasta;

    this.fechas = {
      fechaInicial: this.desde,
      fechaFinal: this.hasta,
    };
    this.servicesVentas.totalValorVentas(this.fechas).subscribe((Response) => {
      this.resTotalVentas = Response;
    });
    this.servicesVentas.ventasPorFechas(this.fechas).subscribe((Response)=> {
      this.resventasPorFechas = Response;
      console.log(Response);
    });
  
  }
}
