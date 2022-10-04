package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Controller;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.IngresosBodega;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.IngresosBodegaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:4200")
public class IngresosBodegaController {
    public final IngresosBodegaService ingresosBodegaService;

    public IngresosBodegaController(IngresosBodegaService ingresosBodegaService) {
        this.ingresosBodegaService = ingresosBodegaService;
    }

    @PostMapping("/insertar-ingresos-bodega")
    public String insertarIngresosBodega(@RequestBody IngresosBodega ingresosBodega) {
                ingresosBodegaService.agregarIngresosBodega(ingresosBodega);
        System.out.println("INGRESO BODEGA");
        System.out.println(ingresosBodega);
             return ("Se guardo con exito el ajuste de inventario");
    }

    @GetMapping("/consultar-ingresos-bodega")
    public List<IngresosBodega> consultaIngresosBodega(){
        return ingresosBodegaService.consultaIngresosBodega();
    }


}
