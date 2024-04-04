import java.util.ArrayList;

public class ToyConstructor {
    private ArrayList<Toy> toys;

    public ToyConstructor(String[] data) {
        String[] lines = data;
        int numToys = lines.length;
        toys = new ArrayList<Toy>();

        for (int i = 0; i < numToys; i++) {
            String[] parts = lines[i].split(",");
            toys.add(
                new Toy(
                    Integer.parseInt(parts[0].trim()), 
                    parts[1].trim(), 
                    Double.parseDouble(parts[2].trim())
                )
            );
        }
    }

    public ArrayList<Toy> getToys() {
        return toys;
    }
}
