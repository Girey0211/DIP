package notDIP;

class Sword {
    public void attack() {
        System.out.println("검으로 베기!");
    }
}

class Bow {
    public void attack() {
        System.out.println("Attacking with bow!");
    }
}

public class BattleService {
    private Sword sword;
    private Bow bow;

    public void attack(String weaponName) {
        if (weaponName.equals("Sword")) {
            sword.attack();
        } else {
            bow.attack();
        }
    }
}
