import { LoginService } from '@core/Services/login.service';
import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  formularioLogin: FormGroup;
  usuario!: number;
  contrasenia!: string;
  login!: {};
  respuesta!: {};
  vendedor: string = 'VENDEDOR';
  aux: string = 'AUXILIAR BODEGA';
  admin: string = 'ADMINISTRADOR';
  rol!: string;

  constructor(
    private services: LoginService,
    private router: Router,
    private fb: FormBuilder
  ) {
    this.formularioLogin = this.fb.group({
      usuario: ['', [Validators.required, Validators.minLength(5)]],
      contrasenia: ['', [Validators.required]],
    });
  }

  ngOnInit(): void {}

  iniciarSesion() {
    this.usuario = this.formularioLogin.value.usuario;
    this.contrasenia = this.formularioLogin.value.contrasenia;
    this.login = {
      usuario: this.usuario,
      contrasenia: this.contrasenia,
    };

    this.services.ingresoApp(this.login).subscribe((respuestaback) => {
      this.respuesta = respuestaback;
      this.validarRol();
    });
  }

  validarRol() {
    if (JSON.stringify(this.respuesta).includes(this.admin)) {
      this.router.navigate(['admin/home']);
    } else if (JSON.stringify(this.respuesta).includes(this.aux)) {
      this.router.navigate(['aux/home']);
    } else if (JSON.stringify(this.respuesta).includes(this.vendedor)) {
      this.router.navigate(['vendedor/home']);
    }
  }
}
