public class Third {



    int zipCode;
    String city;

    public Third(int num, String cityName) {
        zipCode = num;
        city = cityName;
    }



    public static void main(String[] args) {

        Third myTown = new Third(10809, "Moscow City");

        System.out.println(" City Name is ------->" + " " + myTown.city + " & " + "Zipcode Number is -------> "
                + myTown.zipCode);

    }
    
}
