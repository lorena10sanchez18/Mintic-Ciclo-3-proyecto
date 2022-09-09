//package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository;
//
//import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Usuarios;
//import lombok.AllArgsConstructor;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.annotation.Rollback;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Rollback(false)
//@AllArgsConstructor
//public class UsuarioRepositoryTests {
//    public final TestEntityManager entityManager;
//    public final IUsuariosRepository iUsuarioRepository;
//
//    @Test
//    public void testCrearUsuario() {
//        Usuarios usuario = new Usuarios();
//        usuario.setCedula(963852741);
//        usuario.setContrasenia("963852741");
//        usuario.setRol("AUXILIAR BODEGA");
//
//        Usuarios guardarUsuario = iUsuarioRepository.save(usuario);
//
//        Usuarios existeUsuario = entityManager.find(Usuarios.class, guardarUsuario.getIdUsuario());
//
//        assertThat(usuario.getCedula()).isEqualTo(existeUsuario.getCedula());
//    }
//}
