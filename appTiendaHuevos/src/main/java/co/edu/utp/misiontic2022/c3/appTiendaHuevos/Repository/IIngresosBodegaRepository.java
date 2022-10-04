package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.IngresosBodega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IIngresosBodegaRepository extends JpaRepository<IngresosBodega, Integer> {
    @Query(value = "SELECT * FROM  ingresos_bodega", nativeQuery = true)
  List<IngresosBodega> buscar();



}
