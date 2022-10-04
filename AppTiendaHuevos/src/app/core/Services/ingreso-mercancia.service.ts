import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { APIINGRESOSPRODUCTO_URL } from '@core/path.config';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class IngresoMercanciaService {
    private APIINGRESOSPRODUCTO_URL = APIINGRESOSPRODUCTO_URL;

    constructor(private http: HttpClient) {}
    
      public ingresosProducto(ingresoProducto: any): Observable<any> {
      return this.http.post(this.APIINGRESOSPRODUCTO_URL, ingresoProducto, {
        observe: 'response',
        responseType: 'text',
      });
    }

}