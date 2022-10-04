import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { APIMOSTRARUBICACIONES_URL } from '@core/path.config';

@Injectable({
  providedIn: 'root',
})
export class UbicacionesService {
  private APIMOSTRARUBICACIONES_URL = APIMOSTRARUBICACIONES_URL;
  constructor(private http: HttpClient) {}
  public mostrarUbicaciones() {
    return this.http.get(this.APIMOSTRARUBICACIONES_URL);
  }
}