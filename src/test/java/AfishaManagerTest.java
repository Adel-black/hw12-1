import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {
    AfishaManager manager = new AfishaManager();

    @Test
    public void addFilms() {
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        String[] expected = {"film1", "film2", "film3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFilms() {
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        String[] expected = {"film3", "film2", "film1"};
        String[] actual = manager.findLast(10);
        Assertions.assertArrayEquals(expected, actual);
    }
}
