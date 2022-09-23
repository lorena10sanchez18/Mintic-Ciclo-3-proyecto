package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.Gateway;

import java.util.Date;

public interface IAjusteInventarioGateway {

     Void insertarAjustesInventario(
             Integer id_producto,
             Date fecha,
             Integer id_bodega,
             Integer id_motivo,
             Integer cantidad,
             String observaciones);
}
