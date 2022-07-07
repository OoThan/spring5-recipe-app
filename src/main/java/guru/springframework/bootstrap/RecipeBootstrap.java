package guru.springframework.bootstrap;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.RecipeRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created By oothan on Jul, 2022
 */
@Slf4j
@Component
public class RecipeBootstrap implements ApplicationListener<ContextRefreshedEvent> {

 private final CategoryRepository categoryRepository;
 private final RecipeRepository recipeRepository;
 private final UnitOfMeasureRepository unitOfMeasureRepository;

 public RecipeBootstrap(CategoryRepository categoryRepository, RecipeRepository recipeRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
  this.categoryRepository = categoryRepository;
  this.recipeRepository = recipeRepository;
  this.unitOfMeasureRepository = unitOfMeasureRepository;
 }

 @Override
 @Transactional
 public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
  recipeRepository.saveAll()
 }

 private List<Recipe> getRecipes() {

 }
}
