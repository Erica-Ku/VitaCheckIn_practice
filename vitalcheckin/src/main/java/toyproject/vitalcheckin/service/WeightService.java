package toyproject.vitalcheckin.service;

import toyproject.vitalcheckin.domain.Weight;

import java.util.List;

public interface WeightService {
    Weight saveWeight(Weight weight);
    List<Weight> getWeightsByUserId(String userId);
}
