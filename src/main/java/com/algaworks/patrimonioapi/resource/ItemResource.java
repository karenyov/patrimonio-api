package com.algaworks.patrimonioapi.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.patrimonioapi.model.Item;
import com.algaworks.patrimonioapi.repository.ItemRepository;

/**
 * @author Karen 21 de fev de 2018
 */
@RestController
public class ItemResource {

	@Autowired
	private ItemRepository itemRepository;

	@GetMapping("/itens")
	public List<Item> listar() {
		return itemRepository.findAll();
	}

	@PostMapping("/itens")
	public Item adicionar(@RequestBody @Valid Item item) {
		return itemRepository.save(item);
	}
}
