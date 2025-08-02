package Televizor;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Создание нескольких объектов Телевизора
        Televizor televizor1 = new Televizor("Samsung UE55TU7000U", 55);
        Televizor televizor2 = new Televizor("LG OLED55C8PTB", 55);

        // Дополнительная возможность задания параметров вручную или случайным образом
        System.out.println("Хотите задать параметры вручную? (yes/no)");
        String choice = scanner.nextLine().trim().toLowerCase();

        if ("yes".equals(choice)) {
            System.out.println("Введите модель второго телевизора:");
            String customModel = scanner.nextLine();
            System.out.println("Введите диагональ второго телевизора:");
            double customDiagonal = Double.parseDouble(scanner.nextLine());
            televizor2 = new Televizor(customModel, customDiagonal);
        } else {
            // Случайные параметры
            String[] models = {"Sony KD-65XH9096", "Philips 55OLED803"};
            int index = random.nextInt(models.length);

            double randDiagonal = Math.round(random.nextDouble() * 100) / 10d;

            televizor2 = new Televizor(models[index], randDiagonal);
        }

        // Демонстрация работы
        System.out.println("\nТелевизоры:\n" + televizor1 + "\n" + televizor2);

        // Пробуем включить первый телевизор
        televizor1.turnOn();
        System.out.println("\nНовый статус первого телевизора:\n" + televizor1);

        // Выключаем второй телевизор (он изначально выключен)
        televizor2.turnOff();
        System.out.println("\nНовый статус второго телевизора:\n" + televizor2);
    }
}