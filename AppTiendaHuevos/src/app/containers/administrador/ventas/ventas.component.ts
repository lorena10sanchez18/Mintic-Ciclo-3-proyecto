import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { VentasService } from '@core/Services/ventas.service';

@Component({
  selector: 'app-ventas',
  templateUrl: './ventas.component.html',
  styleUrls: ['./ventas.component.css']
})
export class VentasComponent implements OnInit {
  formulariosCalendario : FormGroup;
  resTotalVentas!:any;
  constructor(private fb: FormBuilder, private servicesVentas: VentasService) { 
    this.formulariosCalendario = this.fb.group({

    })
  }

  ngOnInit(): void {
  }

}
