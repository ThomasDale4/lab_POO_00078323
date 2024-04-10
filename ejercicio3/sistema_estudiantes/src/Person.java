public class Person {
    private String name;
    private String telephone;
    private String email;

    public Person(){
        this.name = "";
        this.telephone = "";
        this.email = "";
    }

    public Person(String name, String telephone, String email){
        this.name = name;
        this.telephone = telephone;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void enterUniversity() {
        System.out.println("Entering University");
    }
    public void purchaseParkingPass() {
        System.out.println("Purchasing a parking pass");
    }
}
