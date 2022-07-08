package guru.springframework.domain;

import junit.framework.TestCase;

/**
 * Created By oothan on Jul, 2022
 */
public class CategoryTest extends TestCase {

    Category category;

    public void setUp() throws Exception {
        category = new Category();
    }

    public void testGetId() {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    public void testGetDescription() {
    }

    public void testGetRecipes() {
    }
}