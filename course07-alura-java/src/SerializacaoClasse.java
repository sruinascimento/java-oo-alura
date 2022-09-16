import java.io.*;

public class SerializacaoClasse {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        var animal = new Animal("Macaco", 4);
//        System.out.println(animal);
//
//        var oos = new ObjectOutputStream(new FileOutputStream("animal.bin"));
//        oos.writeObject(animal);
//        oos.close();

        var ois = new ObjectInputStream(new FileInputStream("animal.bin"));
        var animalDeserializado = (Animal) ois.readObject();
        ois.close();

        System.out.println(animalDeserializado.getNome());


    }
}
