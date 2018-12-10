import java.util.Scanner;
import java.lang.Math;

public class HomeWork3 {
    public static void main(String[] args) {
        //task1
        GuessNumber();

    }
    public static void GuessNumber(){
        Scanner in = new Scanner(System.in);

        int x, n = (int)(Math.random()*10);
        System.out.println("Угадайте число от 0 до 9, с трёх попыток.");
        for (int i = 0; i < 3; i++){
            System.out.println("Осталось попыток: " + (3-i));
            x = in.nextInt();
            if (x < n) System.out.println("Загаданое число - больше.");
            if (x > n) System.out.println("Загаданое число - меньше.");
            if (x == n) {System.out.println("Поздравляю,вы угадали!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                x = in.nextInt();
                if (x == 1) GuessNumber();
                else {System.out.println("Конец.");
                    break;

                }

            }
        }

        System.out.println("Вы не угадали. Правильное число:"+ n);
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        x = in.nextInt();
        if (x == 1) GuessNumber();
        else System.out.println("Конец.");



        }

    }


