package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.Gateway;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Ventas;

import java.util.Date;
import java.util.List;

public interface IVentasGateway {

    List<Ventas> buscarPorRangoFechas(Date fechaInicial, Date fechaFinal);

    Integer calcularTotalVentasPorRanfoFechas(Date fechaInicial, Date fechaFinal);
}
