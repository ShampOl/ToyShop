public class Toy implements Comparable<Toy> {
    private int id;// идентификатор игрушки
    private String name;// имя игрушки
    private double weight;// вес игрушки
// Конструктор
    public Toy(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }
// Метод сравнения
    @Override
    public int compareTo(Toy other) {
        return Double.compare(this.weight, other.weight);
    }
// Переопределение метода toString для вывода информации об игрушке
    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight;
    }
}
