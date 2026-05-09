package com.hermenegildo.delivery_api.repository;

import com.hermenegildo.delivery_api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	@Query(value = "SELECT * FROM clientes WHERE nombre ILIKE %:nombre%", 
		       nativeQuery = true)
		List<Cliente> buscarPorNombre(@Param("nombre") String nombre);

    @Query(value = "SELECT * FROM clientes WHERE telefono = :telefono", 
           nativeQuery = true)
    Cliente buscarPorTelefono(@Param("telefono") String telefono);

}