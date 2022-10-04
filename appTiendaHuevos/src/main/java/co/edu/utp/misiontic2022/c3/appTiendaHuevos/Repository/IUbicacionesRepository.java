package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Ubicaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
    @Repository
    public interface IUbicacionesRepository extends JpaRepository<Ubicaciones, Integer> {
        @Query(value = "SELECT * FROM ubicaciones", nativeQuery = true)
        List<Ubicaciones> buscarUbicaciones();
    }




