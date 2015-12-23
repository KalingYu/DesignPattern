package template;

/**
 * Created by kaling on 15/6/16.
 */
public class RefreshTea extends RefreshDrinkTemplate {


    @Override
    public void pourPowder() {
        System.out.println("倒进茶叶");
    }


    public static void main(String[] args) {



        RefreshDrinkTemplate rt = new RefreshTea();



        rt.startBubble();
    }
}
