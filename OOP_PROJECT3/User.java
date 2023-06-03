package OOP_PROJECT3;


public class User implements Comparable<User>{
    private String firstName;

    private String lastName;

    private int age;

    private Personal personal;


    public User(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("firstName: %s, lastName: %s, Age: %d", firstName, lastName, age);
    }

    @Override
    public int compareTo(User o){
        int firstNameCompareTo = this.firstName.compareTo(o.firstName);
        if(firstNameCompareTo != 0){
            return firstNameCompareTo;
        }
        int lastNameCompareTo = this.lastName.compareTo(o.lastName);
        if(lastNameCompareTo != 0){
            return lastNameCompareTo;
        }
        return this.age - o.age;
        
    }

    public void setPersonal(Personal personal){
        this.personal = personal;
    }
    
    public Personal getPersonal(){
        return personal;
    }
}