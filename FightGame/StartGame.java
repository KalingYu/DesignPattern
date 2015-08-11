package demos.fightGame;
import java.util.ArrayList;
import java.util.List;

public class StartGame {



    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("I love it");


        Character king = new Character();

        king.fight();


        king.setWeapon(new KnifeBehavior());

        king.fight();


        king.setWeapon(new SwordBehavior());
        king.fight();











    }
}
