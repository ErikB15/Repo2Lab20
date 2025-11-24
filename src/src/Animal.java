public abstract class Animal {
    protected String name;
    protected int age;
    protected boolean male;

    public Animal(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }
    public String toString() {
        return "Animal: " + name;
    }
}