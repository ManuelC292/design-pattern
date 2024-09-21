import bo.Computer;

public class Main {
    public static void main(String[] args) {

        // le but ici est de facilter la creation d'objet complexe
            Computer computer = Computer.builder("AMD Ryzen 9", "32GB")
                    .setStorage("1TB SSD")
                    .setGraphicsCard(true)
                    .build();

            System.out.println(computer);
        }

}