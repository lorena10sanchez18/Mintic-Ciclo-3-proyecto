import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UsuariosService } from '@core/Services/usuarios.service';

@Component({
  selector: 'app-crear-usuario',
  templateUrl: './crear-usuario.component.html',
  styleUrls: ['./crear-usuario.component.css'],
})
export class CrearUsuarioComponent implements OnInit {
  formularioCrearUsuario: FormGroup;
  nombreUsuario!: String;
  cedula!: Number;
  contrasenia!: any;
  rol!: String;
  estado!: String;
  usuarios!: {};
  respuestaback!: any;

  constructor(
    private fb: FormBuilder,
    private servicesCrearUsuario: UsuariosService
  ) {
    this.formularioCrearUsuario = this.fb.group({
      nombreUsuario: ['', [Validators.required]],
      cedula: ['', [Validators.required]],
      contrasenia: ['', [Validators.required]],
      rol:[''],
      estado:[''],
    });
  }

  ngOnInit(): void {}

  crear() {
    this.cedula = this.formularioCrearUsuario.value.cedula;
    this.contrasenia = this.formularioCrearUsuario.value.contrasenia;
    this.rol = this.formularioCrearUsuario.value.rol;
    this.estado = this.formularioCrearUsuario.value.estado;
    this.nombreUsuario = this.formularioCrearUsuario.value.nombreUsuario;

    this.usuarios = {
      cedula: this.cedula,
      contrasenia: this.contrasenia,
      rol: this.rol,
      estado: this.estado,
      nombre: this.nombreUsuario,
    };
    this.servicesCrearUsuario
      .crearUsuario(this.usuarios)
      .subscribe((response: any) => {
        this.respuestaback = response.body;
      });
  }

  cancelar() {
    this.formularioCrearUsuario.reset();
  }
}
