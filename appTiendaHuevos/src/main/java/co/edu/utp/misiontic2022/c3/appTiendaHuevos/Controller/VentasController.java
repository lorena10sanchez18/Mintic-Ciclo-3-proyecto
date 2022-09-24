package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Controller;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Ventas;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.VentasServices;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:4200")
public class VentasController {
    public final VentasServices ventasServices;
    public VentasController(VentasServices ventasServices) {
        this.ventasServices = ventasServices;
    }

    @PostMapping("/admin/ventas")
    public List<Ventas> buscarVentasPorRangoTimepo(@RequestBody JsonNode body) {
        List<Ventas> listaVentas = ventasServices.buscarPorRangoFechas(
                Date.valueOf(body.get("fechaInicial").asText()),
                Date.valueOf(body.get("fechaFinal").asText()));
        return listaVentas;
    }

    @PostMapping("/admin/total-ventas")
    public ResponseEntity<Integer> calcularTotalVentasPorRanfoFechas(@RequestBody JsonNode body) {
        return new ResponseEntity<>(
                ventasServices.calcularTotalVentasPorRanfoFechas(
                        Date.valueOf(body.get("fechaInicial").asText()),
                        Date.valueOf(body.get("fechaFinal").asText())), HttpStatus.OK);
    }

}
