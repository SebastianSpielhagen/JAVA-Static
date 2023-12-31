package org.spielhagen;

// Die statische Variable "totalCount" ist auf Klassenebene und wird gemeinsam von allen Instanzen der Klasse geteilt.
// Die instanzspezifische Variable "instanceCount" ist an jedes Objekt gebunden und hat eine eigene Kopie pro Instanz.
public class Counter {
    private static int totalCount = 0;
    private int instanceCount = 0;

    // Die statische Methode "incrementTotalCount()" erhöht den Wert der statischen Variable "totalCount" um 1.
    // Da die Methode statisch ist, wird sie auf Klassenebene aufgerufen und wirkt sich auf "totalCount" aus, der von allen Instanzen geteilt wird.
    public static void incrementTotalCount() {
        totalCount++;
    }

    // Die instanzspezifische Methode "incrementInstanceCount()" erhöht den Wert der instanzspezifischen Variable "instanceCount" um 1.
    // Jede Instanz der Klasse hat eine eigene Kopie von "instanceCount", und diese Methode erhöht den Wert nur für die jeweilige Instanz.
    public void incrementInstanceCount() {
        instanceCount++;
    }

    // Diese Methode überschreibt die Standardmethode "toString()" der Basisklasse "Object" und gibt eine benutzerdefinierte Zeichenfolge zurück.
    // Die Zeichenfolge enthält Informationen über "totalCount" und "instanceCount" für die aktuelle Instanz.
    @Override
    public String toString() {
        return "Total Count: " + totalCount + ", Instance Count: " + instanceCount;
    }
    // Erstellen von zwei Instanzen der Counter-Klassen und Aufrufen der Methoden "incrementTotalCount()" und "incrementInstanceCount()".
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();

        // Inkrementiere den Gesamtzähler (totalCount) ohne Verwendung von Objekten (statische Methode)
        incrementTotalCount();

        // Inkrementiere den Instanzzähler (instanceCount) für obj1 (instanzspezifische Methode)
        obj1.incrementInstanceCount();

        // Ausgabe der aktuellen Werte von totalCount und instanceCount für obj2
        System.out.println(obj2);

        // Inkrementiere erneut den Gesamtzähler (totalCount) ohne Verwendung von Objekten (statische Methode)
        incrementTotalCount();

        // Inkrementiere den Instanzzähler (instanceCount) für obj2 (instanzspezifische Methode)
        obj2.incrementInstanceCount();

        // Ausgabe der aktuellen Werte von totalCount und instanceCount für obj1 und obj2
        System.out.println(obj1); // Gibt die aktuellen Werte von totalCount und instanceCount für obj1 aus
        System.out.println(obj2); // Gibt die aktuellen Werte von totalCount und instanceCount für obj2 aus
    }
}
