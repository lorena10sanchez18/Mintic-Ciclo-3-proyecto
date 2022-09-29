import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {
  APICREARUSUARIO_URL,
} from '@core/path.config';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class UsuariosService {
  private APICREARUSUARIO_URL = APICREARUSUARIO_URL;

  constructor(private http: HttpClient) {}

 
  public crearUsuario(usuarios: any): Observable<any> {
    return this.http.post(this.APICREARUSUARIO_URL, usuarios, {
      observe: 'response',
      responseType: 'text',
    });
  }
}
