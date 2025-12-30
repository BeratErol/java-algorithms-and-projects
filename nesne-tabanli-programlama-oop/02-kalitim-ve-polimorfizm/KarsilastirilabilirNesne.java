
public class KarsilastirilabilirNesne implements Comparable<KarsilastirilabilirNesne> {
    private String name;
    private int age;

    public KarsilastirilabilirNesne(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public int compareTo(KarsilastirilabilirNesne other) {
        return Integer.compare(this.age, other.age);
    }

    public static void main(String[] args) {
        KarsilastirilabilirNesne person1 = new KarsilastirilabilirNesne("Alice", 30);
        KarsilastirilabilirNesne person2 = new KarsilastirilabilirNesne("Bob", 25);

        if (person1.compareTo(person2) < 0) {
            System.out.println(person1.name + " is younger than " + person2.name);
        } else if (person1.compareTo(person2) > 0) {
            System.out.println(person1.name + " is older than " + person2.name);
        } else {
            System.out.println(person1.name + " is the same age as " + person2.name);
        }
    }
} 