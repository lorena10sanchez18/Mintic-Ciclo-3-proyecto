package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Motivos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMotivosRepository extends JpaRepository<Motivos, Integer> {
    @Query(value = "SELECT * FROM motivos",nativeQuery = true)
    List<Motivos> buscarMotivos();
}
