package com.objectmethod.demoecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.objectmethod.demoecommerce.model.Carrello;
import com.objectmethod.demoecommerce.model.Cliente;

@Repository
public interface CarrelloRepository extends JpaRepository<Carrello, Integer> {

	List<Carrello> findByC(Cliente c);
}
