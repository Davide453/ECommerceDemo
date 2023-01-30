package com.objectmethod.demoecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.objectmethod.demoecommerce.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	Cliente findByEmailAndPassword(String email, String password);

	@Query(value = "SELECT c FROM Cliente c where (c.email= ?1 AND c.password=?2)")
	Cliente getCliente(String email, String password);

}
