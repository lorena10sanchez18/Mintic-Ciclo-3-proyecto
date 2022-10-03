package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IVentasRepository extends JpaRepository<Ventas, Integer> {

    @Query(value = "SELECT * FROM ventas WHERE fecha BETWEEN :fechaInicial AND :fechaFinal ORDER BY fecha ASC",nativeQuery = true)
    List<Ventas> buscarPorRangoFechas(@Param("fechaInicial") Date fechaInicial, @Param("fechaFinal") Date fechaFinal);

    @Query(value = "SELECT SUM(valor_total) FROM ventas WHERE fecha BETWEEN :fechaInicial AND :fechaFinal", nativeQuery = true)
    Integer calcularTotalVentasPorRanfoFechas(@Param("fechaInicial") Date fechaInicial, @Param("fechaFinal") Date fechaFinal);
}
