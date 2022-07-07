package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created By oothan on Jul, 2022
 */
public interface RecipeService {
 Set<Recipe> getRecipes();
}
