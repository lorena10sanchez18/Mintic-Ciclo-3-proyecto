package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Controller;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Usuarios;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.ProductosServices;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Productos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:4200")

public class ProductosController {
    public final ProductosServices productosServices;

    public ProductosController(ProductosServices productosServices) {
        this.productosServices = productosServices;
    }

    @GetMapping("/mostrar-productos")
    public List<Productos> buscarProductos() {
        return (productosServices.buscarProductos());
    }

    @PostMapping("/insertar-producto")
    public String insertarProducto(@RequestBody Productos producto) {
        productosServices.insertarProducto(producto);
        return "Se creo con exito el producto";
    }

    @GetMapping("/mostrar-producto-por-nombre/{productoPorNombre}")
    public Productos buscarProdcutoPorNombre(@PathVariable String productoPorNombre)
    {return (productosServices.buscarProductoPorNombre(productoPorNombre));}

    @PostMapping("/actualizar-valor-producto")
    public String actualizarValorProducto(@RequestBody  Productos producto) {
        productosServices.actualizarValorProducto(producto);
        return "Se actualizo el valor de venta del producto con exito";
    }


}
