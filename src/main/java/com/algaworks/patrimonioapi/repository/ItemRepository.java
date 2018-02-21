package com.algaworks.patrimonioapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.patrimonioapi.model.Item;

/**
 * @author Karen 21 de fev de 2018
 */
public interface ItemRepository extends JpaRepository<Item, Long> {

}
