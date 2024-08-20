package ru.maliutin.second_level_cache.service;

import ru.maliutin.second_level_cache.model.City;

public interface CityService {

  City getCityById(Long id);

  City saveCity(City city);

}
