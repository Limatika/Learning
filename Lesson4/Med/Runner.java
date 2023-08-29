package Lesson4.Med;
// Medium: Создать класс, описывающий промежуток времени.
// Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
// Создать метод для получения полного количества секунд в объекте. Создать два конструктора:
// первый принимает общее количество секунд,
// второй - часы, минуты и секунды по отдельности.
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ВВедите время в секундах ");
        Watch first = new Watch(scanner.nextInt());
        first.Perevodvhour();
        System.out.println("Введите время сколько часов ");
        int hour = scanner.nextInt();
        System.out.println("Сколько минут ");
        int minut = scanner.nextInt();
        System.out.println("Сколько секунд");
        int second = scanner.nextInt();
        Watch twu = new Watch(hour, minut, second);
        twu.Perevodvsec();
    }
}