package com.example.catalog;

import com.example.catalog.domain.entity.Category;
import com.example.catalog.domain.entity.Genre;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CatalogApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Genre genre = new Genre("Genre 1");
		Category category1 = new Category("Category 1");
		System.out.println("Genre id name categories:" + genre.getId() + " " + genre.getName() +  "" + genre.getCategories()) ;
		genre.addCategory(category1);
	}
}
