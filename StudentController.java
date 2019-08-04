package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

    private ArrayList<Student> studentList = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public StudentController() {
        boolean flag = true;
        while (flag) {
            System.out.println("A-dodaj, S-pokaż, D-usuń, U-zmodyfikuj, C-liczba studentów, R-dodaj ocenę, Q-wyjście");
            String dec = sc.nextLine().toUpperCase();
            switch (dec) {
                case "A":
                    addStudent();
                    break;
                case "D":
                    subStudent();
                    break;
                case "S":
                    showStudent();
                    break;
                case "C":
                    countStudent();
                    break;
                case "U":
                    modStudent();
                    break;
                case "R":
                    addCredit();
                    break;
                case "Q":
                    flag = false;
                    sc.close();
                    break;
                default:
                    System.out.println("Nieprawidłowe działanie.");
            }
        }
    }

    public void addStudent() {
        System.out.println("Podaj imię:");
        String imie = sc.nextLine();
        System.out.println("Podaj nazwisko:");
        String nazwisko = sc.nextLine();
        System.out.println("Podaj nr indeksu:");
        int indeks = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> oceny = new ArrayList<>();
        Student obj = new Student(imie, nazwisko, indeks, oceny);
        studentList.add(obj);
    }

    public void showStudent() {
        for (Student val : studentList) {
            System.out.println(val.getImie() + " " + val.getNazwisko() + " " + val.getIndeks());
            System.out.println("Oceny: "+val.getOceny());
        }
    }

    public void subStudent() {
        System.out.println("Podaj numer indeksu:");
        int indeks = sc.nextInt();
        sc.nextLine();

        for (Student val : studentList) {
            if (val.getIndeks() == indeks) {
                studentList.remove(val);
                break;
            }
            else {
                System.out.println("Nieprawidłowy nr indeksu.");
                break;
            }
        }
    }

    public void modStudent() {
        System.out.println("Podaj nr indeksu studenta do modyfikacji:");
        int indeks = sc.nextInt();
        sc.nextLine();

        for (Student val : studentList) {
            if (val.getIndeks() == indeks) {
                System.out.println("Podaj imię:");
                String newName = sc.nextLine();
                if (!newName.equals("")) {
                    val.setImie(newName);
                }

                System.out.println("Podaj nazwisko:");
                String newSurname = sc.nextLine();
                if (!newSurname.equals("")) {
                    val.setNazwisko(newSurname);
                }

            } else {
                System.out.println("Nieprawidłowy nr indeksu.");
                break;
            }
        }
    }

    public void addCredit() {
        System.out.println("Podaj nr indeksu studenta:");
        int indeks = sc.nextInt();
        sc.nextLine();

        for (Student val : studentList) {
            if (val.getIndeks() == indeks) {
                System.out.println("Podaj ocenę:");
                int newMark = sc.nextInt();
                sc.nextLine();
                if (newMark>1 && newMark<6) {
                    val.getOceny().add(newMark);
                }
                else {
                    System.out.println("Nieprawidłowa ocena. Wprowadź liczbę (2-5).");
                    continue;
                }
            }
        }
    }

    public void countStudent() {
        System.out.println(Student.count);
    }

}