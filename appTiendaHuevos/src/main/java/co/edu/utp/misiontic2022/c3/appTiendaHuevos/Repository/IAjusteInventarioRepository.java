package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.AjustesInventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface IAjusteInventarioRepository extends JpaRepository<AjustesInventario, Integer> {
    @Query(value = "INSERT INTO ajustes_inventario (id_producto, fecha, id_bodega, id_motivo, cantidad, observaciones) VALUES (:id_producto, :fecha, :id_bodega, :id_motivo, :cantidad, :observaciones)",nativeQuery = true)
    Void insertarAjustesInventario(@Param("id_producto") Integer id_producto, @Param("fecha") Date fecha, @Param("id_bodega") Integer id_bodega,  @Param("id_motivo") Integer id_motivo,  @Param("cantidad") Integer cantidad,  @Param("observaciones") String observaciones );
}

