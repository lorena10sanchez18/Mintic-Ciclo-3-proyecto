package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Controller;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Bodegas;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.BodegasServices;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http:/localhost:4200")

public class BodegasController {
    public final BodegasServices bodegasServices;

    public BodegasController(BodegasServices bodegasServices) {
        this.bodegasServices = bodegasServices;
    }

    @GetMapping("/mostrar-bodegas")
    public List<Bodegas> buscarBodegas() {
        return bodegasServices.buscarBodegas();
    }

}
