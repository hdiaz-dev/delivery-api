package com.hermenegildo.delivery_api.repository;

import com.hermenegildo.delivery_api.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {
}
