import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DataHelper {

    public static List<Integer> getRandomInteger(int size) {

        // creo una lista di interi
        List<Integer> randomIntegers = new ArrayList<>();

        // uso la classe random per generare numeri casuali tra 0 e 10
        Random random = new Random();

        for (int i = 0; i < size; i++) {

            // aggiungo i numeri casuali alla lista
            randomIntegers.add(random.nextInt(11));

        }

        return randomIntegers;
    }

    // restituisce una lista di numeri interi casuali compresi tra 0 e max
    public static List<Integer> getRandomInteger(int size, int max) {

        // creo una lista di interi
        List<Integer> randomIntegers = new ArrayList<>();

        // uso la classe random per generare numeri casuali tra 0 e max
        Random random = new Random();

        for (int i = 0; i < size; i++) {

            // aggiungo i numeri casuali alla lista
            randomIntegers.add(random.nextInt(max + 1));

        }

        return randomIntegers;
    }

    // restituisce una lista di numeri interi casuali compresi tra min e max
    public static List<Integer> getRandomInteger(int size, int min, int max) {

        // creo una lista di interi
        List<Integer> randomIntegers = new ArrayList<>();

        // uso la classe random per generare numeri casuali tra min e max
        Random random = new Random();

        for (int i = 0; i < size; i++) {

            // aggiungo i numeri casuali alla lista
            randomIntegers.add(random.nextInt(max - min + 1) + min);

        }

        return randomIntegers;
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e 10
    public static List<Integer> getRandomUniqueInteger(int size) {

        // creo una lista di interi
        List<Integer> randomIntegers = new ArrayList<>();

        // uso la classe random per generare numeri casuali tra 0 e 10
        Random random = new Random();

        for (int i = 0; i < size; i++) {

            // creo un numero casuale
            int randomInt = random.nextInt(11);

            // controllo se il numero è già presente nella lista
            if (!randomIntegers.contains(randomInt)) {

                // aggiungo il numero alla lista
                randomIntegers.add(randomInt);
            } else {
                // se il numero è già presente decremento l'indice per ripetere il ciclo
                i--;
            }

        }

        return randomIntegers;
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e max
    public static List<Integer> getRandomUniqueInteger(int size, int max) {

        // creo una lista di interi
        List<Integer> randomIntegers = new ArrayList<>();

        // uso la classe random per generare numeri casuali tra 0 e max
        Random random = new Random();

        for (int i = 0; i < size; i++) {

            // creo un numero casuale
            int randomInt = random.nextInt(max + 1);

            // controllo se il numero è già presente nella lista
            if (!randomIntegers.contains(randomInt)) {

                // aggiungo il numero alla lista
                randomIntegers.add(randomInt);
            } else {
                // se il numero è già presente decremento l'indice per ripetere il ciclo
                i--;
            }

        }

        return randomIntegers;
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra min e
    // max
    public static List<Integer> getRandomUniqueInteger(int size, int min, int max) {

        // creo una lista di interi
        List<Integer> randomIntegers = new ArrayList<>();

        // uso la classe random per generare numeri casuali tra min e max
        Random random = new Random();

        for (int i = 0; i < size; i++) {

            // creo un numero casuale
            int randomInt = random.nextInt(max - min + 1) + min;

            // controllo se il numero è già presente nella lista
            if (!randomIntegers.contains(randomInt)) {

                // aggiungo il numero alla lista
                randomIntegers.add(randomInt);
            } else {
                // se il numero è già presente decremento l'indice per ripetere il ciclo
                i--;
            }

        }

        return randomIntegers;
    }

    // restituisce una mappa di frequenza di numeri interi

    public static Map<Integer, Integer> getFrequencyMap(List<Integer> integers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer integer : integers) {
            frequencyMap.put(integer, frequencyMap.getOrDefault(integer, 0) + 1);
        }

        return frequencyMap;
    }

}