import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void QuantityFilmThree() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Джентльмены");

        String[] actual = manager.findAll();
        String[] expected = {"Бладшот", "Вперёд", "Джентльмены"};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void QuantityFilmSeven() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентльмены");
        manager.addFilm("Человек - невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");


        String[] actual = manager.findLast();
        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек - невидимка", "Джентльмены", "Отель Белград"};


        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void LimitFilm() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель Белград");


        String[] actual = manager.findLast();
        String[] expected = {"Отель Белград", "Вперёд", "Бладшот"};


        Assertions.assertArrayEquals(expected, actual);
    }


}
