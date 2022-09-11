public class AfishaManager {
    private String[] films = new String[0];
    private final int maxLimit;

    public AfishaManager() {
        maxLimit = 10;
    }

    public AfishaManager(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    public void add(String film) {
        String[] strings = new String[films.length + 1];
        System.arraycopy(films, 0, strings, 0, films.length);
        strings[strings.length - 1] = film;
        films = strings;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast(int maxLimit) {
        int length;
        if (films.length < maxLimit) {
            length = films.length;
        } else {
            length = maxLimit;
        }
        String[] strings = new String[length];
        for (int i = 0; i < films.length; i++) {
            strings[i] = films[films.length - 1 - i];
        }
        return strings;
    }
}
