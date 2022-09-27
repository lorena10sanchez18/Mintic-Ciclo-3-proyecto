import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { APIMOSTRARMOTIVOS_URL } from '@core/path.config';

@Injectable({
  providedIn: 'root',
})
export class MotivosService {
  private APIMOSTRARMOTIVOS_URL = APIMOSTRARMOTIVOS_URL;
  constructor(private http: HttpClient) {}
  public mostrarMotivos() {
    return this.http.get(this.APIMOSTRARMOTIVOS_URL);
  }
}
