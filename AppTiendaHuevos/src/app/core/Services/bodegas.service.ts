import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { APIMOSTRARBODEGAS_URL } from '@core/path.config';

@Injectable({
  providedIn: 'root',
})
export class BodegasService {
  private APIMOSTRARBODEGAS_URL = APIMOSTRARBODEGAS_URL;
  constructor(private http: HttpClient) {}
  public mostrarBodegas() {
    return this.http.get(this.APIMOSTRARBODEGAS_URL);
  }
}