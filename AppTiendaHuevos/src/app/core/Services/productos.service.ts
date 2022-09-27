import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { APIMOSTRARPRODUCTOS_URL } from '@core/path.config';

@Injectable({
  providedIn: 'root',
})
export class ProductosService {
  private APIMOSTRARPRODUCTOS_URL = APIMOSTRARPRODUCTOS_URL;

  constructor(private http: HttpClient) {}

  public mostrarProducto() {
    return this.http.get(this.APIMOSTRARPRODUCTOS_URL);
  }
  
}
