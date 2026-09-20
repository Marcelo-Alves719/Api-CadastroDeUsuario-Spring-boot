package cadastroUsuarios.cadastro.repository;

import cadastroUsuarios.cadastro.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
