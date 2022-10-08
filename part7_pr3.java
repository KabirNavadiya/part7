import java.util.*;

class AccountHolder {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int WorkExperience;
    double inc;
    Boolean czs;

    void info() {
        System.out.println("Enter Your Name : ");
        name = sc.next();
        System.out.println("Enter Your Age : ");
        age = sc.nextInt();
        System.out.println("Enter Your Net Monthly Income : ");
        inc = sc.nextDouble();
        System.out.println("Enter Your Total Work Experince (In Year) : ");
        WorkExperience = sc.nextInt();
        System.out.println("What is Your CitizenShip? (For Indian true otherwisw false) :- ");
        czs = sc.nextBoolean();

    }

    void check() {
        if (age >= 21 && age <= 60) {
            System.out.println("Your Age : " + age);
        } else if (inc >= 15000) {
            System.out.println("Your Monthly Income : " + inc);
        } else if (WorkExperience >= 1) {
            System.out.println("Your Work Experience : " + WorkExperience);
        } else if (czs == true) {
            System.out.println("You Are A Indian");
        }
    }
}

public class part7_pr3 extends AccountHolder {

    public static void main(String[] args) {
        int count = 0;
        ArrayList a = new ArrayList<>();
        ArrayList<AccountHolder> personHolder = new ArrayList<AccountHolder>();

        for (int i = 1; i <= 5; i++) {
            personHolder.add(new AccountHolder());
        }


        for (AccountHolder p : personHolder) {
            p.info();
            p.check();
            if (p.age >= 21 && p.age <= 60 && p.inc >= 15000 && p.WorkExperience >= 1 && p.czs == true) {
                System.out.println("You are Elligeble :)");
                System.out.println("Your Name : " + p.name);
                count++;
                a.add(p.name);
            } else {
                System.out.println("You Are Not Elligeble  :(");
            }
        }
        System.out.println("The Number of Elligeble Candidates are : " + count);
        System.out.println("The Number of Not Elligeble Candidates are : " + (5 - count));
        System.out.println("All Eligible Candidates are : " + a);
        System.out.println("PREPARED BY 21CE080-KABIR NAVADIYA");
    }
}
