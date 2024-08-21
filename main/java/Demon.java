import java.util.Random;

public class Demon extends Enemy {
    private int evilSpirits;

    public Demon(int health) {
        super(health);
    }

    private void summonEvilSpirits() {
        Random random = new Random();
        evilSpirits = random.nextInt(5);
        System.out.println("Demon summons " + evilSpirits + " Evil Spirits!");
    }

    @Override
    public void attackHero(Hero hero) {
        summonEvilSpirits();
        int baseDamage = 20;
        int totalDamage = baseDamage * (evilSpirits + 1);
        hero.takeDamage(totalDamage);
        System.out.println("Demon attacks " + hero.getName() + " with increased force, damage is: " + totalDamage);
    }
}
