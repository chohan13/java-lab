import java.util.Scanner;

public class Student {
    String USN;
    String name;
    int size;
    int credits[];
    int marks[];
    double result;

    Student (){}
    Scanner s = new Scanner(System.in);
    
    void input (){

        System.out.println("Enter USN and name");
        USN = s.next();
        name = s.next();

        System.out.println("Enter the number of subjects:");
        size=s.nextInt();
        credits = new int[size];
        marks = new int[size];

        System.out.println("Enter credits of "+size+"subjects:");

        for (int i=0; i<size; i++){
            credits[i] = s.nextInt();
        }
        System.out.println("Enter marks for the "+size+"subjects:");
        for (int i=0; i<size; i++){
            marks[i] = s.nextInt();
        }
        
    }
    void display (){

        System.out.printf("USN: "+USN+"\tName: "+name);
        System.out.printf("\nCredits: ");

        for (int i=0; i<3; i++){
            System.out.printf("%d\t",credits[i]);
        }

        System.out.printf("\nMarks: ");

        for (int i=0; i<3; i++){
            System.out.printf("%d\t",marks[i]);
        }
    }
    double sgpa (){

        int grade[] = new int[size];

        for (int i=0; i<size; i++){
            
            if (marks[i]>=90){
                grade[i]=10;
            }
            else if (marks[i]>=80){
                grade[i]=9;
            }
            else if (marks[i]>=70){
                grade[i]=8;
            }
            else if (marks[i]>=60){
                grade[i]=7;
            }
            else if (marks[i]>=50){
                grade[i]=6;
            }
            else if (marks[i]>=40){
                grade[i]=5;
            }
            else{
                System.out.println(marks[i]+" is invalid!");
            }
        }
        result=0;
        int credit_sum = 0;

        for (int i=0; i<size; i++){

            result += grade[i]*credits[i];
            credit_sum += credits[i];
        }
        result = (result/credit_sum);

        return result;
    }
}

class stud {
    public static void main(String[] args) {

        int choice;
        int x=0;
        Scanner ss = new Scanner (System.in);
        Student s1 = new Student();

        while (x==0){

            System.out.printf("\n1:Input\t2:Display\t3:Calculate\t4:Exit\n");
            choice = ss.nextInt();

            switch (choice){

                case 1:s1.input();
                break;

                case 2:s1.display();
                break;

                case 3:System.out.println("SGPA is= "+s1.sgpa());
                break;

                case 4: x=1;
                break;
            }
        }

        ss.close();
    }
}