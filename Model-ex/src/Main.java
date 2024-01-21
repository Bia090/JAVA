import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        WorldCuisines worldCuisines = new WorldCuisines();
        try (BufferedReader reader = new BufferedReader(new FileReader("world_cuisines.csv"))) {
            String line;
            reader.readLine(); // Skip header line
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                WorldCuisines.Dish dish = new WorldCuisines.Dish(
                        data[0].trim(), // country
                        data[1].trim(), // dishName
                        data[2].trim(), // mainIngredient
                        Integer.parseInt(data[3].trim()), // cookingTime
                        Integer.parseInt(data[4].trim()), // servings
                        data[5].trim(), // spiceLevel
                        Integer.parseInt(data[6].trim()), // calories
                        Integer.parseInt(data[7].trim()), // yearIntroduced
                        data[8].trim() // chefName
                );
                if (dish.getSpiceLevel().equals("Hot")) {
                    worldCuisines.getSpicyDishesList().add(dish);
                } else {
                    worldCuisines.getNotSpicyDishesList().add(dish);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<WorldCuisines.Dish> spicyDishes = worldCuisines.getSpicyDishesList();
        for (WorldCuisines.Dish dish : spicyDishes) {
            if (dish.getCookingTime() < 50) {
                System.out.println(dish);
            }
        }
        Collections.sort(worldCuisines.getNotSpicyDishesList(), new Comparator<WorldCuisines.Dish>() {
            @Override
            public int compare(WorldCuisines.Dish d1, WorldCuisines.Dish d2) {
                return Integer.compare(d2.getYearIntroduced(), d1.getYearIntroduced());
            }
        });
        System.out.println("Not Spicy Dishes Sorted by Year Introduced:");
        int currentDecade = -1;
        for (WorldCuisines.Dish dish : worldCuisines.getNotSpicyDishesList()) {
            int decade = (dish.getYearIntroduced() / 10) * 10;
            if (decade != currentDecade) {
                currentDecade = decade;
                System.out.println("\nDecade: " + currentDecade);
            }
            System.out.println(dish);
        }
        // Ex 4: Grouping _spicyDishesList by Country (Excluding Asian Countries)
        String[] asianCountries = {"Japan", "India", "Thailand", "China", "South Korea"};
        Map<String, List<WorldCuisines.Dish>> countryDishesMap = new HashMap<>();
        for (WorldCuisines.Dish dish : worldCuisines.getSpicyDishesList()) {
            if (!arrayContains(asianCountries, dish.getCountry())) {
                countryDishesMap.computeIfAbsent(dish.getCountry(), k -> new ArrayList<>()).add(dish);
            }
        }
        System.out.println("\nSpicy Dishes Grouped by Country (Excluding Asian Countries):");
        for (Map.Entry<String, List<WorldCuisines.Dish>> entry : countryDishesMap.entrySet()) {
            System.out.println("\nCountry: " + entry.getKey());
            for (WorldCuisines.Dish dish : entry.getValue()) {
                System.out.println(dish);
            }
            System.out.println("\n\n");
        }
    }

    private static boolean arrayContains(String[] array, String value) {
        for (String item : array) {
            if (item.equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }
}