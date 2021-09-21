public class Wilder {
    //Attributes/States
    private String firstname;
    private boolean present;

    //Constructor
    public Wilder(String firstname, boolean present) {
        this.firstname = firstname;
        this.present = present;
    }

    //Getter and Setter
    //Get firstname
    public String getFirstname() {
        return firstname;
    }

    //Set firstname
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    //Get present
    public boolean isPresent() {
        return present;
    }

    //Set present
    public void setPresent(boolean present) {
        this.present = present;
    }

    public String whoAmI(){
        if (this.present){
            return "My name is " + this.getFirstname() + " and I am present.";
        }else{
            return "My name is " + this.getFirstname() + " and I'm not present.";
        }
    }

}
