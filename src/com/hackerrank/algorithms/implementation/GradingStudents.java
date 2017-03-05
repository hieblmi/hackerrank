package com.hackerrank.algorithms.implementation;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class GradingStudents {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get("/Users/michi/projects/hackerrank/src/com/hackerrank/algorithms/implementation/gradingStudents.txt"));
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            int grade = in.nextInt();
            if (grade < 38) {
                System.out.println(grade);
            } else {
                int m = (100 - grade) % 5;
                int finalGrade = 0;
                if (m < 3) {
                    finalGrade = grade + m;
                } else {
                    finalGrade = grade;
                }
                System.out.println(finalGrade);
            }
        }
    }
}
