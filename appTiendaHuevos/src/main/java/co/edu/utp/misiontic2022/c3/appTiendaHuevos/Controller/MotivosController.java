package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Controller;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Motivos;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.MotivosServices;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http:/localhost:4200")

public class MotivosController {
    public final MotivosServices motivosServices;

    public MotivosController(MotivosServices motivosServices) {
        this.motivosServices = motivosServices;
    }

    @GetMapping("/mostrar-motivos")
    public List<Motivos> buscarMotivos() {
        return (motivosServices.buscarMotivos());
    }

}
