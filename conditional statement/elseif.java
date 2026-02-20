import java.util.*;

public class elseif {
    public static void main(String args[]){
        int age = 46;

        if (age>=18){
            System.out.println("adult");
        }
        else if(age >=13 && age < 18){
            System.out.println("teenager");
        }
        else if(age >=60){
            System.out.println("oldman");
        }
        else{
            System.out.println("child");
        }
    }
}
