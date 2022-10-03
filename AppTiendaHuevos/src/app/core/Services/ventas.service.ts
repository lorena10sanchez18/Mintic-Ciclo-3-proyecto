import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { APITOTALVALORVENTAS_URL, APIVENTASPORFECHA_URL } from '@core/path.config';

@Injectable({
  providedIn: 'root'
})
export class VentasService {
  private APITOTALVALORVENTAS_URL = APITOTALVALORVENTAS_URL;
  private APIVENTASPORFECHA_URL = APIVENTASPORFECHA_URL;

  constructor(private http: HttpClient) { }

  public totalValorVentas(fechas: any){
    return this.http.post(this.APITOTALVALORVENTAS_URL, fechas)
  }

  public ventasPorFechas(fechas: any){
    return this.http.post(this.APIVENTASPORFECHA_URL, fechas)
  }
}
