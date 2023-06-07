import classes.Cast;
import classes.DataBase;
import classes.Director;
import classes.Movie;
import enums.Genre;
import services.FindService;
import services.SortServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Director>directors = new ArrayList<>(
                List.of(new Director("James Gang","Gang"),
                        new Director("Zack Person","Person"),
                        new Director("Mike Linder","Linder"),
                        new Director("Thomas Blue","Blue"),
                        new Director("Zack Person","Person")));
        List<Director>directors1 = new ArrayList<>(List.of(directors.get(0),directors.get(1)));
        List<Director>directors2 = new ArrayList<>(List.of(directors.get(2)));
        List<Director>directors3 = new ArrayList<>(List.of(directors.get(3)));
        List<Director>directors4 = new ArrayList<>(List.of(directors.get(4)));

        List<Cast>casts = new ArrayList<>(
                List.of(new Cast("Leanardo De Caprio","Main role"),
                        new Cast("Brett Pitt","Main role"),
                        new Cast("John Cena","Second role"),
                        new Cast("Mark Woulberg","Main role"),
                        new Cast("Dwayne Johnson","Second role"),
                        new Cast("Kevin Hard","Main")));

        List<Cast>casts1 = new ArrayList<>(List.of(casts.get(0),casts.get(1)));
        List<Cast>casts2 = new ArrayList<>(List.of(casts.get(1),casts.get(3)));
        List<Cast>casts3 = new ArrayList<>(List.of(casts.get(2),casts.get(3)));
        List<Cast>casts4 = new ArrayList<>(List.of(casts.get(4),casts.get(5)));


        List<Movie>movies = new ArrayList<>(
             List.of(new Movie("The god father",1972, "DRAMA",directors.get(0),casts1),
                     new Movie("Red box",2017,"FANTASY",directors.get(1),casts2),
                     new Movie("First love",2013,"ROMANTIC",directors.get(2),casts3),
                     new Movie("Hate you",2023,"FANTASY",directors.get(3),casts4),
                     new Movie("fast time",2003,"HISTORY",directors.get(4),casts1)));


        DataBase dataBase = new DataBase(movies,casts,directors);
        FindService findService = new FindService(dataBase);
        SortServices sortServices = new SortServices(dataBase);

        while (true){
            System.out.println("1-> get all movies:\n" +
                               "2-> sort movie by name+:\n" +
                               "3-> sort movie by name-\n" +
                               "4-> sort by year+ \n" +
                               "5-> sort by year-\n" +
                               "6-> sort by director\n" +
                               "7-> find film \n" +
                               "8-> find movie actor name\n" +
                               "9-> find movie by year \n" +
                               "10-> find movie by director \n" +
                               "11-> find movie by genre \n" +
                               "12-> find movie by role ");
            int number = new Scanner(System.in).nextInt();
            switch (number){
                case 1:
                    System.out.println("1-> get all movies:");
                    System.out.println(findService.getAllMovies(movies));
                    break;
                case 2:
                    System.out.println("2-> sort movie by name+:");
                    sortServices.sortByMovieName(movies);
                    break;
                case 3:
                    System.out.println("3-> sort movie by name-");
                    sortServices.sortMovieByName(movies);
                    break;
                case 4:
                    System.out.println("4-> sort by year+");
                    sortServices.firstSortByYear(movies);
                    break;
                case 5:
                    System.out.println("5-> sort by year-");
                    sortServices.secondSortByYear(movies);
                    break;
                case 6:
                    System.out.println("6-> sort by director:");
                    sortServices.sortByDirector(movies);
                    break;
                case 7:
                    System.out.println("7-> find film:");
                    findService.findMovieByFullNameOrPartName(movies);
                    break;
                case 8:
                    System.out.println("8-> find movie actor name:");
                    findService.findMovieByActorName(movies);
                    break;
                case 9:
                    System.out.println("9-> find movie by year:");
                    findService.findMovieByYear(movies);
                    break;
                case 10:
                    System.out.println("9-> find movie by year:");
                    findService.findMovieByDirector(movies);
                    break;
                case 11:
                    System.out.println("11-> find movie by genre:");
                    findService.findMovieByGenre(movies);
                    break;
                case 12:
                    System.out.println("12-> find movie by role: ");
                    findService.findMovieByRole(movies);



                    }


            }

        }



    }
