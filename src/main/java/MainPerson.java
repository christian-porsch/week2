public class MainPerson {

    public static void main(String[] args) {
    Person newPerson = new Person();
    newPerson.setFirstName("John");
    newPerson.setLastName("Meyer");
    newPerson.setAge(10);
        System.out.println("fullName= " + newPerson.getFullName());
        System.out.println("teen= " + newPerson.isTeen());

    }

}
