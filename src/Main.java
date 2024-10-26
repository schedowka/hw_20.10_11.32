import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите вес авто:");
        int weightCar = scan.nextInt();

        int[] pieces =  new int [30];

        System.out.println("Введите вес груза:");
        for (int i = 0; i < 30; i++) {
             pieces [i] = scan.nextInt();
        }


        int totalWeight = 0;

        for (int i = 0; i < 30 ; i++) {

            totalWeight += pieces[i];

        }
        if (totalWeight <= weightCar){
            System.out.println("не превышает ");}
        else {
            System.out.println("превышает ");
        }
    }
}