import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UsuariosService } from '@core/Services/usuarios.service';

@Component({
  selector: 'app-actualizar-usuario',
  templateUrl: './actualizar-usuario.component.html',
  styleUrls: ['./actualizar-usuario.component.css'],
})
export class ActualizarUsuarioComponent implements OnInit {
  formularioBuscarUsuario: FormGroup;
  formularioActualizarUsuario: FormGroup;
  resMostrarUsuario!: any;
  nombreUsuario!: String;
  cedula!: Number;
  contrasenia!: any;
  rol!: String;
  estado!: String;
  usuarios!: {};
  respuestaback!: any;
  resActualizarUsuario!: any;
  cedulaJson!: {};

  constructor(
    private fb: FormBuilder,
    private servicesActualizarUsuario: UsuariosService
  ) {
    this.formularioBuscarUsuario = this.fb.group({
      cedula: ['', [Validators.required]],
    });

    this.formularioActualizarUsuario = this.fb.group({
      nombreUsuario: ['', [Validators.required]],
      cedula: ['', [Validators.required]],
      contrasenia: ['', [Validators.required]],
      rol: ['', [Validators.required]],
      estado: ['', [Validators.required]],
    });
  }

  ngOnInit(): void {}

  buscar() {
    this.cedula = this.formularioBuscarUsuario.value.cedula;
    this.cedulaJson = {
      cedula: this.cedula,
    };
    this.servicesActualizarUsuario
      .buscarUsuario(this.cedulaJson)
      .subscribe((response: any) => {
        this.resActualizarUsuario = response;

        this.formularioActualizarUsuario.patchValue({
          nombreUsuario: response.nombre,
          cedula: response.cedula,
          contrasenia: response.contrasenia,
          rol: response.rol,
          estado: response.estado,
        });
      });
  }

  actualizar() {
    this.cedula = this.formularioActualizarUsuario.value.cedula;
    this.nombreUsuario = this.formularioActualizarUsuario.value.nombreUsuario;
    this.contrasenia = this.formularioActualizarUsuario.value.contrasenia;
    this.rol = this.formularioActualizarUsuario.value.rol;
    this.estado = this.formularioActualizarUsuario.value.estado;
    this.usuarios = {
      cedula: this.cedula,
      contrasenia: this.contrasenia,
      rol: this.rol,
      estado: this.estado,
      nombre: this.nombreUsuario,
    };

    this.servicesActualizarUsuario
      .actualizarUsuario(this.usuarios)
      .subscribe((response) => {
        this.resActualizarUsuario = response.body;
      });
  }

  cancelar() {
    this.formularioActualizarUsuario.reset();
    this.formularioBuscarUsuario.reset();
  }
}
