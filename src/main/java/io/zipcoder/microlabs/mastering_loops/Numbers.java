package io.zipcoder.microlabs.mastering_loops;


import static java.lang.Math.pow;

public class Numbers {

    public String oneToTen(){
        String out = "*** Output ***\noneToTen()";

        for (int i = 1; i <= 10; i++){
            out += "\n" + i;
        }
        return out;
    }

    public String oddNumbers(){
        String out = "oddNumbers()\n*** Output ***";

        for (int i = 1; i <=20; i++){
            if( i % 2 != 0)
                out += "\n" + i;
        }

        return out;
    }

    public String squares(){
        String out = "squares()";

        for (int i = 1; i <= 100; i++){
            int sqrt = (int) Math.sqrt(i);

            if( i == Math.pow(sqrt, 2))
                out += "\n" + i;
        }
        return out;
    }


    public String random4(){
        return "";
    }

    public String even(int n){
        String out = "even(20)\n*** Output ***";

        for (int i = 1; i < n; i++){
            if( i % 2 == 0)
                out += "\n" + i;
        }
        return out;
    }


    public String powers(int n){
        String out = "powers("+n+")\n*** Output ***";

        for (int i =1; i <= n; i++){
            out += "\n" + (int) Math.pow(2, i);
        }
        return out;
    }

}
