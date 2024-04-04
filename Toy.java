public class Toy implements Comparable<Toy> {
    private int id;
    private String name;
    private double weight;

    public Toy(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Toy other) {
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight;
    }
}
