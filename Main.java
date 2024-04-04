import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Integer gamesCount = 10;// Количество игр
        String[] toyData = {
            "1, Barbie, 5",
            "2, Car, 10",
            "3, Teddy Bear, 15",
            "4, Ball, 50",
            "5, Horse, 20"
        };
         // Создание экземпляра ToyConstructor для создания игрушек из данных
        ToyConstructor constructor = new ToyConstructor(toyData);
        // Создание экземпляра ToyStore для хранения игрушек и выдачи призов
        ToyStore store = new ToyStore(constructor.getToys());
        store.fillQueue(gamesCount);// Заполнение очереди игр
        
        // Цикл для проведения игр и записи призов в файл
        for (int i = 0; i < gamesCount; i++) {
            Toy prize = store.getPrizeToy();// Получение призовой игрушки
            WritePrizeInFile(prize);// Запись призовой игрушки в файл
        }
    }

    // Метод для записи призовой игрушки в файл
    public static void WritePrizeInFile(Toy prizeToy) {
        try (FileWriter writer = new FileWriter("result.txt", true)) {
            writer.write(prizeToy.toString() + "\n");// Запись информации о призовой игрушке в файл

        } catch (IOException e) {
            e.printStackTrace();// Обработка исключения в случае ошибки записи
        }
    }
}
