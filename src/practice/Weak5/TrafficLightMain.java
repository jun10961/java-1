package practice.Weak5;

enum TrafficLight {
    RED(30), AMBER(10), GREEN(30);  // 상수 지정05
    int seconds;

    TrafficLight(int seconds) { this.seconds = seconds; }
    int getSeconds() { return seconds; } // 유지 시간 확인용 함수
}


public class TrafficLightMain {
    public static void main(String[] args){
        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%s: 유지 시간: %d\n", light,
                    light.getSeconds());
        }
    }
}
