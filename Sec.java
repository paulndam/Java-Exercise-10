public class Sec {

    public static void main(String[] args) {

        System.out.println("<--------------While Loop ------------------>");
        

        int x = 1;
        while (x < 100) {
            System.out.println(x);
            x++;
        }

        // String word1 = "Mama";
        // while(word1 != "Papa"){
        //     System.out.println("I love my " + word1 + "Food 🤠 👨🏼‍🍳");
        // }

        System.out.println("<--------------Do Loop ------------------>");

        // do loop 

        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while (i < 100);


        System.out.println("<--------------For Loop------------------>");


        // for loop 
        for (int j = 1; j < 100; j++) {
            System.out.println(j);
        }

        // for each 

        System.out.println("<--------------For Each------------------>");

        String[] oranges = { 
                "red", 
                "blue", 
                "white", 
                "yellow" 
        };

        for (String fruits : oranges) {
            System.out.println(fruits);
            
        }
        





    }
    
}
