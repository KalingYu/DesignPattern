package Template;

/**
 * Created by kaling on 11/6/15.
 */
public class RefreshCafe extends RefreshDrinkTemplate {
    @Override
    public void pourPowder() {
        System.out.println("冲咖啡");
    }

    public static void main(String[] args) {
        RefreshDrinkTemplate refreshDrink = new RefreshCafe();

        refreshDrink.startBubble();
        refreshDrink = new RefreshTea();
        refreshDrink.startBubble();
    }
}
