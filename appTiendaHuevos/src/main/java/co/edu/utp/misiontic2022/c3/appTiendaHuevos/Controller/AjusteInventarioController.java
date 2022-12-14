package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Controller;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.AjusteInventarioServices;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.sql.Date;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:4200")

public class AjusteInventarioController {

    public final AjusteInventarioServices ajusteInventarioServices;

    public AjusteInventarioController(AjusteInventarioServices ajusteInventarioServices) {
        this.ajusteInventarioServices = ajusteInventarioServices;
    }

    @PostMapping("/insertar-ajuste-inventario")
    public String insertarAjustesInventario(@RequestBody JsonNode body) {
        ajusteInventarioServices.insertarAjustesInventario(
                body.get("descripcionProductos").asInt(),
                Date.valueOf(body.get("fecha").asText()),
                body.get("descripcionBodega").asInt(),
                body.get("desctipcionMotivo").asInt(),
                body.get("cantidad").asInt(),
                body.get("observaciones").asText()
        );
        return ("Se guardo con exito el ajuste de inventario");
    }
}
