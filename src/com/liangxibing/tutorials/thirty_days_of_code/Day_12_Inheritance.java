package com.liangxibing.tutorials.thirty_days_of_code;

import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/30-inheritance
 */
class Student extends Day_12_Person{
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores){
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    char calculate() {
        int sum = 0;
        for (int testScore : testScores) {
            sum += testScore;
        }
        int average = sum / testScores.length;
        if (average >= 90 && average <= 100)
            return 'O';
        else if (average >= 80 && average < 90)
            return 'E';
        else if (average >= 70 && average < 80)
            return 'A';
        else if (average >= 55 && average < 70)
            return 'P';
        else if (average >= 40 && average < 55)
            return 'D';
        else if (average < 40)
            return 'T';
        else
            return '\0';
    }
}

class Day_12_Person {
    private String firstName;
    private String lastName;
    private int idNumber;

    // Constructor
    Day_12_Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }
}

public class Day_12_Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
