package N3ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//- Exercici 1
//Crea una classe Alumne amb els atributs: Nom, edat, curs i nota.
//
//Omple una llista amb 10 alumnes
//
//Mostra per pantalla el nom i l’edat de cada alumne/a.

//Filtra la llista per tots els alumnes que el seu nom comença per ‘a’.
// Assigna a aquests alumnes a una altra  llista i  mostra per pantalla la nova llista (tot  amb lambdes).

// Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior.

//Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que no són de PHP.

//Mostra tots els alumnes que fan JAVA i són majors d’edat.
public class Main {

    public static void main(String[] args) {


        Student student1 = new Student("John",23,"Java",7.5);
        Student student2 = new Student("Mariah",33,"JavaScript",8.5);
        Student student3 = new Student("Tony",29,"Java",6.5);
        Student student4 = new Student("Jessica",45,"Python",7);
        Student student5 = new Student("Albert",19,"PHP",9);
        Student student6 = new Student("Daniel",23,"Java",7.5);
        Student student7 = new Student("Timothy",33,"JavaScript",8.5);
        Student student8 = new Student("Angela",22,"Java",6);
        Student student9 = new Student("Monica",25,"Python",4);
        Student student10 = new Student("Joe",17,"Javascript",9.5);
        List<Student> listStudents = Arrays.asList(student1,student2,student3,student4,student5,student6,student7,student8,student9,student10);

        //1.show in screen name and age of every student
        System.out.println("Sudents by Name and Age :");
        listStudents.forEach(student-> System.out.println("Name : " + student.getName() + ", Age : "+  student.getAge()));

        //2.Students who name starts with 'a' put in another list
        System.out.println("Sudents first letter is A :");
        List<Student> listWithA = listStudents.stream()
                .filter(name ->name.getName().startsWith("A"))
                .toList();
        System.out.println(listWithA);

        //3.Students with a grade more than 5
        System.out.println("Sudents score more than 5");
        List<Student> listMoreThan5 = listStudents.stream()
                .filter(grade ->grade.getGrade()>=5.0)
                .toList();
        System.out.println(listMoreThan5);

        //4.Students with a grade more than 5 and not PHP
        System.out.println("Sudents score more than 5 and Not PHP");
        List<Student> listMoreThan5NotPHP = listStudents.stream()
                .filter(s -> (s.getGrade() >= 5.0) && (s.getCourse() != "PHP"))
                .toList();
        System.out.println(listMoreThan5NotPHP);

        //5.Students of Java and older than 18
        System.out.println("Java Sudents more than 18");
        List<Student> listJavaMore18 = listStudents.stream()
                .filter(s -> (s.getAge() >= 18) && (s.getCourse() == "Java"))
                .toList();
        System.out.println(listJavaMore18);

    }
}
