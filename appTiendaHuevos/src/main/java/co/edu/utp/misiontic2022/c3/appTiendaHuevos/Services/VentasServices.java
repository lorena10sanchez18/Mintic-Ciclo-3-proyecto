package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Ventas;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository.IVentasRepository;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.Gateway.IVentasGateway;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VentasServices implements IVentasGateway {

    public final IVentasRepository iVentasRepository;

    public VentasServices(IVentasRepository iVentasRepository) {
        this.iVentasRepository = iVentasRepository;
    }

    @Override
    public List<Ventas> buscarPorRangoFechas(Date fechaInicial, Date fechaFinal) {
        List<Ventas> listaVentas = iVentasRepository.buscarPorRangoFechas(fechaInicial, fechaFinal);
        return listaVentas;

    }
    @Override
    public Integer calcularTotalVentasPorRanfoFechas(Date fechaInicial, Date fechaFinal) {
        return iVentasRepository.calcularTotalVentasPorRanfoFechas(fechaInicial,fechaFinal);
    }
}
