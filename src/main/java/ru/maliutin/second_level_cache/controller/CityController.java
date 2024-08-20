package ru.maliutin.second_level_cache.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.maliutin.second_level_cache.model.City;
import ru.maliutin.second_level_cache.service.CityService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cities")
public class CityController {

  private final CityService cityService;

  @GetMapping("/{id}")
  public City getCity(@PathVariable Long id) {
    return cityService.getCityById(id);
  }

  @PostMapping()
  public City saveCity(@RequestBody City city) {
    return cityService.saveCity(city);
  }

}
