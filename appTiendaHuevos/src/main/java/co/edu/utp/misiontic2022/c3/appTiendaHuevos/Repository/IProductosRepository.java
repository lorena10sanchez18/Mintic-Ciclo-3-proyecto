package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface IProductosRepository extends JpaRepository<Productos, Integer> {
    @Query(value = "SELECT * FROM productos",nativeQuery = true)
    List<Productos> buscarProductos();
}
