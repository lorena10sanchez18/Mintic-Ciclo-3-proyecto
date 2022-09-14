package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuariosRepository extends JpaRepository<Usuarios, Integer> {

    Usuarios findByCedula(Integer cedula);

    @Query(value = "SELECT * FROM usuarios where cedula = :cedula and contrasenia = :contrasenia", nativeQuery = true)
    Usuarios buscarRol(@Param("cedula") Integer cedula, @Param("contrasenia") String contrasenia);
}
