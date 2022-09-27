import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { APIINSERTARAJUSTESINVENTARIO_URL } from '@core/path.config';

@Injectable({
  providedIn: 'root'
})
export class AjusteInventarioService {
  private APIINSERTARAJUSTESINVENTARIO_URL= APIINSERTARAJUSTESINVENTARIO_URL
  constructor(private http: HttpClient) { }
  public insertarAjusteInventario(ajuste: any){
    return this.http.post(this.APIINSERTARAJUSTESINVENTARIO_URL,ajuste);
  }
}
