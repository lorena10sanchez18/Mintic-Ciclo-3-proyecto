import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UsuariosService } from '@core/Services/usuarios.service';

@Component({
  selector: 'app-actualizar-usuario',
  templateUrl: './actualizar-usuario.component.html',
  styleUrls: ['./actualizar-usuario.component.css']
})

export class ActualizarUsuarioComponent implements OnInit {

  formularioBuscarUsuario: FormGroup;
  formularioActualizarUsuario: FormGroup;
  resMostrarUsuario !: any;
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
        cedula: [''],
    });

    this.formularioActualizarUsuario = this.fb.group({
      nombreUsuario:[''],
      cedula:[''],
      contrasenia:[''],
      rol:[''],
      estado:[''],
    });
  }

  ngOnInit(): void {

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
    nombre: this.nombreUsuario
    };
    console.log(this.usuarios);
    this.servicesActualizarUsuario
      .actualizarUsuario(this.usuarios)
      .subscribe((response) => {
        this.resActualizarUsuario = response.body;
  
      });
      setTimeout(function(){
        console.log("waited seconds");
            }, 2000);
          
  }

  buscar(){
    this.cedula = this.formularioBuscarUsuario.value.cedula;
    this.cedulaJson = {
      "cedula": this.cedula     
    };
    this.servicesActualizarUsuario.buscarUsuario(this.cedulaJson).subscribe((response:any)=>{
      this.resActualizarUsuario = response;
      console.log(response);
     
    this.formularioActualizarUsuario.patchValue({
      nombreUsuario:response.nombre,
      cedula: response.contrasenia,
      rol: response.rol,
      estado: response.estado
    });
          
    });
 
   
  
  }

  cancelar() {
    this.formularioActualizarUsuario.reset();
    this.formularioBuscarUsuario.reset();
  }
}
