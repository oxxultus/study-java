package cse.oop2.ch02.movie;

public class Movie {
    String title;
    String genre;
    int rating;
    
    void playIt(){
        // printf 에 주의하여 사용하기
        System.out.printf("%s(장르: %s, %d등급)"+"영화를 상영합니다.%n",title, genre, rating);
    }
}
