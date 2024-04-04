import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class ToyStore {
    private PriorityQueue<Toy> allToys;// Очередь приоритетов для хранения всех игрушек
    private ArrayList<Toy> toysTypes;
    private Random random; // Генератор случайных чисел
 
    // Конструктор класса ToyStore
    public ToyStore(ArrayList<Toy> toys) {
        allToys = new PriorityQueue<>();
        toysTypes = toys;
        random = new Random();
    }
    // Метод для добавления игрушки в очередь
    public void addToy(Toy toy) {
        allToys.offer(toy);// Добавление игрушки в очередь
    }

    // Метод для получения всех игрушек из очереди
    public List<Toy> getToys() {
        return new ArrayList<>(allToys);// Возвращаем копию списка всех игрушек из очереди
    }

    // Метод для получения призовой игрушки из очереди
    public Toy getPrizeToy() {
        return allToys.poll();// Извлекаем и возвращаем первую игрушку из очереди
    }

    // Метод для получения случайной игрушки из списка типов игрушек
    public Toy getRandomToy(ArrayList<Toy> toys) {
        return toys.get(random.nextInt(toys.size()));// Возвращаем случайную игрушку из списка
    }

    // Метод для заполнения очереди случайными игрушками
    public void fillQueue(Integer queueLength) {
        for (int i = 0; i < queueLength; i++) {
            addToy(getRandomToy(toysTypes));// Добавляем случайную игрушку в очередь
        }
    }
}

