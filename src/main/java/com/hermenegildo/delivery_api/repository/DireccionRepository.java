package com.hermenegildo.delivery_api.repository;

import com.hermenegildo.delivery_api.model.Direccion;
import com.hermenegildo.delivery_api.model.EstatusDireccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long> {

    @Query(value = "SELECT * FROM direcciones WHERE cliente_id = :clienteId",nativeQuery = true)
    List<Direccion> buscarPorCliente(@Param("clienteId") Long clienteId);

    @Query(value = "SELECT * FROM direcciones WHERE cliente_id = :clienteId AND estatus = :estatus", nativeQuery = true)
    List<Direccion> buscarPorClienteYEstatus(@Param("clienteId") Long clienteId, @Param("estatus") String estatus);

    @Query(value = "SELECT * FROM direcciones WHERE codigo_postal = :cp AND estatus = 'VALIDADA'", nativeQuery = true)
    List<Direccion> buscarValidadasPorCp(@Param("cp") String cp);
}