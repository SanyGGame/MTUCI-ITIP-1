import java.util.Scanner;
public abstract class Book {
    private String title;
    private String author;
    private int year;
    private static int objectCounter = 0;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        objectCounter++;
    }

    public Book() {
        this("Без названия", "Неизвестный автор", 2024);
    }

    public static int getCount() {
        return objectCounter;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public abstract void open();
    public abstract void close();
    public abstract void getInfo();
    public void inputInfo(Scanner sc) {
        System.out.print("Введите название: ");
        this.title = sc.nextLine();

        System.out.print("Введите автора: ");
        this.author = sc.nextLine();

        System.out.print("Введите год выпуска: ");
        this.year = sc.nextInt();
        sc.nextLine();
    }
}
class AudioBook extends Book {
    private int duration;
    private String narrator;

    public AudioBook(String title, String author, int year, int duration, String narrator) {
        super(title, author, year);
        this.duration = duration;
        this.narrator = narrator;
    }

    public AudioBook() {
        super();
        this.duration = 0;
        this.narrator = "Неизвестен";
    }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public String getNarrator() { return narrator; }
    public void setNarrator(String narrator) { this.narrator = narrator; }

    @Override
    public void getInfo() {
        System.out.println("Аудиокнига: \"" + getTitle() + "\"");
        System.out.println("Автор: " + getAuthor());
        System.out.println("Год выпуска: " + getYear());
        System.out.println("Длительность: " + duration + " минут");
        System.out.println("Чтец: " + narrator);
            }

    @Override
    public void inputInfo(Scanner sc) {
        super.inputInfo(sc);

        System.out.print("Введите длительность (в минутах): ");
        duration = sc.nextInt();
        sc.nextLine();

        System.out.print("Введите имя чтеца: ");
        narrator = sc.nextLine();
    }

    @Override
    public void open() {
    System.out.println("Слушаем аудиокнигу \"" + getTitle() + "\" в исполнении " + narrator);
            }

    @Override
    public void close() {
    System.out.println("Перестаем слушать аудиокнигу \"" + getTitle() + "\"");
            }
}
class DigitalAudioBook extends AudioBook {
    private double fileSize;
    private String format;

    public DigitalAudioBook(String title, String author, int year, int duration, String narrator,
                            double fileSize, String format) {
        super(title, author, year, duration, narrator);
        this.fileSize = fileSize;
        this.format = format;
    }

    public DigitalAudioBook() {
        super();
        this.fileSize = 0.0;
        this.format = "MP3";
    }

    public double getFileSize() { return fileSize; }
    public void setFileSize(double fileSize) { this.fileSize = fileSize; }

    public String getFormat() { return format; }
    public void setFormat(String format) { this.format = format; }

    @Override
    public void getInfo() {
        System.out.println("Цифровая аудиокнига: \"" + getTitle() + "\"");
        System.out.println("Автор: " + getAuthor());
        System.out.println("Год выпуска: " + getYear());
        System.out.println("Длительность: " + getDuration() + " минут");
        System.out.println("Чтец: " + getNarrator());
        System.out.println("Формат файла: " + format);
        System.out.println("Размер файла: " + fileSize + " МБ");
    }

    @Override
    public void inputInfo(Scanner sc) {
        super.inputInfo(sc);

        System.out.print("Введите размер файла (МБ): ");
        fileSize = sc.nextDouble();
        sc.nextLine();

        System.out.print("Введите формат файла: ");
        format = sc.nextLine();
    }

    @Override
    public void open() {
        System.out.println("Слушаем цифровую аудиокнигу \"" + getTitle() + "\" в формате " + format +
                        ", в исполнении: " + getNarrator());
    }

    @Override
    public void close() {
    System.out.println("Перестаем слушать цифровую аудиокнигу \"" + getTitle() + "\"");
            }

}
class Movie extends Book {
    private int duration;
    private String director;

    public Movie(String title, String author, int year, int duration, String director) {
        super(title, author, year);
        this.duration = duration;
        this.director = director;
    }

    public Movie() {
        super();
        this.duration = 0;
        this.director = "Неизвестен";
    }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    @Override
    public void getInfo() {
        System.out.println("Фильм: \"" + getTitle() + "\"");
        System.out.println("Автор: " + getAuthor());
        System.out.println("Год выпуска: " + getYear());
        System.out.println("Продолжительность: " + duration + " минут");
        System.out.println("Режиссёр: " + director);
    }

    @Override
    public void inputInfo(Scanner sc) {
        super.inputInfo(sc);

        System.out.print("Введите продолжительность фильма (в минутах): ");
        duration = sc.nextInt();
        sc.nextLine();

        System.out.print("Введите режиссёра: ");
        director = sc.nextLine();
    }

    @Override
    public void open() {
        System.out.println("Смотрим фильм \"" + getTitle() + "\" режиссёра " + director);
    }

    @Override
    public void close() {
        System.out.println("Перестаем смотреть фильм \"" + getTitle() + "\"");
    }
}
class Musical extends Book {
    private int numberOfSongs;
    private String mainSinger;

    public Musical(String title, String author, int year, int numberOfSongs, String mainSinger) {
        super(title, author, year);
        this.numberOfSongs = numberOfSongs;
        this.mainSinger = mainSinger;
    }

    public Musical() {
        super();
        this.numberOfSongs = 0;
        this.mainSinger = "Неизвестен";
    }

    public int getNumberOfSongs() { return numberOfSongs; }
    public void setNumberOfSongs(int numberOfSongs) { this.numberOfSongs = numberOfSongs; }

    public String getMainSinger() { return mainSinger; }
    public void setMainSinger(String mainSinger) { this.mainSinger = mainSinger; }

    @Override
    public void getInfo() {
        System.out.println("Мюзикл: \"" + getTitle() + "\"");
        System.out.println("Автор: " + getAuthor());
        System.out.println("Год выпуска: " + getYear());
        System.out.println("Количество песен: " + numberOfSongs);
        System.out.println("Главный исполнитель: " + mainSinger);
    }

    @Override
    public void inputInfo(Scanner sc) {
        super.inputInfo(sc);

        System.out.print("Введите количество песен: ");
        numberOfSongs = sc.nextInt();
        sc.nextLine();

        System.out.print("Введите главного исполнителя: ");
        mainSinger = sc.nextLine();
    }

    @Override
    public void open() {
        System.out.println("Слушаем мюзикл \"" + getTitle() + "\" с главным исполнителем " + mainSinger);
    }

    @Override
    public void close() {
        System.out.println("Мюзикл \"" + getTitle() + "\" окончен");
    }
}