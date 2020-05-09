import java.util.LinkedList;

public class OmittedNumbers {
    public static void main(String[] args) {
        LinkedList<Integer> omitted_numbers = get_omitted_until(Integer.parseInt(args[0]));
        System.out.println(omitted_numbers);
    }

    public static LinkedList<Integer> get_omitted_until(int n) {
        // Integer werden verwendet weil int ein Referenztyp/Struct ist
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        // Die LinkedList wird mit Werten gefüllt
        for(int i = 0; i < n; i++) {
            numbers.add(i + 1);
        }
        // Zur Kontrolle wird die Liste noch einmal ausgegeben
        System.out.println(numbers);

        // Alle möglichen Stellen werden durchgegangen
        for(int i = 2; i < n; i++) {
            // Da Einträge aus dem Feld gelöscht werden, muss es immer um etwas verschoben werden
            int removed = 1;

            // Die jeweiligen Werte werden in jedem Durchlauf jeweils entfernt aus der Liste
            for(int j = i; j <= (numbers.size() + 1); j += i) {
                if(numbers.size() >= j - removed + 1) {
                    System.out.println("removed: " + numbers.get(j - removed));
                    numbers.remove(j - removed);
                }
                // Die Indexkorrektur wird um einen erhöht
                removed++;
            }
        }

        return numbers;
    }
}
