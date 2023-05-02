package org.example;
import ru.netology.javaqa6.services.CalcService;

public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        System.out.println(service.calculate(10_000, 3_000, 20_000));
        System.out.println(service.calculate(100_000, 60_000, 150_000));
        System.out.println ("количестго отпусков за год");
    }
}