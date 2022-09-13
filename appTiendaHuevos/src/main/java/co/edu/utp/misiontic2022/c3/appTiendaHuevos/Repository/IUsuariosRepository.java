package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuariosRepository extends JpaRepository<Usuarios, Integer> {

    Usuarios findByCedula(Integer cedula);
}
