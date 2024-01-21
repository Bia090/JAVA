import java.util.ArrayList;
import java.util.List;
public class WorldCuisines {
    private List<Dish> _spicyDishesList;
    private List<Dish> _notSpicyDishesList;
    public WorldCuisines() {
        _spicyDishesList = new ArrayList<>();
        _notSpicyDishesList = new ArrayList<>();
    }
    // Getters and Setters
    public List<Dish> getSpicyDishesList() {
        return _spicyDishesList;
    }
    public List<Dish> getNotSpicyDishesList() {
        return _notSpicyDishesList;
    }
    public static class Dish {
        private String country;
        private String dishName;
        private String mainIngredient;
        private int cookingTime;
        private int servings;
        private String spiceLevel;
        private int calories;
        private int yearIntroduced;
        private String chefName;
        public Dish(String country, String dishName, String mainIngredient, int cookingTime, int servings, String spiceLevel, int calories,
                    int yearIntroduced, String chefName) {
            this.country = country;
            this.dishName = dishName;
            this.mainIngredient = mainIngredient;
            this.cookingTime = cookingTime;
            this.servings = servings;
            this.spiceLevel = spiceLevel;
            this.calories = calories;
            this.yearIntroduced = yearIntroduced;
            this.chefName = chefName;
        }
        public String getCountry() {
            return country;
        }
        public int getCookingTime() {
            return cookingTime;
        }
        public String getSpiceLevel() {
            return spiceLevel;
        }
        public int getYearIntroduced() {
            return yearIntroduced;
        }
        @Override
        public String toString() {
            return "Dish{" +
                    "country='" + country + '\'' +
                    ", dishName='" + dishName + '\'' +
                    ", mainIngredient='" + mainIngredient + '\'' +
                    ", cookingTime=" + cookingTime +
                    ", servings=" + servings +
                    ", spiceLevel='" + spiceLevel + '\'' +
                    ", calories=" + calories +
                    ", yearIntroduced=" + yearIntroduced +
                    ", chefName='" + chefName + '\'' +
                    '}';
        }
    }
}
