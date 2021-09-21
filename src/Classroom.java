public class Classroom {
    public static void main(String[] args) {

        //Instances of Class Wilder
        Wilder bella = new Wilder("Isabella", true);
        Wilder chris = new Wilder("Christiane", false);
        Wilder moni = new Wilder("Monika", true);

        //Display whoAmI method
        System.out.println(bella.whoAmI());
        System.out.println(chris.whoAmI());
        System.out.println(moni.whoAmI());

    }
}
