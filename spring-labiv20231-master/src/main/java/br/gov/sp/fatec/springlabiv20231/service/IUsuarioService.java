package br.gov.sp.fatec.springlabiv20231.service;

import java.util.List;

import br.gov.sp.fatec.springlabiv20231.entity.Usuario;

public interface IUsuarioService {

    public List<Usuario> buscarTodos();

    public Usuario buscarPorId(Long id);
    
    public Usuario novoUsuario(Usuario usuario);
}
