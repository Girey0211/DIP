package DIP;

public class BattleService {

    private Weapon weapon;

    public BattleService(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.attack();
    }
}
