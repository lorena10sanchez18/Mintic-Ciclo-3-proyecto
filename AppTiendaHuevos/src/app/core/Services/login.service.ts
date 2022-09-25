import { APILOGIN_URL } from '@core/path.config';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()

export class LoginService {
  private APILOGIN_URL = APILOGIN_URL;

  constructor(private http: HttpClient) { }

  public ingresoApp(login: any){
    return this.http.post(this.APILOGIN_URL, login);
  }
}
