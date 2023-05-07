public class Man extends Person {

    public Man(String firstName, String lastName, int age, Boolean partner){
        super(firstName,lastName,age,partner);
    }

    public boolean isRetired(Man man){
        boolean retired = false;
        if (man.getAge() > 65) {
            retired = true;
        }
        return retired;
    }


}
