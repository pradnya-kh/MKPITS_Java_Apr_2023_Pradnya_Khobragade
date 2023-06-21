
public class Recipe {
    public void cook() {
        System.out.println("Cooking the basic version of the recipe");
        // Code to cook the basic version of the recipe
    }

    public void cook(String ingredient1) {
        System.out.println("Cooking the recipe with " + ingredient1);
        // Code to cook the recipe with the specified ingredient
    }

    public void cook(String ingredient1, String ingredient2) {
        System.out.println("Cooking the recipe with " + ingredient1 + " and " + ingredient2);
        // Code to cook the recipe with the specified ingredients
    }

    public void cook(String ingredient1, String ingredient2, String instruction) {
        System.out.println("Cooking the recipe with " + ingredient1 + " and " + ingredient2 + " using " + instruction);
        // Code to cook the recipe with the specified ingredients and instructions
    }
}

