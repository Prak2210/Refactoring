public class Movie {
    private CategoryInterpreter movieCategory;
    private String name;

    public Movie(String name, CategoryInterpreter movieCategory) {
        this.name = name;
        this.movieCategory = CategoryInterpreter.CHILDRENS;
    }

    public String getName() {
        return name;
    }

    public CategoryInterpreter getMovieCategory() {
        return movieCategory;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
