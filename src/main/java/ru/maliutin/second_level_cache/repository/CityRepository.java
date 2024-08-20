package ru.maliutin.second_level_cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.maliutin.second_level_cache.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
