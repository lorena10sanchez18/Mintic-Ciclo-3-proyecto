package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository.IProductosRepository;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.Gateway.IProductosGateway;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Productos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosServices implements IProductosGateway {
    public final IProductosRepository iProductosRepository;

    public ProductosServices(IProductosRepository iProductosRepository) {
        this.iProductosRepository = iProductosRepository;
    }

    @Override
    public List<Productos> buscarProductos() {
        return iProductosRepository.buscarProductos();
    }

    @Override
    public void insertarProducto(Productos producto) {
        iProductosRepository.save(producto);
    }

    @Override
    public Productos buscarProductoPorNombre(String buscarPorNombre) {
        return iProductosRepository.findByDescripcionProductos(buscarPorNombre);
    }

    @Override
    public void actualizarValorProducto(Productos producto) {
        Productos updateProducto = iProductosRepository.findByDescripcionProductos(producto.getDescripcionProductos());
        updateProducto.setValorVenta(producto.getValorVenta());
        iProductosRepository.save(updateProducto);
    }
}
