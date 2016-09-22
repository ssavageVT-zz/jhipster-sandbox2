package tech.ipponusa.repository;

import tech.ipponusa.domain.PtoPeriod;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the PtoPeriod entity.
 */
@SuppressWarnings("unused")
public interface PtoPeriodRepository extends JpaRepository<PtoPeriod,Long> {

}
