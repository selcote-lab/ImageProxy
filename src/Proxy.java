public class Proxy implements Image {
    private Image realImage;
    private String fileName;

    public Proxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(this.fileName);
        }

        realImage.display();
    }
}
