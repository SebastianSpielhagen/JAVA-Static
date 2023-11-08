package org.spielhagen;

/**
 * Die Klasse 'Calculator' stellt verschiedene statische Methoden zum Berechnen von mathematischen Operationen bereit.
 */
public class Calculator {
    /**
     * Diese Methode nimmt zwei Zahlen entgegen und gibt ihre Summe zurück.
     * @param a Die erste Zahl
     * @param b Die zweite Zahl
     * @return Die Summe der beiden Zahlen
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Die Hauptmethode des Programms, die den Calculator verwendet, um die Summe von zwei Zahlen zu berechnen und auszugeben.
     * @param args Die Argumente, die an das Programm übergeben werden (nicht verwendet in diesem Fall).
     */
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int sum = Calculator.add(num1, num2);
        System.out.println("Die Summe von " + num1 + " und " + num2 + " ist: " + sum);

        // Optional: Weitere statische Methoden in der Calculator-Klasse aufrufen
        /**
         * Hier werden die Methoden 'subtract', 'multiply' und 'divide' des Calculators verwendet, um die Differenz, das Produkt und den Quotienten von zwei Zahlen zu berechnen.
         */
        int difference = Calculator.subtract(num1, num2);
        int product = Calculator.multiply(num1, num2);
        int quotient = Calculator.divide(num1, num2);

        /**
         * Hier werden die Ergebnisse der Berechnungen der Differenz, des Produkts und des Quotienten von zwei Zahlen ausgegeben.
         */
        System.out.println("Die Differenz von " + num1 + " und " + num2 + " ist: " + difference);
        System.out.println("Das Produkt von " + num1 + " und " + num2 + " ist: " + product);
        System.out.println("Der Quotient von " + num1 + " und " + num2 + " ist: " + quotient);
    }

    // Optional: Weitere statische Methoden implementieren
    /**
     * Diese Methoden subtrahieren, multiplizieren und dividieren zwei Zahlen und geben das Ergebnis zurück.
     * @param a Die erste Zahl
     * @param b Die zweite Zahl
     * @return Das Ergebnis der jeweiligen mathematischen Operation
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
