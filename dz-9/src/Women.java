public class Women extends Person {

    String previousLastname;

    public Women(String firstName, String lastName, int age, Boolean partner) {
        super(firstName, lastName, age, partner);
    }

    public String getPreviousLastname() {
        return previousLastname;
    }

    public void setPreviousLastname(String previousLastname) {
        this.previousLastname = previousLastname;
    }

    public boolean isRetired(Women women){
        boolean retired = false;
        if (women.getAge() > 60) {
            retired = true;
        }
        return retired;
    }

    public void registerPartnership(Man man,Women women) {
        women.setLastName(man.getLastName());
        women.setPartner(true);
        man.setPartner(true);
    }

    public void deregisterPartnership(Man man,Women women) {
        women.setLastName(women.getPreviousLastname());
        women.setPartner(false);
        man.setPartner(false);
    }

}
