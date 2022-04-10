package com.empresafantasia.GerenciadorFrotas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresafantasia.GerenciadorFrotas.Entities.Motorista;
import com.empresafantasia.GerenciadorFrotas.Repositories.MotoristaRepository;


@RestController
@RequestMapping(value = "/motorista")
public class MotoristaController {
	
	@Autowired
	private MotoristaRepository repository;
	
	@GetMapping
	public List<Motorista> findAll(){
		return repository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Motorista findById(@PathVariable Long id){
		return repository.findById(id).get();
	}
	
	@PostMapping
	public Motorista insert(@RequestBody Motorista motorista) {
		return repository.save(motorista);
	}
	
	@DeleteMapping
	public void deletar(@RequestBody Motorista motorista) {
		repository.delete(motorista);
	}
}
