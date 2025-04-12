public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        int age1 = 18;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        int age2 = 16;
        if (age2 >= 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age2 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }


        System.out.println("задание 2");
        int temperature1 = 3;
        if (temperature1 < 5) {
            System.out.println("На улице " + temperature1 + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature1 + " градусов, можно идти без шапки");
        }

        int temperature2 = 10;
        if (temperature2 < 5) {
            System.out.println("На улице " + temperature2 + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature2 + " градусов, можно идти без шапки");
        }

        System.out.println("задание 3");
        int speed1 = 70;
        if (speed1 > 60) {
            System.out.println("Если скорость " + speed1 + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed1 + ", то можно ездить спокойно");
        }

        int speed2 = 55;
        if (speed2 > 60) {
            System.out.println("Если скорость " + speed2 + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed2 + ", то можно ездить спокойно");
        }

        System.out.println("задание 4");
        int age3 = 4;
        if (age3 >= 2 && age3 <= 6) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
        } else if (age3 >= 7 && age3 <= 17) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        } else if (age3 >= 18 && age3 <= 24) {
            System.out.println("Если возраст человека равен " + age3 + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age3 + ", то ему пора ходить на работу");
        }

        int age4 = 10;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
        } else if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
        } else if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age4 + ", то ему пора ходить на работу");
        }

        int age5 = 20;
        if (age5 >= 2 && age5 <= 6) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в детский сад");
        } else if (age5 >= 7 && age5 <= 17) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в школу");
        } else if (age5 >= 18 && age5 <= 24) {
            System.out.println("Если возраст человека равен " + age5 + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age5 + ", то ему пора ходить на работу");
        }

        int age6 = 30;
        if (age6 >= 2 && age6 <= 6) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в детский сад");
        } else if (age6 >= 7 && age6 <= 17) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в школу");
        } else if (age6 >= 18 && age6 <= 24) {
            System.out.println("Если возраст человека равен " + age6 + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age6 + ", то ему пора ходить на работу");
        }

        System.out.println("задание 5");
        int age7 = 4;
        boolean hasAdult1 = true;
        if (age7 < 5) {
            System.out.println("Если возраст ребенка равен " + age7 + ", то ему нельзя кататься на аттракционе");
        } else if (age7 >= 5 && age7 < 14) {
            if (hasAdult1) {
                System.out.println("Если возраст ребенка равен " + age7 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + age7 + ", то ему нельзя кататься на аттракционе");
            }
        } else {
            System.out.println("Если возраст ребенка равен " + age7 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int age8 = 10;
        boolean hasAdult2 = false;
        if (age8 < 5) {
            System.out.println("Если возраст ребенка равен " + age8 + ", то ему нельзя кататься на аттракционе");
        } else if (age8 >= 5 && age8 < 14) {
            if (hasAdult2) {
                System.out.println("Если возраст ребенка равен " + age8 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + age8 + ", то ему нельзя кататься на аттракционе");
            }
        } else {
            System.out.println("Если возраст ребенка равен " + age8 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int age9 = 15;
        boolean hasAdult3 = true;
        if (age9 < 5) {
            System.out.println("Если возраст ребенка равен " + age9 + ", то ему нельзя кататься на аттракционе");
        } else if (age9 >= 5 && age9 < 14) {
            if (hasAdult3) {
                System.out.println("Если возраст ребенка равен " + age9 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + age9 + ", то ему нельзя кататься на аттракционе");
            }
        } else {
            System.out.println("Если возраст ребенка равен " + age9 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }


        System.out.println("задание 6");
        int occupiedSeats = 70;

        if (occupiedSeats == 102) {
            System.out.println("Вагон полностью забит");
        } else if (occupiedSeats < 60) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        } else {
            System.out.println("В вагоне есть только стоячие места");
        }

        System.out.println("задание 7");
        int one = 10;
        int two = 5;
        int three = 15;

        if (one > two && one > three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}