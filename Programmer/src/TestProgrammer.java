public class TestProgrammer {
    public static void main(String[] args){

        Programmer programmer1 = new Programmer("Maurizio" , 25 , true);
        Programmer programmer2 = new Programmer("Marco" , 18 , false);

        programmer1.drinkCofee();
        programmer1.printDetails();

        programmer2.printDetails();
        programmer2.hasglasses();
    }

}
