package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.Gateway;


import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Productos;

import java.util.List;

public interface IProductosGateway {
    List<Productos> buscarProductos();

    void insertarProducto(Productos producto);
}
