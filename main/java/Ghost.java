import java.util.Random;

public class Ghost extends Enemy {
    public Ghost(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        Random random = new Random();
        boolean passThrough = random.nextBoolean();
        int baseDamage = 15;
        int totalDamage = passThrough ? baseDamage * 2 : baseDamage;
        if (passThrough) {
            System.out.println("Ghost is passing through " + hero.getName() + ". Received double damage: " + totalDamage + "!");
        } else {
            System.out.println("Ghost attacks!" + hero.getName() + " got " + totalDamage + " damage.");
        }
        hero.takeDamage(totalDamage);
    }
}
