package ru.netology.javaqa6.services;

public class CalcService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;// количество месяцев отдыха
        int money = 0;//количество заработанных денег

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {//отдыхаем
                count++;//считаем сколько месяцев отдыхаем
                money = (money - expenses) / 3;//количество оставшихся денег после отдыха
            } else {//работаем
                money = money - expenses + income;//получаем деньги
            }
        }

        return count;
    }

}

