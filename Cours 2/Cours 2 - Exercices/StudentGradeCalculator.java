/*
 Développer un mini-système de gestion de notes en Java pour une classe. Le programme doit :
— Demander à l’utilisateur le nombre d’étudiants et de matières.
— Pour chaque étudiant, saisir les notes dans chaque matière.
— Afficher les notes de chaque étudiant.
— Calculer et afficher la moyenne de chaque étudiant.
— Donner une appréciation selon la moyenne obtenue :
— Moyenne ≥ 16 : Excellent
— 14 ≤ Moyenne < 16 : Très bien
— 12 ≤ Moyenne < 14 : Bien
— 10 ≤ Moyenne < 12 : Passable
— Moyenne < 10 : Insuffisant
— Afficher la moyenne générale de la classe.
 */

import java.util.Scanner;
import java.util.Arrays;

public class StudentGradeCalculator {

    public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)) {
                int numStudents = amountOfStudent(input);
                int numCourses = amountOfCourses(input);
                Student[] tabStudents = arrayOfStudents(numStudents, numCourses, input);
                for (Student student : tabStudents) {
                    System.out.println(student);
                }
            }

    }

    public static class Student {

        private String _name;
        private double[] _grade;
        private final double _avg;
        private final String _gpa;

        public Student() {
            this._name = "Inconnu";
            this._grade = null;
            this._avg = -1;
            this._gpa = null;
        }

        public Student(String name, double[] grade) {
            this._name = name;
            this._grade = grade;
            this._avg = checkAvg(this._grade);
            this._gpa = checkGpa(this._avg);
        }

        private double checkAvg(double[] grades) {
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            return sum / grades.length;
        }

        private String checkGpa(double avg) {
            if (avg >= 16) {
                return "Excellent";
            } else if (avg >= 14) {
                return "Très bien";
            } else if (avg >= 12) {
                return "Bien";
            } else if (avg >= 10) {
                return "Passable";
            } else {
                return "Insuffisant";
            }
        }

        public void set_name(String _name) {
            this._name = _name;
        }

        public String get_name() {
            return _name;
        }

        public void set_grade(double[] _grade) {
            this._grade = _grade;
        }

        public double[] get_grade() {
            return _grade;
        }

        public double get_avg() {
            return _avg;
        }

        public String get_gpa() {
            return _gpa;
        }

        @Override
        public String toString() {
            return "Name : " + this._name +
                   "\nGrades : " + Arrays.toString(this._grade) +
                   "\n Avg : " + String.format("%.2f", this._avg) +
                   "\n GPA : " + this._gpa;
        }
    }

    static int amountOfStudent(Scanner input) {
        System.out.print("Amount of students : ");
        return input.nextInt();
    }

    static int amountOfCourses(Scanner input) {
        System.out.print("Amount of grades : ");
        return input.nextInt();
    }

    static Student[] arrayOfStudents(int amountOfStudent, int amountOfCourses, Scanner input) {
        Student[] array = new Student[amountOfStudent];
        for (int i = 0; i < amountOfStudent; i++) {
            array[i] = new Student(inputName(input), inputGrades(amountOfCourses, input));
        }
        return array;
    }

    static String inputName(Scanner input) {
        System.out.print("Name : ");
        input.nextLine(); // consume leftover newline
        return input.nextLine();
    }

    static double[] inputGrades(int amountOfCourses, Scanner input) {
        double[] grades = new double[amountOfCourses];
        for (int i = 0; i < amountOfCourses; i++) {
            do {
                System.out.print("Note " + (i + 1) + "(0<note<20) : ");
                grades[i] = input.nextDouble();
            } while (grades[i]<0 || grades[i]>20);
        }
        return grades;
    }
}
