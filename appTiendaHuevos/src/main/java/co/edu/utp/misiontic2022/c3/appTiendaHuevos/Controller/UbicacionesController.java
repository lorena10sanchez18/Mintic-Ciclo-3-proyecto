package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Controller;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Ubicaciones;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.UbicacionesServices;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:4200")

public class UbicacionesController {
    public final UbicacionesServices ubicacionesServices;

    public UbicacionesController(UbicacionesServices ubicacionesServices) {
        this.ubicacionesServices = ubicacionesServices;
    }

    @GetMapping("/mostrar-ubicaciones")
    public List<Ubicaciones> buscarUbicaciones() {
        return ubicacionesServices.buscarUbicaciones();
    }

}