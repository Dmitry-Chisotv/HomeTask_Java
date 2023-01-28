import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(0, 2000);
        System.out.println("i = " + i);

        //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = 1;
        int p = 2;
        while (p * 2 <= i) {
            p = p * 2;
            n++;
        }
        System.out.println("n = " + n);

        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int ar=(Short.MAX_VALUE - i)/n;
        System.out.println("Длинна массива m1 = " + ar);
        System.out.println("Все кратные " + n + " числа в диапазоне от " + i + " до Short.MAX_VALUE в массивe m1:");
        int [] m1 = new int[ar] ;
        for (int mv = i; mv <= Short.MAX_VALUE; mv++) {
            if (mv % n == 0) {
                m1[i] = mv;
                System.out.print(m1[i] + "; ");
                }
            }

        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int ar2=Short.MAX_VALUE - i-ar;
        System.out.println();
        System.out.println("Длинна массива m2 = " + ar2);
        System.out.println("Все некратные " + n + " числа в диапазоне от Short.MAX_VALUE до " + i + " в массивe m2:");
        int [] m2 = new int[ar2] ;
        for (int mv = Short.MAX_VALUE; mv >=i ; mv--) {
            if (mv % n != 0) {
                m2[i] = mv;
                System.out.print(m2[i] + "; ");
            }
        }
    }
}
