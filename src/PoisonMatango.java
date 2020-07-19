public class PoisonMatango extends Matango {
    public PoisonMatango(char suffix) {
        super(suffix);
    }
    int poisonNumber = 5;

    public void attack(Hero h) {
        super.attack(h);
        if (this.poisonNumber != 0) {
            System.out.println("毒の胞子をばらまいた！");
            int poisonDamage = h.hp / 5;
            h.hp -= poisonDamage;
            System.out.println(poisonDamage + "ポイントのダメージ！");
            this.poisonNumber --;
        }
    }
}
