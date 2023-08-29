package Lesson4.Easy;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Введите ширину прямоугольника ");
        int width=scanner.nextInt();
        System.out.println("Введите длинну прямоугольника");
        int leght=scanner.nextInt();
        Rectangle first = new Rectangle<>(width,leght);
        System.out.println("Периметр прямоугольника " + first.parimeter());
        System.out.println("Площадь прямоугольника " + first.square());
    }
}