package peaksoft;

public class Main {

    public static void main(String[] args) {


        Flat flat1 = new Flat("Советская № 23", 4500);
        Flat flat2 = new Flat("Советская № 23", 4500);
        Flat flat3 = new Flat("Советская № 23", 4500);
        Flat flat4 = new Flat("Советская № 23", 4500);

        Hostels hostels1 = new Hostels("Чуйская № 223", 5000);
        Hostels hostels2 = new Hostels("Чуйская № 223", 5000);
        Hostels hostels3 = new Hostels("Чуйская № 223", 5000);

        Hotel hotel1 = new Hotel("Киевская № 433", 2400);
        Hotel hotel2 = new Hotel("Киевская № 433", 2400);
        Hotel hotel3 = new Hotel("Киевская № 433", 2400);
        Hotel hotel4 = new Hotel("Киевская № 433", 2400);
        Hotel hotel5 = new Hotel("Киевская № 433", 2400);

        int counter = 0;
        Flat[] flats = {flat1, flat2, flat3, flat4};
        for (Flat a : flats) {
            if (a instanceof Flat) {
                counter++;
            }
        }
        System.out.println(flat1);
        flat1.toMakePayment();
        System.out.println("Проживают: " + counter + " человек");

        int counter1 = 0;
        Hotel[] hotels = {hotel1, hotel2, hotel3, hotel4, hotel5};
        for(Hotel b : hotels){
            if(b instanceof Hotel){
                counter1++;
            }
        }
        System.out.println("================================================================");
        System.out.println(hotel1);
        hotel2.toMakePayment();
        System.out.println("Проживают: " + counter1 + " человек");

        int counter2 = 0;
        Hostels[] hostels = {hostels1,hostels2,hostels3};
        for(Hostels c :hostels){
            if (c instanceof Hostels){
                counter2++;
            }
        }
        System.out.println("==================================================");
        System.out.println(hostels1);
        hostels1.toMakePayment();
        System.out.println("Проживают: " + counter2 + " человек");

    }
}