package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.AjustesInventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;

@Repository
public interface IAjusteInventarioRepository extends JpaRepository<AjustesInventario, Integer> {
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO DB_Tienda_Huevos.ajustes_inventario (id_producto, fecha, id_bodega, id_motivo, cantidad, observaciones) VALUES (:descripcionProductos, :fecha, :descripcionBodega, :desctipcionMotivo, :cantidad, :observaciones)",nativeQuery = true)
    void insertarAjustesInventario(@Param("descripcionProductos") Integer descripcionProductos, @Param("fecha") Date fecha, @Param("descripcionBodega") Integer descripcionBodega,  @Param("desctipcionMotivo") Integer desctipcionMotivo,  @Param("cantidad") Integer cantidad,  @Param("observaciones") String observaciones );
}

