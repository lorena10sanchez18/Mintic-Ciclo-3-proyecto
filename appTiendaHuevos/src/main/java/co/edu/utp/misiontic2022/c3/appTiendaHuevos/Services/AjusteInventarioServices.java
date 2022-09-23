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
    public Void insertarAjustesInventario(
            Integer descripcionProductos,
            Date fecha,
            Integer descripcionBodega,
            Integer desctipcionMotivo,
            Integer cantidad,
            String observaciones) {
        iAjusteInventarioRepository.insertarAjustesInventario(
                descripcionProductos,
                fecha,
                descripcionBodega,
                desctipcionMotivo,
                cantidad,
                observaciones);
        return null;
    }
}
