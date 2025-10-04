package entities;

public class Application {
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public Application(char gender, int beer, int barbecue, int softDrink) {
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;
        this.softDrink = softDrink;
    }

    public Application() {
    }

    public double ticket() {
        double womanValue = 8.0;
        double menValue = 10.0;
        double ticket = 0.0;
        if (gender == 'M') {
            ticket = menValue;
        } else {
            ticket = womanValue;
        }
        return ticket;
    }

    public double feeding(int beer, int softDrink, int barbecue) {
        double barbecueValue = barbecue * 7.00;
        double beerValue = beer * 5.00;
        double softDrinkValue = softDrink * 3.00;

        return  barbecueValue + beerValue + softDrinkValue;
    }

    public double cover(){
        double coverValue = 4.0;
        if(feeding(beer, softDrink, barbecue) > 30.00){
            coverValue = 0.00;
        } return coverValue;
    }

    public double total() {
        return cover() + feeding(beer, softDrink, barbecue) + ticket();
    }
}


