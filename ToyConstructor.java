import java.util.ArrayList;

public class ToyConstructor {
    private ArrayList<Toy> toys;// Список игрушек

    public ToyConstructor(String[] data) {
        String[] lines = data;// Получаем данные в виде массива строк
        int numToys = lines.length;// Определяем количество игрушек
        toys = new ArrayList<Toy>();// Создаём новый ArrayList для хранения игрушек
        
        // Проходим по каждой строке данных
        for (int i = 0; i < numToys; i++) {
            String[] parts = lines[i].split(",");
             // Создаём новый объект Toy и добавляем его в список игрушек
            toys.add(
                new Toy(
                    Integer.parseInt(parts[0].trim()), 
                    parts[1].trim(), 
                    Double.parseDouble(parts[2].trim())
                )
            );
        }
    }
    // Метод для получения списка игрушек
    public ArrayList<Toy> getToys() {
        return toys;// Возвращаем список игрушек
    }
}
