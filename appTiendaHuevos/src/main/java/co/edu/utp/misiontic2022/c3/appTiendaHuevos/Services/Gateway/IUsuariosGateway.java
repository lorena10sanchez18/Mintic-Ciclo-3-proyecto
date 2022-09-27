package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.Gateway;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Usuarios;

public interface IUsuariosGateway {

    Usuarios buscarUsuarioPorCedula(Integer cedula);

    Usuarios buscarRol(Integer cedula, String contrasenia);

    void insertarUsuarios(Usuarios usuario);
}
