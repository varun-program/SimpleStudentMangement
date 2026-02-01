import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner for user input
        student stu = new student();// Create a student object for student class
        System.out.print("Enter student name: ");
        stu.name = input.nextLine();
        System.out.print("Enter student roll number: ");
        stu.rollno = input.nextInt();
        System.out.print("Enter student age: ");
        stu.age=input.nextInt();
        System.out.println("Enter marks for  subjects:");
        for(int i=0;i<stu.subjectmarks.length;i++){
            stu.subjectmarks[i]=input.nextInt();
        }
         stu.sum(); // calling sum method
         stu.average(); // calling average method

        IO.print("\n--- Student Details ---\n");
        stu.displayDetails();
        }
        }