package br.gov.sp.fatec.springlabiv20231.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springlabiv20231.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
