package com.suhoff.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class ExampleApplication {

	@Autowired
	private CityRepository cityRepository;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ExampleApplication.class);
		ConfigurableApplicationContext appContext = app.run(args);
		CityRepository repos =appContext.getBean(CityRepository.class);
		System.out.println(repos.findAll());
		System.out.println(repos.findOne(QCity.city.country.eq("US")).get());
		System.out.println(repos.findAll(QCity.city.country.eq("US"), QCity.city.name.asc()));
	}

	@PostConstruct
	private void initData() {
		cityRepository.saveAll(Arrays.asList(
//				new City().setCountry("US").setName("New York"),
				new City().setCountry("UK").setName("London"),
				new City().setCountry("FR").setName("Paris"),
				new City().setCountry("US").setName("San Francisco")
		));
	}
}
