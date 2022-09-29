import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {
  APIACTUALIZARVALORPRODUCTO_URL,
  APIBUSCARPRODUCTOPORNOMBRE_URL,
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
  private APIBUSCARPRODUCTOPORNOMBRE_URL = APIBUSCARPRODUCTOPORNOMBRE_URL;
  private APIACTUALIZARVALORPRODUCTO_URL = APIACTUALIZARVALORPRODUCTO_URL;

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
  public buscarProducto(nombre: string) {
    return this.http.get(this.APIBUSCARPRODUCTOPORNOMBRE_URL + nombre);
  }

  public actualizarValorProducto(producto: any): Observable<any> {
    return this.http.post(this.APIACTUALIZARVALORPRODUCTO_URL, producto, {
      observe: 'response',
      responseType: 'text',
    });
  }
}
