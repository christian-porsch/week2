public class Person {

    String firstName;
    String lastName;
    int age;


    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
        if (age < 0 || age > 100){
            this.age = 0;
        }
    }

    public boolean isTeen(){
        if (age > 12 && age < 20){
            return true;
        }
        return false;
    }

    public String getFullName(){

        String fullName = firstName + " " + lastName;

        if (firstName.isEmpty() && lastName.isEmpty()){
            return fullName;
        }
        else if (lastName.isEmpty()){
            return firstName;
        }
        else if (firstName.isEmpty()){
            return lastName;
        }
        return fullName;
    }



}
