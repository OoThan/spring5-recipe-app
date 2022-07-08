package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * Created By oothan on Jun, 2022
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM unit_of_measure WHERE description =:description")
    Optional<UnitOfMeasure> findByDescription(@Param(value = "description") String description);
}
