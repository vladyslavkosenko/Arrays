import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("1. Заповнити масив тільки парними числами");

        int[] arr = new int[10];

        for (int i = 1; i < arr.length; i++) {
            if ((i % 2) == 0 ) {
                arr[i] = i;
                System.out.println(arr[i]);

            }
       
        }

        System.out.println("2. Заповнити масив рандомними числами");
        Random random = new Random();
        int[] randomArr = new int[10];
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = random.nextInt(10);
            System.out.println(randomArr[i]);
        }
        System.out.println(" ");


        System.out.println("3. Вивести середнє значення масиву");
        int sum = 0;
        for (int i = 0; i < randomArr.length; i++) {
            sum = sum + randomArr[i];

        }
        System.out.println(sum / randomArr.length);


        System.out.println("4. Вивести суму всіх значень кратних 3");
        int sumМalues = 0;
        for (int i = 0; i < randomArr.length; i++) {
            if (randomArr[i] % 3 == 0) {
                sumМalues = sumМalues + randomArr[i];
            }
            System.out.println(sumМalues);
        }

        System.out.println("5. Вивести значення всіх парних індексів масиву");

        for (int i = 0; i < randomArr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(randomArr[i]);
            }

        }


        System.out.println("6. Просортувати масив в порядку зростання");
        for (int i = 0; i < randomArr.length; i++) {
            Arrays.sort(randomArr);
            System.out.println(randomArr[i]);
        }

        System.out.println("7. Вивести найменше значення в масиві");
        int min = randomArr[0];
        for (int i = 0; i < randomArr.length; i++) {
            if (randomArr[i] <= min)
                min = randomArr[i];
        }
        System.out.println(min);

        System.out.println("8. Вивести найбільше значення масиву");

        int max = randomArr[9];
        for (int i = 0; i < randomArr.length; i++) {
            if (randomArr[i] >= max)
                max = randomArr[i];
        }
        System.out.println(max);


        System.out.println("9. Вивести суму значень всіх парних індексів");

        int sumIndex = 0;
        for (int i = 0; i < randomArr.length; i++) {

            if (i % 2 == 0) {
                sumIndex = sumIndex + randomArr[i];
            }
        }
        System.out.print(sumIndex);

        System.out.println("10. Вивести перших 20 символів з таблиці ASCI");

        char ch = 32;
        for (int i = 0; i < 20; i++) {
            System.out.print(ch++);

        }


    }
}




