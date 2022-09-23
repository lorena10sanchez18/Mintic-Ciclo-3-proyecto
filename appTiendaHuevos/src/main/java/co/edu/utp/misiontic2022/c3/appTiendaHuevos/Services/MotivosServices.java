package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Motivos;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository.IMotivosRepository;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.Gateway.IMotivosGateway;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MotivosServices implements IMotivosGateway {

    public final IMotivosRepository iMotivosRepository;

    public MotivosServices (IMotivosRepository iMotivosRepository){
        this.iMotivosRepository = iMotivosRepository;
    }

    @Override
    public List<Motivos> buscarMotivos(){
        return iMotivosRepository.buscarMotivos();
    }

}