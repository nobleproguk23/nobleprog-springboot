package org.nobleprog.springboot.rest.repository;

import org.nobleprog.springboot.rest.mode.ShipmentInstruction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentInstructionRepository extends JpaRepository<ShipmentInstruction, Integer> {

}
