package org.example.practice.Queue;

import java.util.*;
import java.util.stream.Collectors;

public class NumberOfStudentsUnableToEatLunch {

    public static void solution(int[] students, int[] sandwiches) {
        Queue<Integer> studentsQue =
                Arrays.stream(students)
                        .boxed()
                        .collect(Collectors.toCollection(LinkedList::new));

        Queue<Integer> sandwichesQue =
                Arrays.stream(sandwiches)
                        .boxed()
                        .collect(Collectors.toCollection(LinkedList::new));

        int rotations = 0;

        while (!sandwichesQue.isEmpty() && !studentsQue.isEmpty()) {
            if (sandwichesQue.peek().equals(studentsQue.peek())) {
                sandwichesQue.remove();
                studentsQue.remove();
                rotations = 0;
            } else {
                Integer studentToGoInTheBack = studentsQue.remove();
                studentsQue.offer(studentToGoInTheBack);
                rotations++;

                if (rotations == sandwichesQue.size()) {
                    break;
                }
            }
        }

        int solution = studentsQue.size();
    }

    public static void solution2(int[] students, int[] sandwiches) {
        int[] count = new int[2];

        for (int s : students) count[s]++;

        for (int sandwich : sandwiches) {
            if (count[sandwich] == 0) {
                break;
            }
            count[sandwich]--;
        }

        int solution = count[0] + count[1];
    }
}
