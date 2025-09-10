public class Main {
    public static void main(String[] args) {
        //Creazione di un punto
        Punto p = new Punto (3, 5);

        //Lettura delle coordinate
        System.out.println("x: " + p.x()); // 3
        System.out.println("y: " +  p.y()); // 5

        //Stampiamo l'intero punto
        System.out.println(p); //Punto [x=3, y=5]

    }
}