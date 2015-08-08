package FightGame;

public class Character {

    WeaponBehavior weaponBehavior;

    public Character() {
        this.weaponBehavior = new SwordBehavior();
    }

    public void setWeapon(WeaponBehavior wp) {
        this.weaponBehavior = wp;
    }


    public void fight() {
        weaponBehavior.useWeapon();
    }


}
