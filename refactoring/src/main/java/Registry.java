import java.util.*;

public class Registry {
    private  ArrayList<Movie> movieList;
    private  HashMap<CategoryInterpreter, ArrayList<Movie>> registry = new HashMap<>();

    public Registry(){
        registry.put(CategoryInterpreter.CHILDRENS,new ArrayList<Movie>());
        registry.put(CategoryInterpreter.REGULAR,new ArrayList<Movie>());
        registry.put(CategoryInterpreter.NEW_RELEASE,new ArrayList<Movie>());
    }
    public void addMovie(CategoryInterpreter category, Movie movieName) {
        registry.get(category).add(movieName);
    }

    public  ArrayList<Movie> get(CategoryInterpreter category){
        return registry.get(category);
    }

}
