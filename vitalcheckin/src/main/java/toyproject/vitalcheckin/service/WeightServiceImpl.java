package toyproject.vitalcheckin.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import toyproject.vitalcheckin.domain.Weight;
import toyproject.vitalcheckin.repository.WeightRepository;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class WeightServiceImpl implements WeightService{
    private final WeightRepository weightRepository;

    @Override
    public Weight saveWeight(Weight weight) {
        return weightRepository.save(weight);
    }

    @Override
    public List<Weight> getWeightsByUserId(String userId) {
        return weightRepository.findByUserId(userId);
    }
}
