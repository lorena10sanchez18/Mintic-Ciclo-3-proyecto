package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository.IBodegasRepository;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.Gateway.IBodegasGateway;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Bodegas;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BodegasServices implements IBodegasGateway {
    public final IBodegasRepository iBodegasRepository;

    public BodegasServices(IBodegasRepository iBodegasRepository) {
        this.iBodegasRepository = iBodegasRepository;}

    @Override
    public List<Bodegas> buscarBodegas() {
        return iBodegasRepository.buscarBodegas();

    }
}
