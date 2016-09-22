package tech.ipponusa.repository;

import tech.ipponusa.domain.PtoRequest;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the PtoRequest entity.
 */
@SuppressWarnings("unused")
public interface PtoRequestRepository extends JpaRepository<PtoRequest,Long> {

}
