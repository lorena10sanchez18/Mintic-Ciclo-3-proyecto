package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Controller;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.ProductosServices;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Productos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http:/localhost:4200")

public class ProductosController {
    public final ProductosServices productosServices;

    public ProductosController(ProductosServices productosServices) {
        this.productosServices = productosServices;
    }

    @GetMapping("/mostrarproductos")
    public List<Productos> buscarProductos() {
        return (productosServices.buscarProductos());
    }


    @GetMapping("/mostrarproducto")
    public ResponseEntity<Productos> buscarProducto() {
        return new ResponseEntity<Productos>(
                productosServices.buscarProductos().get(0),
                HttpStatus.OK);
    }


}
