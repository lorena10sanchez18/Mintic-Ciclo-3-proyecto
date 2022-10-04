package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.IngresosBodega;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository.IIngresosBodegaRepository;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.Gateway.IIngresosBodegaGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngresosBodegaService implements IIngresosBodegaGateway {
    public final IIngresosBodegaRepository iIngresosBodegaRepository;

    public IngresosBodegaService(IIngresosBodegaRepository iIngresosBodegaRepository) {
        this.iIngresosBodegaRepository = iIngresosBodegaRepository;
    }

    @Override
    public Void agregarIngresosBodega(IngresosBodega ingresosBodega) {
        iIngresosBodegaRepository.save(ingresosBodega);
        return null;
    }

    @Override
    public List<IngresosBodega> consultaIngresosBodega() {
        return iIngresosBodegaRepository.buscar();
    }


}
