public class Client {
    public static void main(String[] args) {
        Image image = new Proxy("testFile.png");
        image.display();
        System.out.println("");

        image.display();
    }
}
