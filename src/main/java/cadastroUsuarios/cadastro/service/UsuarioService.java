package cadastroUsuarios.cadastro.service;

import cadastroUsuarios.cadastro.model.Usuario;
import cadastroUsuarios.cadastro.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository){
        this.repository = repository;
    }

    public Usuario cadastrar(Usuario usuario) {
        return repository.save(usuario);
    }

    public void deletar(Long id) { repository.deleteById(id);}

    public Usuario atualizar(Long id, Usuario usuario) {

        Usuario usuarioExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        usuarioExistente.setNome(usuario.getNome());
        usuarioExistente.setEmail(usuario.getEmail());

        return repository.save(usuarioExistente);
    }


    public List<Usuario> listar() {
        return repository.findAll();
    }
}
