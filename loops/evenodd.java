import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int evensum = 0;
        int oddsum = 0;
        do{
            System.out.println("enter the numbers");
            num = sc.nextInt();
            if(num % 2 == 0){
                evensum+= num;
            }else{
                oddsum+=num;
            }
            System.out.println("to enter next num press 1 and to end press 0 ");
            choice = sc.nextInt();
        }while(choice != 0);
        System.out.println("sum of even numbers "+ evensum);
        System.out.println("sum of odd numbers "+ oddsum);

    }
}
