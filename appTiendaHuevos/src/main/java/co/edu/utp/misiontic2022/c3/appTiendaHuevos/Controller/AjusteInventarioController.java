package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Controller;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.AjusteInventarioServices;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http:/localhost:4200")

public class AjusteInventarioController {

    public final AjusteInventarioServices ajusteInventarioServices;

    public AjusteInventarioController(AjusteInventarioServices ajusteInventarioServices) {
        this.ajusteInventarioServices = ajusteInventarioServices;
    }

    @PostMapping("/insertar-ajuste-inventario")
    public String insertarAjustesInventario(@RequestBody JsonNode body) {
        System.out.println("----------------------------------------");
        System.out.println(body);
        System.out.println(Date.valueOf(body.get("fecha").asText()));
        System.out.println("----------------------------------------");

        ajusteInventarioServices.insertarAjustesInventario(
                body.get("id_producto").asInt(),
                Date.valueOf(body.get("fecha").asText()),
                body.get("id_bodega").asInt(),
                body.get("id_motivo").asInt(),
                body.get("cantidad").asInt(),
                body.get("observaciones").asText()
        );
        return "Se inserto con exito en ajuste inventario";
    }

}
