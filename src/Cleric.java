import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた！");
        this.mp -= 5;
        this.hp = 50;
        System.out.println("HPが最大まで回復した");
    }

    public int pray(int second) {
        int recover = new Random().nextInt(3) + second;
        int actualRecover = Math.min(this.MAX_HP - this.hp, recover);
        return actualRecover;
    }
}
