import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Аудиокнига");
        AudioBook audioBook = new AudioBook();
        audioBook.inputInfo(sc);
        audioBook.getInfo();
        audioBook.open();
        audioBook.close();

        System.out.println("\nЦифровая аудиокнига ");
        DigitalAudioBook digitalAudioBook = new DigitalAudioBook();
        digitalAudioBook.inputInfo(sc);
        digitalAudioBook.getInfo();
        digitalAudioBook.open();
        digitalAudioBook.close();

        System.out.println("\nФильм");
        Movie movie = new Movie();
        movie.inputInfo(sc);
        movie.getInfo();
        movie.open();
        movie.close();

        System.out.println("\nМюзикл");
        Musical musical = new Musical();
        musical.inputInfo(sc);
        musical.getInfo();
        musical.open();
        musical.close();
    }
}