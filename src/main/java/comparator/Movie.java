import java.util.Arrays;
import java.util.Comparator;

public class Movie {
    
    private int yearReleased;
    private double rating,budget,collectionAmount,profit;
    
    
    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;

        this.profit = this.collectionAmount - this.budget;
    }

    public int getYearReleased() {
        return yearReleased;
    }
    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getBudget() {
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }
    public double getCollectionAmount() {
        return collectionAmount;
    }
    public void setCollectionAmount(double collectionAmount) {
        this.collectionAmount = collectionAmount;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
    
    @Override
    public String toString(){
        return ""+this.yearReleased+" "+this.rating+" "+this.profit;
    }

    public static void main(String[] args) {
        Movie[] mv = new Movie[3];
        mv[0] = new Movie(2014, 4.5, 100000, 200000);
        mv[1] = new Movie(2015, 4.7, 150000, 200000);
        mv[2] = new Movie(2013, 4.5, 100000, 200000);

        Arrays.sort(mv,new CompareByRatingAndProfit());

        System.out.println("After sorting by Rating and profit : ");
        for(int i =0;i<mv.length;i++)
        System.out.println(mv[i].toString());

        Arrays.sort(mv,new CompareByReleaseAndRating());

        System.out.println("After sorting by Rating and profit : ");
        for(int i =0;i<mv.length;i++)
        System.out.println(mv[i].toString());

    }   
}

class CompareByRatingAndProfit implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        if(o1.getRating()>o2.getRating()) return 1;
        else if(o1.getRating()<o2.getRating()) return -1;
        else{
            if(o1.getProfit()>o2.getProfit()) return 1;
            else if(o1.getProfit()<o2.getProfit()) return -1;
            else return 0;
        }    
    }

}

class CompareByReleaseAndRating implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        if(o1.getRating()>o2.getRating()) return 1;
        else if(o1.getRating()<o2.getRating()) return -1;
        else{
            if(o1.getYearReleased()>o2.getYearReleased()) return 10;
            else if(o1.getYearReleased()<o2.getYearReleased()) return -10;
            else return 100;
        }       
    }
    
}