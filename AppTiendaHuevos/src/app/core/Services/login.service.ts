import { APILOGIN_URL } from '@core/path.config';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()

export class LoginService {
  private APILOGIN_URL = APILOGIN_URL;
  rol!: string;

  constructor(private http: HttpClient) { }

  public ingresoApp(login: any):Observable<any>{
    return this.http.post<any>(this.APILOGIN_URL, login);
  }
}
