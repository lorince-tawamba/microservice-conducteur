// Package
package tech.satic.agriapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.satic.agriapp.entity.Conducteur;

/**
 * @author Lorince TAWAMBA
 * @version 1.0.O
 * @since 27/11/2021
 */
@Repository
public interface ConducteurRepository extends JpaRepository<Conducteur, Long> {
}
