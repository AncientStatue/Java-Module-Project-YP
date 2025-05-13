import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Race race = new Race();
		System.out.println("— Введите название машины №1: ");
		String name = scanner.next();
		System.out.println("— Введите скорость машины №1: ");
		int speed = needForSpeed();
		Car car = new Car(name, speed);
		race.findLeader(car);
		System.out.println("— Введите название машины №2: ");
		car.name = scanner.next();
		System.out.println("— Введите скорость машины №2: ");
		car.speed = needForSpeed();
		race.findLeader(car);
		System.out.println("— Введите название машины №3: ");
		car.name = scanner.next();
		System.out.println("— Введите скорость машины №3: ");
		car.speed = needForSpeed();
		race.findLeader(car);
		System.out.println("Самая быстрая машина: " + race.getLeadingCarName());
		scanner.close();
	}

	public static int needForSpeed() {
		int speed = 0;
		boolean speedIsCorrect = false;
		while (!speedIsCorrect) {
			if (scanner.hasNextInt()) {
				int enteredSpeed = scanner.nextInt();
				if ((enteredSpeed >= 0) && (enteredSpeed <= 250)) {
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
