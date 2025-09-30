public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello, World!");

    }

    private static void pause() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
    }
}
