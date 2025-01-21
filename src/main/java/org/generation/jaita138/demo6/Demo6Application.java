package org.generation.jaita138.demo6;

import java.util.List;

import org.generation.jaita138.demo6.db.entity.Building;
import org.generation.jaita138.demo6.db.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo6Application implements CommandLineRunner {

	@Autowired
	private BuildingService buildingService;

	public static void main(String[] args) {
		SpringApplication.run(Demo6Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hello, World!");
		System.out.println("--------------------------------");
		System.out.println("CREATE NEW BUILDING");

		// CREATE NEW BUILDING
		Building building = new Building();
		building.setName("The White House");
		building.setAddress("1600 Pennsylvania Avenue NW");
		building.setCity("Washington");
		building.setCountry("US");
		building.setArea(5111);
		building.setFloors(6);
		building.setSwimmingPool(true);
		building.setElevator(true);

		System.out.println(building);
		System.out.println("--------------------------------");
		System.out.println("STORE NEW BUILDING");

		// STORE NEW BUILDING
		buildingService.save(building);
		System.out.println(building);
		System.out.println("--------------------------------");
		System.out.println("LIST ALL BUILDINGS");

		// LIST ALL AVAILABLE BUILDINGS
		List<Building> buildings = buildingService.findAll();
		System.out.println(buildings);

		// SELECT FIRST BUILDING AND UPDATE IT
		Building firstBuilding = buildings.get(0);
		firstBuilding.setName("La Casa Bianca");
		firstBuilding.setDeleted(true);
		buildingService.save(firstBuilding);

		// SELECT SECOND BUILDING AND DELETE IT
		Building secondBuilding = buildings.get(1);
		buildingService.delete(secondBuilding);
		System.out.println("--------------------------------");
		System.out.println("LIST ALL ACTIVE BUILDINGS");

		// LIST ALL ACTIVE BUILDINGS
		List<Building> activeBuildings = buildingService.findActive();
		System.out.println(activeBuildings);

		System.out.println("--------------------------------");
		System.out.println("The end");
	}
}
