package usuario.getandpost.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import usuario.getandpost.model.Usuario;

@RestController
@RequestMapping("/api")

public class UsuarioController {

    // Simulação de um banco de dados temporário
    private Map<String, Usuario> usuarios = new HashMap<>();

    @PostMapping("/usuarios")
    public ResponseEntity<String> criarUsuario(@RequestBody Usuario usuario) {
        // Verifica se o usuário já existe pelo e-mail
        if (usuarios.containsValue(usuario.getEmail())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("E-mail já cadastrado");
        }
        usuarios.put(usuario.getId(), usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário criado com sucesso");
    }

    @GetMapping("/usuarios/{usuarioId}")
    public ResponseEntity<Usuario> obterUsuario(@PathVariable String usuarioId) {
        Usuario usuario = usuarios.get(usuarioId);
        if (usuario == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuario);
    }
}