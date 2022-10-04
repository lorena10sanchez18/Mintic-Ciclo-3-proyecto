package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services;


import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Ubicaciones;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository.IUbicacionesRepository;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.Gateway.IUbicacionesGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbicacionesServices implements IUbicacionesGateway {
    public final IUbicacionesRepository iUbicacionesRepository;

    public UbicacionesServices(IUbicacionesRepository iUbicacionesRepository) {
        this.iUbicacionesRepository = iUbicacionesRepository;
    }

    @Override
    public List<Ubicaciones> buscarUbicaciones() {
        return iUbicacionesRepository.buscarUbicaciones();
    }
}
