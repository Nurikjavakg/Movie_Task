package classes;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
     private List<Movie>movies = new ArrayList<>();
     private List<Cast>casts = new ArrayList<>();
     private List<Director>directors = new ArrayList<>();

    public DataBase(List<Movie> movies, List<Cast> casts, List<Director> directors) {
        this.movies = movies;
        this.casts = casts;
        this.directors = directors;
    }


    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Cast> getCasts() {
        return casts;
    }

    public void setCasts(List<Cast> casts) {
        this.casts = casts;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }
}
