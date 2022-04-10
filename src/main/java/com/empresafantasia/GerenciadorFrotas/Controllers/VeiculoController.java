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

import com.empresafantasia.GerenciadorFrotas.Entities.Veiculo;
import com.empresafantasia.GerenciadorFrotas.Repositories.VeiculoRepository;

@RestController
@RequestMapping(value = "/veiculo")
public class VeiculoController {
	
	@Autowired
	private VeiculoRepository repository; 
	
	@GetMapping
	public List<Veiculo> findAll(){
		List<Veiculo> result = repository.findAll();
		return result;
	}
	@GetMapping(value = "/{id}")
	public Veiculo findById(@PathVariable Long id){
		return repository.findById(id).get();	
	}
	@PostMapping
	public Veiculo insert(@RequestBody Veiculo veiculo) {
		return repository.save(veiculo);
	}
	
	@DeleteMapping
	public void deletar(@RequestBody Veiculo veiculo) {
		repository.delete(veiculo);
	}

}
