package toyproject.vitalcheckin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toyproject.vitalcheckin.domain.Weight;

import java.util.List;

public interface WeightRepository extends JpaRepository<Weight, String> {
    List<Weight> findByUserId(String userId);
}
