/* task:
1)Add 5 to a without repeating the a variable (e.g. a = a + 5 is not accepted)
2)Then subtract 4 to a without repeating the a variable
3)Assign the value of a to int b and increment b by one without using a or int b = b + 1
4)Check and prints if both the following statements are true:
statement 1: check if b is an odd number
statement 2: check if the result of (b multiplied for b + 1) is a multiple of 3
*/

public class es4 {

    public static void main(String[] args){

        int a = 0;
        a+=5;
        a-=4;

        int b = a;
        b++;
        System.out.println(b);

        if(b%2 != 0) System.out.println("b is odd");
        else System.out.println("b isn't odd");

        if((b * (b+1) % 3 == 0)) System.out.println("b is a multiple of 3");
        else System.out.println("b isn't odd");







    }
}
