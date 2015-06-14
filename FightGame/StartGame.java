package FightGame;

public class StartGame {
    public static void main(String[] args) {
        Character king = new Character();
        king.fight();
        king.setWeapon(new KnifeBehavior());
        king.fight();
    }
}
