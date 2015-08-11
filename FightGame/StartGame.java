package demos.fightgame;

import java.util.ArrayList;
import java.util.List;

/**
 * 装饰者模式
 */
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
