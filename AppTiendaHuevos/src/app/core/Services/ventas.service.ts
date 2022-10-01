import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { APITOTALVALORVENTAS_URL } from '@core/path.config';

@Injectable({
  providedIn: 'root'
})
export class VentasService {
  private APITOTALVALORVENTAS_URL = APITOTALVALORVENTAS_URL;
  constructor(private http: HttpClient) { }

  public totalValorVentas(valor: any){
    return this.http.post(this.APITOTALVALORVENTAS_URL, valor)
  }
}
