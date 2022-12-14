package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Bodegas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IBodegasRepository extends JpaRepository<Bodegas, Integer> {
    @Query(value = "SELECT * FROM bodegas", nativeQuery = true)
    List<Bodegas> buscarBodegas();
}
