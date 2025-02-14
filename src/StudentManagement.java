import java.util.List;

public class StudentManagement {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Carlos",20,new int[]{8, 9, 10}),
                new Student("Ana", 22,new int[]{7, 6, 8}),
                new Student("Luis", 21, new int[]{10, 10, 9}));

        for (Student student:students) {

            System.out.println(student);

            int grados_totales = 0;
            for (int i:student.grades){
                grados_totales += i;
            }

            double average = grados_totales / (double) student.grades.length;
            System.out.println("Nota media: " + String.format("%.2f",average) );

            imprimirEstado(average);

            System.out.println("========================");
        }

        // Cálculo de la nota media general

        System.out.println("Nota media general del grupo: " + String.format("%.2f", obtenerMedia(students)) );
    }

    private static double obtenerMedia(List<Student> students) {
        int suma_total = 0;
        int contador_grados_totales = 0;
        for (Student student : students) {
            for (int j = 0; j < student.grades.length; j++) {
                suma_total += student.grades[j];
                contador_grados_totales++;
            }
        }

        return suma_total / (double) contador_grados_totales;
    }

    private static void imprimirEstado(double average) {
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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + '\n' + "Edad: " + age ;
    }
}
