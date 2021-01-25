package java.Classes;

import java.util.*;

public class NegativeMarks {
    ArrayList<Abiturient> listOfAbiturients;
    int sumOfGrades = 20;
    int result;
    int satisfactoryMark = 4;
    int semiPassScore = 15;

    public NegativeMarks() {

    }

    public void sumOfGrades(ArrayList<Abiturient> list) {
        for (Abiturient i : list)
            if (i.getGrade1() + i.getGrade2() + i.getGrade3() + i.getGrade4() > sumOfGrades) {
                result = i.getGrade1() + i.getGrade2() + i.getGrade3() + i.getGrade4();
                System.out.println(i.getName() + " " + i.getSurname() + " have a satisfactory sum of grades: " + result);
            } else {
                result = i.getGrade1() + i.getGrade2() + i.getGrade3() + i.getGrade4();
                System.out.println(i.getName() + " " + i.getSurname() + " have an unsatisfactory sum of grades: " + result);
            }
    }

    public void negativeMarks(ArrayList<Abiturient> list) {
        for (Abiturient i : list) {
            if (i.getGrade1() < satisfactoryMark) {
                System.out.println("Negative marks : " + i.getGrade1() + " have an abiturient " + i.getName() + " " + i.getSurname());
            }
            if (i.getGrade2() < satisfactoryMark) {
                System.out.println("Negative marks : " + i.getGrade2() + " have an abiturient " + i.getName() + " " + i.getSurname());
            }
            if (i.getGrade3() < satisfactoryMark) {
                System.out.println("Negative marks : " + i.getGrade3() + " have an abiturient " + i.getName() + " " + i.getSurname());
            }
            if (i.getGrade4() < satisfactoryMark) {
                System.out.println("Negative marks : " + i.getGrade4() + " have an abiturient " + i.getName() + " " + i.getSurname());
            }
        }

    }

    static Comparator<Abiturient> compareBySumOfGrades = new Comparator<Abiturient>() {
        @Override
        public int compare(Abiturient o1, Abiturient o2) {
            return o2.getResult() - o1.getResult();
        }
    };

    public void passingScoreAndSemiPassScore(ArrayList<Abiturient> list) {
        for (Abiturient i : list) {
            if (i.getResult() > sumOfGrades) {
                System.out.println("Passing score have: " + i.getName() + " " + i.getSurname());
            }
            if (semiPassScore < i.getResult() & i.getResult() <= sumOfGrades) {
                System.out.println("Semi-pass score have: " + i.getName() + " " + i.getSurname());
            }
            ;
        }
    }
}