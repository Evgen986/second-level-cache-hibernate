package ru.maliutin.second_level_cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class SecondLevelCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondLevelCacheApplication.class, args);
	}

}
