import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {
  APICREARUSUARIO_URL,
  APIACTUALIZARUSUARIO_URL,
  APIBUSCARUSUARIO_URL,
} from '@core/path.config';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class UsuariosService {
  private APICREARUSUARIO_URL = APICREARUSUARIO_URL;
  private APIACTUALIZARUSUARIO_URL = APIACTUALIZARUSUARIO_URL;
  private APIBUSCARUSUARIO_URL = APIBUSCARUSUARIO_URL;
  
  constructor(private http: HttpClient) {}

 
  public crearUsuario(usuarios: any): Observable<any> {
    return this.http.post(this.APICREARUSUARIO_URL, usuarios, {
      observe: 'response',
      responseType: 'text',
    });
  }

  public mostrarUsuario(){
//    return this.http.get(this.APIMOSTRARUSUARIO_URL);
  }

  public buscarUsuario(cedula: any) {
    return this.http.post(this.APIBUSCARUSUARIO_URL, cedula);
    
  }

  public actualizarUsuario(usuarios: any): Observable<any>{
    return this.http.post(this.APIACTUALIZARUSUARIO_URL, usuarios,{
      observe: 'response',
      responseType: 'text',
    });
    
  }

}
