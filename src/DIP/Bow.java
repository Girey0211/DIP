package DIP;

public class Bow implements Weapon{
    @Override
    public void attack() {
        System.out.println("활로 조준 후 공격!");
    }
}
