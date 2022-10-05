public class Demo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost : " + vegMeal.getCost());

        Meal meatMeal = mealBuilder.prepareMeatMeal();
        System.out.println("Meat Meal");
        meatMeal.showItems();
        System.out.println("Total Cost : " + meatMeal.getCost());
    }
}