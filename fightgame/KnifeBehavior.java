package fightgame;

public class KnifeBehavior implements fightgame.WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("I use Knife now");
    }
}
