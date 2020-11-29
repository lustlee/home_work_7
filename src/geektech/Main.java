package geektech;

public class Main {

    public static void main(String[] args) {
        Hero[] hero = {new HeroWarrior(), new HeroMagic(), new HeroMedic()};
        for (int i = 0; i < hero.length; i++) {
            hero[i].applySuperAbility("");
        }
    }

}
