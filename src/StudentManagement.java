import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student("Carlos",20,new int[]{8, 9, 10});
        students.add(s1);

        Student s2 = new Student();
        s2.name = "Ana";
        s2.age = 22;
        s2.grades = new int[]{7, 6, 8};
        students.add(s2);

        Student s3 = new Student();
        s3.name = "Luis";
        s3.age = 21;
        s3.grades = new int[]{10, 10, 9};
        students.add(s3);

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("Nombre: " + student.name);
            System.out.println("Edad: " + student.age);

            int totalGrades = 0;
            for (int j = 0; j < student.grades.length; j++) {
                totalGrades += student.grades[j];
            }

            double average = totalGrades / (double) student.grades.length;
            System.out.println("Nota media: " + average);

            if (average >= 9) {
                System.out.println("Estado: Excelente");
            } else if (average >= 7) {
                System.out.println("Estado: Bueno");
            } else {
                System.out.println("Estado: Insuficiente");
            }

            System.out.println("========================");
        }

        // Cálculo de la nota media general
        int totalSum = 0;
        int totalGradesCount = 0;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            for (int j = 0; j < student.grades.length; j++) {
                totalSum += student.grades[j];
                totalGradesCount++;
            }
        }

        double generalAverage = totalSum / (double) totalGradesCount;
        System.out.println("Nota media general del grupo: " + generalAverage);
    }
}

class Student {
    String name;
    int age;
    int[] grades;
    public Student(String name, int age,int[] grades){
        this.name=name;
        this.age=age;
        this.grades=grades;
    }
}
