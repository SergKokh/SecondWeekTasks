package MethodsKlassObject.ToString;

public class ClassUser {

    private String name;
    private int age;
    private String city;

    public ClassUser(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "My name " + name + ". My age " +age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
