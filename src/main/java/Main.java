import java.util.Scanner;
public class Main {
    //public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        String leaderName = "";
        Car[] cars = new Car[2];
        for(int i = 0; i < 3; i++) {
            System.out.println("— Введите название машины №" + (i + 1) + ": ");
            String name = scanner.next();
            System.out.println("— Введите скорость машины №" + (i + 1) + ": ");
            int speed = needForSpeed();
            Car car = new Car(name, speed);
            cars[i] = car;
            leaderName = race.findLeader(name, speed);
        }
        System.out.println("Самая быстрая машина: " + leaderName);
        scanner.close();
    }
    public static int needForSpeed() {
        Scanner scanner = new Scanner(System.in);
        int speed = 0;
        boolean speedIsCorrect = false;
        while(!speedIsCorrect) {
            if(scanner.hasNextInt()) {
                int enteredSpeed = scanner.nextInt();
                if((enteredSpeed >= 0) && (enteredSpeed <= 250)) {
                    speed = enteredSpeed;
                    speedIsCorrect = true;
                } else {
                    System.out.println("— Неправильная скорость ");
                }
            } else {
                System.out.println("— Неправильная скорость ");
            }
        }
        scanner.close();
        return speed;

    }
}
