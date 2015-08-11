package demos.fightgame;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("I use Knife now");
    }
}
