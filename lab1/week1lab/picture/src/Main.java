public class Main {

    public static void main(String[] args) {

        Picture picture1 = new Picture();
        picture1.draw();
        pause();
        picture1.sunset();
//        pause();
//        picture1.setBlackAndWhite();

    }

    private static void pause() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
    }
}
