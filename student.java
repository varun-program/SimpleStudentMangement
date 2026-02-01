public class student{
    String name;
    int rollno;
    int age;

    int[] subjectmarks= new int[5];
    int totalmarks;
    double avg;

    void sum(){
        totalmarks =0;
        for(int i=0;i<subjectmarks.length;i++){
            totalmarks+=subjectmarks[i]; //0+arr[0]element 10 to totalmarks=10 

    }}
    

    void average(){
        avg=totalmarks/subjectmarks.length;}


    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Age:"+age);
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Average Marks: " + avg);
    }
}