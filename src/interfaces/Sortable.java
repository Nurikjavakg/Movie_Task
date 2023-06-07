package interfaces;

import classes.Director;
import classes.Movie;

import java.util.List;

public interface Sortable {
    void sortByMovieName(List<Movie> movies);
    void sortMovieByName(List<Movie>movies);

//-from A to Z

//-from Z to A

    void firstSortByYear(List<Movie>movies);

//-Ascending

//-Descending
    void secondSortByYear(List<Movie>movies);
    void sortByDirector(List<Movie>movies);


}
