public class KarsilastirilabilirNesne implements Comparable<Person> {
    private String name;
    private int age;

    public KarsilastirilabilirNesne(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public int compareTo(Person other) {
        // Bu örnekte sadece yaşa göre karşılaştırma yapıyoruz
        return Integer.compare(this.age, other.age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // compareTo metodunu kullanarak karşılaştırma
        if (person1.compareTo(person2) < 0) {
            System.out.println(person1.name + " is younger than " + person2.name);
        } else if (person1.compareTo(person2) > 0) {
            System.out.println(person1.name + " is older than " + person2.name);
        } else {
            System.out.println(person1.name + " is the same age as " + person2.name);
        }
    }
}

