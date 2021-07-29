package br.com.senac.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.demo.entidade.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

}
