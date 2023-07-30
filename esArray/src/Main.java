/*Define a testing class with a main() method where you:
-Define an array of strings called carBrands that is populated with 5 famous car brand names

Print in console the number of items of the carBrands array
Print in console the 3rd item of carBrands array
-Declare an empty array of integers called primeNumbers with a predefined size of 6 items
Insert one by one the values of the first 6 prime numbers, populating primeNumbers array
-Print in console all the content of the already populated primeNumbers array
 */

public class Main {
    public static void main(String[] args) {

        String[] carBrands = {"Mercedes" , "Peugeot" , "Alpine" , "Fiat" , "Ferrari"};

        System.out.println(carBrands.length);
        System.out.println(carBrands[2]);

        int[] primeNumber = new int[6];

        primeNumber[0] = 2;
        primeNumber[1] = 3;
        primeNumber[2] = 5;
        primeNumber[3] = 7;
        primeNumber[4] = 11;
        primeNumber[5] = 13;

        for(int i = 0; i < primeNumber.length ; i++)
        {
            System.out.println(primeNumber[i]);
        }
    }
}