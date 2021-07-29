package br.com.senac.demo.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.senac.demo.entidade.Cliente;
import br.com.senac.demo.repositorio.ClienteRepositorio;

@RestController
@RequestMapping("/clientes")
public class ClienteControle {
	@Autowired
	private ClienteRepositorio clienteRepositorio;

	@GetMapping
	public List<Cliente> listarTodos() {
		return this.clienteRepositorio.findAll();
	}
}
