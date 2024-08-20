package ru.maliutin.second_level_cache.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.maliutin.second_level_cache.model.City;
import ru.maliutin.second_level_cache.repository.CityRepository;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

  private final CityRepository cityRepository;

  @Override
  @Transactional(readOnly = true)
  public City getCityById(Long id) {
    return cityRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public City saveCity(City city) {
    return cityRepository.save(city);
  }
}
