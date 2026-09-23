package cadastroUsuarios.cadastro.controller;

import cadastroUsuarios.cadastro.model.Usuario;
import cadastroUsuarios.cadastro.repository.UsuarioRepository;
import cadastroUsuarios.cadastro.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario){
        return service.cadastrar(usuario);
    }

    @GetMapping
    public List<Usuario> listar(){
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
        return service.atualizar(id, usuario);
    }




}
