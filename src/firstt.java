/**
 * Created by User on 02.08.2017.
 */
//вывод случайных чисел в данном диапоазоне 

import java.util.Random;
import java.util.Scanner ;
public class firstt {
    public static void main(String[] args) {
         Random rnd=new Random();
        for (int i = 2; i >= 0; i--) {
            System.out.print("  " + rnd.nextInt(99));

        }
    }
}
