public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Niall", 80, 50);
        Hero mage = new Mage("Vidar", 80, 70);
        Hero archer = new Archer("Haakon", 90);
        Enemy dragon = new Dragon(20);
        Enemy demon = new Demon(40);
        Enemy ghost = new Ghost(60);
        warrior.attackEnemy(ghost);
        mage.attackEnemy(demon);
        archer.attackEnemy(dragon);
    }
}
