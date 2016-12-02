package com.liangxibing.tutorials.cracking_the_coding_interview;

import java.util.*;

/**
 * Created by liangxibing on 2/12/16.
 * Problem: https://www.hackerrank.com/challenges/ctci-ransom-note
 */

public class Hash_Tables_Ransom_Note {
    private Map<String, Integer> magazineMap;
    private Map<String, Integer> noteMap;

    private Hash_Tables_Ransom_Note(String magazine, String note) {
        magazineMap = new HashMap<>();
        noteMap = new HashMap<>();
        String[] magazineWords = magazine.split(" ");
        String[] noteWords = note.split(" ");
        Integer temp;
        for (String s : magazineWords) {
            temp = magazineMap.get(s);
            if (null == temp)
                magazineMap.put(s, 1);
            else
                magazineMap.put(s, temp + 1);
        }
        for (String s : noteWords) {
            temp = noteMap.get(s);
            if (null == temp)
                noteMap.put(s, 1);
            else
                noteMap.put(s, temp + 1);
        }
    }

    private boolean solve() {
        Integer noteWordCount;
        Integer magazineWordCount;
        for (String noteString : noteMap.keySet()) {
            noteWordCount = noteMap.get(noteString);
            magazineWordCount = magazineMap.get(noteString);
            if (null == magazineWordCount || magazineWordCount < noteWordCount)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Hash_Tables_Ransom_Note s = new Hash_Tables_Ransom_Note(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}

