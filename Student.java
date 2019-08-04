package Student;

import java.util.ArrayList;

public class Student {

    public static int count = 0;

    private String imie;
    private String nazwisko;
    private int indeks;
    private ArrayList<Integer> oceny;

    public Student(String imie, String nazwisko, int indeks, ArrayList<Integer> oceny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
        this.oceny = oceny;
        count++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", indeks=" + indeks +
                ", oceny=" + oceny +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public ArrayList<Integer> getOceny() {
        return oceny;
    }

    public void setOceny(ArrayList<Integer> oceny) {
        this.oceny = oceny;
    }
}