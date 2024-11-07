package game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswersCount = 0;


        for (int i = 0; i < Questions.questions.length; i++) {
            Question question = Questions.questions[i];
            System.out.println("Вопрос " + (i + 1) + ": " + question.getQuestion());
            System.out.println("1. " + question.getFirstAnswer());
            System.out.println("2. " + question.getSecondAnswer());
            System.out.println("3. " + question.getThirdAnswer());
            System.out.println("4. " + question.getFourthAnswer());

            System.out.print("Ваш ответ (введите номер варианта): ");
            int userAnswer = scanner.nextInt() - 1; // Преобразуем в 0-based индекс

            if (userAnswer == question.getCorrectNumberIndex()) {
                System.out.println("Правильно!");
                correctAnswersCount++;
            } else {
                System.out.println("Неправильно! Правильный ответ: " + (question.getCorrectNumberIndex() + 1));
            }
            System.out.println();
        }


        System.out.println("Вы набрали " + correctAnswersCount + " из " + Questions.questions.length + " правильных ответов!");
        scanner.close();
    }
}