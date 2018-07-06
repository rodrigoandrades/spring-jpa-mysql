package com.javaee.randrades.springjpamysql.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.javaee.randrades.springjpamysql.domain.Category;
import com.javaee.randrades.springjpamysql.repositories.CategoryRepository;

@Component
@Profile({"dev", "prod"})
public class ApplicationBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	private CategoryRepository categoryRepository;
	
	public ApplicationBootstrap(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		if (categoryRepository.count() == 0L) {
			categoryRepository.deleteAll();
			loadCategories();
		}
	}
	
	private void loadCategories() {
        Category cat1 = new Category();
        cat1.setDescription("Franchise");
        categoryRepository.save(cat1);

        Category cat2 = new Category();
        cat2.setDescription("Self owner");
        categoryRepository.save(cat2);

        Category cat3 = new Category();
        cat3.setDescription("borrowing");
        categoryRepository.save(cat3);
    }
}