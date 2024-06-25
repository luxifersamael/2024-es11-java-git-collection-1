import java.util.List;
import java.util.Map;

public class App {

    /**
     * TODO:
     * 
     * 
     * aggiungere i seguenti metodi per testare la classe DataHelper:
     * - testRandomInteger : void
     * testare le 3 implementazioni del metodo getRandomInteger
     * 
     * - testRandomUniqueInteger : void
     * testare le 3 implementazioni del metodo getRandomUniqueInteger
     * 
     * - testFrequencyMap : void
     * testare il metodo getFrequencyMap;
     * sfruttare i metodi precedentemente svolti e utilizzarli come
     * dati in ingresso per il metodo getFrequencyMap
     * 
     */

    public static void main(String[] args) throws Exception {
        //crea una nuova istanza di DataHelper
        DataHelper dataHelper = new DataHelper();

        //creo le liste e testo i metodi randominteger
        List<Integer> randomIntegers = dataHelper.getRandomInteger(10);
        List<Integer> randomIntegersMax = dataHelper.getRandomInteger(10, 30);
        List<Integer> randomIntegersMinMax = dataHelper.getRandomInteger(10, 0, 50);

        //stampo le liste 
        System.out.println(randomIntegers);
        System.out.println(randomIntegersMax);
        System.out.println(randomIntegersMinMax);


        //creo le liste e testo i metodi randomunique
        List<Integer> randomUniqueIntegers = dataHelper.getRandomUniqueInteger(10);
        List<Integer> randomUniqueIntegersMax = dataHelper.getRandomUniqueInteger(10, 30);
        List<Integer> randomUniqueIntegersMinMax = dataHelper.getRandomUniqueInteger(10, 0, 50);

        //stampo le liste
        System.out.println(randomUniqueIntegers);
        System.out.println(randomUniqueIntegersMax);
        System.out.println(randomUniqueIntegersMinMax);

        //creo le mappe di frequenza e testo il metodo  
        Map<Integer, Integer> frequencyMap1 = dataHelper.getFrequencyMap(randomIntegers);
        Map<Integer, Integer> frequencyMap2 = dataHelper.getFrequencyMap(randomIntegersMax);
        Map<Integer, Integer> frequencyMap3 = dataHelper.getFrequencyMap(randomIntegersMinMax);

        Map<Integer, Integer> frequencyMap4 = dataHelper.getFrequencyMap(randomUniqueIntegers);
        Map<Integer, Integer> frequencyMap5 = dataHelper.getFrequencyMap(randomUniqueIntegersMax);
        Map<Integer, Integer> frequencyMap6 = dataHelper.getFrequencyMap(randomUniqueIntegersMinMax);
        
        //stampo le mappe
        System.out.println(frequencyMap1);
        System.out.println(frequencyMap2);
        System.out.println(frequencyMap3);
        System.out.println(frequencyMap4);
        System.out.println(frequencyMap5);
        System.out.println(frequencyMap6);


    }
}