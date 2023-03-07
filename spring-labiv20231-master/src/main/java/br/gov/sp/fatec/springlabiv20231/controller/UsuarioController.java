package br.gov.sp.fatec.springlabiv20231.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springlabiv20231.entity.Usuario;
import br.gov.sp.fatec.springlabiv20231.service.IUsuarioService;

@RestController
@CrossOrigin
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService service;

    @GetMapping
    public List<Usuario> buscarTodosUsuarios() {
        return service.buscarTodos();
    }

    @PostMapping
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        return service.novoUsuario(usuario);
    }

    @GetMapping(value = "/id/{usuario}")
    public Usuario buscarPorId(@PathVariable("usuario") Long id) {
        return service.buscarPorId(id);
    }
    
}
