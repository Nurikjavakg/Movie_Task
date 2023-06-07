package services;

import classes.Cast;
import classes.DataBase;
import classes.Director;
import classes.Movie;
import interfaces.Findsable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindService implements Findsable {
    private DataBase dataBase;

    public FindService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }


    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        for (int i = 0; i < movies.size(); i++) {
            return movies;

        }

        return null;
    }
    @Override
    public void findMovieByFullNameOrPartName(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine().toLowerCase();
        for (Movie movie: movies) {
            if (movie.getName().toLowerCase().startsWith(movieName) || movie.getName().toLowerCase().equalsIgnoreCase(movieName)) {
                System.out.println(movie);

            }

        }

    }
    @Override
    public void findMovieByActorName(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        for (Movie movie: movies) {
            for (Cast cast:movie.getCast()) {
                if (cast.getActorFullName().toLowerCase().equals(actorName.toLowerCase()) || cast.getActorFullName().toLowerCase().equalsIgnoreCase(actorName.toLowerCase())){
                    System.out.println(movie);
                }
                else {
                    System.out.println("Not found like this actor:");
                }
            }
        }

              {
              }
    }
    @Override
    public void findMovieByYear(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        for (int i = 0; i < movies.size(); i++) {
            if(movies.get(i).getYear()==year){
                System.out.println(movies.get(i));
        }
            else {
                System.out.println("Not found film from this year!");
            }
        }

    }
    @Override
    public void findMovieByDirector(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        String directorName = scanner.nextLine();
        for (Movie movie: movies) {
             if(movie.getDirector().getName().equals(directorName) || movie.getDirector().getName().equalsIgnoreCase(directorName)){
                 System.out.println(movie);

            }else {
                 System.out.println("Not found director name!");
             }


        }

            }





    @Override
    public void findMovieByGenre(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        String genre = scanner.nextLine();
        for (int i = 0; i < movies.size(); i++) {
            if(movies.get(i).getGenre().equals(genre) || movies.get(i).getGenre().equalsIgnoreCase(genre)){
                System.out.println(movies.get(i));
            }else {
                System.out.println("Not found film from this genre!");
            }

        }


    }
    @Override
    public void findMovieByRole(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        String role = scanner.nextLine();
        List<Movie>movies1 = new ArrayList<>();
        for (Movie movie : movies) {
            List<Cast>casts = movie.getCast();
            for (Cast cast: casts) {
                if(cast.getRole().contains(role) || cast.getRole().equalsIgnoreCase(role)){
                    movies1.add(movie);
                    System.out.println(movies1);
                }


        }
        }


            }

        }



