package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Repository.IUsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioServices implements IUsuarioRepository {

    public final IUsuarioRepository iUsuarioRepository;

    @Override
    public void fin(String nome) {}
}
