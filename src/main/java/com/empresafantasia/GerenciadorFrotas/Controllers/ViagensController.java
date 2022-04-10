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


import com.empresafantasia.GerenciadorFrotas.Entities.Viagens;
import com.empresafantasia.GerenciadorFrotas.Repositories.ViagensRepository;

@RestController
@RequestMapping(value = "/viagens")
public class ViagensController {
	
	@Autowired
	private ViagensRepository repository;
	
	@GetMapping
	public List<Viagens> findAll(){
		return repository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Viagens findById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public Viagens insert(@RequestBody Viagens viagens) {
		return repository.save(viagens);
	}
	
	@DeleteMapping
	public void deletar(@RequestBody Viagens viagens) {
		repository.delete(viagens);
		
	}

}
