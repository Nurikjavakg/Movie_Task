package services;

import classes.DataBase;
import classes.Director;
import classes.Movie;
import interfaces.Sortable;

import java.util.*;

public class SortServices implements Sortable {
    private DataBase dataBase;

    public SortServices(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void sortByMovieName(List<Movie> movies) {

      Collections.sort(movies,SortServices.sortByMovieName);
        System.out.println(movies);


    }

    @Override
    public void sortMovieByName(List<Movie> movies) {
        Collections.sort(movies,SortServices.sortMovieByName);
        System.out.println(movies);

    }


    @Override
    public void firstSortByYear(List<Movie> movies) {
        Collections.sort(movies,SortServices.sortByYear);
        System.out.println(movies);

    }
    public void secondSortByYear(List<Movie>movies){
        Collections.sort(movies,SortServices.sortByYears);
        System.out.println(movies);
    }

    @Override
    public void sortByDirector(List<Movie>movies) {
        for (int i = 0; i < movies.size(); i++) {
            if(movies.get(i).getDirector().equals(movies.get(i).getDirector())){
                System.out.println(movies.get(i).getDirector());
            }

        }

        }


    public static Comparator<Movie>sortMovieByName = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };

    public static Comparator<Movie> sortByMovieName = (o1, o2) -> o1.getName().compareTo(o2.getName());
    public static Comparator<Movie>sortByYear = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear()-o2.getYear();
        }
    };
    public static Comparator<Movie>sortByYears = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getYear()-o1.getYear();
        }

    };

}
