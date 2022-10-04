package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.Gateway;



import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.IngresosBodega;

import java.util.List;

public interface IIngresosBodegaGateway {

    Void agregarIngresosBodega(IngresosBodega ingresosBodega);

    List<IngresosBodega> consultaIngresosBodega();

}
