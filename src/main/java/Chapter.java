public class Chapter {
    private String name;
    private String number;

    public Chapter(String name, String number) {
        this.name = name;
        if (number.matches("^[^.]*.[^.]*$"))
            this.number = number;
        else throw new IllegalArgumentException(" A chapter number can be only 2 levels deep, e.g. 11.3");

    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
