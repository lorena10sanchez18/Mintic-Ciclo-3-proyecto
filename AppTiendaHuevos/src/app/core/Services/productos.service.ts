import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {
  APICREARPRODUCTO_URL,
  APIMOSTRARPRODUCTOS_URL,
} from '@core/path.config';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ProductosService {
  private APIMOSTRARPRODUCTOS_URL = APIMOSTRARPRODUCTOS_URL;
  private APICREARPRODUCTO_URL = APICREARPRODUCTO_URL;

  constructor(private http: HttpClient) {}

  public mostrarProducto() {
    return this.http.get(this.APIMOSTRARPRODUCTOS_URL);
  }

  public crearProducto(productos: any): Observable<any> {
    return this.http.post(this.APICREARPRODUCTO_URL, productos, {
      observe: 'response',
      responseType: 'text',
    });
  }
}
