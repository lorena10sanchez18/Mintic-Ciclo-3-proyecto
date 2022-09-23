package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository.IAjusteInventarioRepository;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.Gateway.IAjusteInventarioGateway;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AjusteInventarioServices implements IAjusteInventarioGateway {

    public final IAjusteInventarioRepository iAjusteInventarioRepository;

    public AjusteInventarioServices(IAjusteInventarioRepository iAjusteInventarioRepository) {
        this.iAjusteInventarioRepository = iAjusteInventarioRepository;
    }

    @Override
    public Void insertarAjustesInventario(Integer id_producto, Date fecha, Integer id_bodega, Integer id_motivo, Integer cantidad, String observaciones) {
        iAjusteInventarioRepository.insertarAjustesInventario(id_producto,  fecha,  id_bodega,  id_motivo,  cantidad,  observaciones);
        System.out.println("----------------------------------------");
        System.out.println(fecha);
        System.out.println("----------------------------------------");
        return null;
    }
}
