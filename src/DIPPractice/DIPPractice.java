package DIPPractice;

interface Switch {
    void press();

    boolean isOn();
}


interface Switchable {
    void activate();

    void deactivate();
}

class ElectricPowerSwitch implements Switch {
    // Lamp와 Fan을 받을 수 있는 변수 'device' 선언
    private boolean on;

    /**
     * ElectricPowerSwitch()
     * @param device
     *
     * device 변수를 받는 생성자
     */

    /**
     * press()
     *
     * 현재 상태에 따라 'on'변수를 반전시키고
     * 어떤 현상이 일어났는지 출력하는 함수
     * [isOn() 함수를 사용]
     */

    /**
     * isOn()
     * @return boolean
     *
     * 'on'변수를 반환하는 함수
     */
}

class Lamp implements Switchable {
    @Override
    public void activate() {
        System.out.println("램프가 켜졌습니다.");
    }

    @Override
    public void deactivate() {
        System.out.println("램프가 꺼졌습니다.");
    }
}

class Fan implements Switchable {
    @Override
    public void activate() {
        System.out.println("팬이 켜졌습니다.");
    }

    @Override
    public void deactivate() {
        System.out.println("팬이 꺼졌습니다.");
    }
}

public class DIPPractice {
    public static void main(String[] args) {
        Switchable lamp = new Lamp();
        Switch lampSwitch = new ElectricPowerSwitch(lamp);
        lampSwitch.press();
        lampSwitch.press();

        Switchable fan = new Fan();
        Switch fanSwitch = new ElectricPowerSwitch(fan);
        fanSwitch.press();
        fanSwitch.press();
    }
}
