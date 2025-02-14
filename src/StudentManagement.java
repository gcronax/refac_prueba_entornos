import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentManagement {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Carlos",20,new int[]{8, 9, 10}),
                new Student("Ana", 22,new int[]{7, 6, 8}),
                new Student("Luis", 21, new int[]{10, 10, 9}));

        for (Student student:students) {

            System.out.println(student);

            int totalGrades = 0;
            for (int i:student.grades){
                totalGrades += i;
            }

            double average = totalGrades / (double) student.grades.length;
            System.out.println("Nota media: " + average );

            sout_estado(average);

            System.out.println("========================");
        }

        // Cálculo de la nota media general

        System.out.println("Nota media general del grupo: " + Math.round(getGeneralAverage(students)));
    }

    private static double getGeneralAverage(List<Student> students) {
        int totalSum = 0;
        int totalGradesCount = 0;
        for (Student student : students) {
            for (int j = 0; j < student.grades.length; j++) {
                totalSum += student.grades[j];
                totalGradesCount++;
            }
        }

        return totalSum / (double) totalGradesCount;
    }

    private static void sout_estado(double average) {
        if (average >= 9) {
            System.out.println("Estado: Excelente");
        } else if (average >= 7) {
            System.out.println("Estado: Bueno");
        } else {
            System.out.println("Estado: Insuficiente");
        }
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

    @Override
    public String toString() {
        return "Nombre: " + name + '\n' + "Edad: " + age ;
    }
}
