package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        // Перевірка, чи numberToSkip більше за lastInRow
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
            return;
        }

        // Перевірка, чи lastInRow від'ємне
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }

        // Змінні для сум
        int skippedSum = 0;
        int countedSum = 0;

        // Цикл для обчислення сум
        for (int i = 1; i <= lastInRow; i++) {
            if (i == numberToSkip) {
                skippedSum += i; // Додаємо до суми пропущених
            } else {
                countedSum += i; // Додаємо до суми врахованих
            }
        }

        // Виведення результатів
        System.out.println("skipped sum is " + skippedSum);
        System.out.println("counted sum is " + countedSum);
    }
}