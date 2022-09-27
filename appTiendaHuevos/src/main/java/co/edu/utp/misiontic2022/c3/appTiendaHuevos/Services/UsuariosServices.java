package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services;


import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Usuarios;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository.IUsuariosRepository;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.Gateway.IUsuariosGateway;
import org.springframework.stereotype.Service;
@Service
public class UsuariosServices implements IUsuariosGateway {
    public final IUsuariosRepository iUsuariosRepository;

    public UsuariosServices(IUsuariosRepository iUsuariosRepository) {
        this.iUsuariosRepository = iUsuariosRepository;
    }
    @Override
    public Usuarios buscarUsuarioPorCedula(Integer cedula){
        return iUsuariosRepository.findByCedula(cedula);
    }

    @Override
    public Usuarios buscarRol(Integer cedula, String contrasenia){
        return iUsuariosRepository.buscarRol(cedula ,contrasenia);
    }

    @Override
    public void insertarUsuarios(Usuarios usuario) {
        iUsuariosRepository.save(usuario);
    }
}