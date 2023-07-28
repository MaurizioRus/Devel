public class Main {

    public static void main(String[] args) {

        String string1 = "Hello";
        String string2 = "How are you?";

        String firstdigits = string1.substring(0 , 2);

        String lastdigits = string2.substring(string2.length() -2, string2.length() );

        char[] charArray = new char[firstdigits.length() + lastdigits.length()];

        int i=0;

        for( char temp : firstdigits.toCharArray()){

            charArray[i] = temp;
            i++;
        }

        for( char temp : lastdigits.toCharArray()){

            charArray[i] = temp;
            i++;
        }

        System.out.println(charArray);
    }
}