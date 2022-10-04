import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { APITRASLADOSPRODUCTO_URL } from '@core/path.config';

@Injectable({
  providedIn: 'root'
})
export class TrasladoMercanciaService {
  private APITRASLADOSPRODUCTO_URL = APITRASLADOSPRODUCTO_URL;
  constructor(private http: HttpClient) {}
  public ingresosProducto() {
    return this.http.get(this.APITRASLADOSPRODUCTO_URL);
  }
}
