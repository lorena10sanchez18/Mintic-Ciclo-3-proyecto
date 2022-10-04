package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Controller;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Usuarios;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.UsuariosServices;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.util.Elements;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuariosController {
    private final UsuariosServices usuariosServices;

    public UsuariosController(UsuariosServices usuariosServices) {
        this.usuariosServices = usuariosServices;
    }

    @GetMapping("/usuario-cedula/{cedula}")
    public ResponseEntity<Usuarios> buscarUsuarioPorCedula(@PathVariable Integer cedula) {
        return new ResponseEntity<>(
                usuariosServices.buscarUsuarioPorCedula(cedula),
                HttpStatus.OK);
    }

    //@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/buscar-usuario-cedula")
    public Usuarios buscarUsuarioPorCedula(@RequestBody JsonNode body) {
        return (
                usuariosServices.buscarUsuarioPorCedula(
                        body.get("cedula").asInt())
                );
    }


    @PostMapping("/login")
    public ResponseEntity<Usuarios> ingresoAplicacion(@RequestBody JsonNode body) {
        return new ResponseEntity<>(
                usuariosServices.buscarRol(
                        body.get("usuario").asInt(),
                        body.get("contrasenia").asText()),
                HttpStatus.OK);
    }

    @PostMapping("/insertar-usuarios")
    public String insertarUsuarios(@RequestBody Usuarios usuario) {
        usuariosServices.insertarUsuarios(usuario);
        return "Se creo con exito el usuario";
    }

    @PostMapping("/actualizar-usuario")
    public String actualizarUsuarios(@RequestBody Usuarios usuario) {
        usuariosServices.actualizarUsuarios(usuario);
        return "Se actualizo con exito el usuario";
    }
}
