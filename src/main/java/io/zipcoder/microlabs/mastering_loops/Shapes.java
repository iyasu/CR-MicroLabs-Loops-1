package io.zipcoder.microlabs.mastering_loops;

import javafx.scene.shape.Path;

public class Shapes {


    public String triangle(){
        String out = "triangle()\n*** Output ***";
        for (int i = 0; i < 5; i++){
            out += "\n";
            for(int j = 0; j <= i; j++){
                out += "*";
            }
        }
        return out;
    }

    public String tableSquare(){
        String out = "tableSquare()\n*** Output ***\nA 4x4 table square";
        for (int i = 1; i < 5; i++){
               out += "\n|";
            for (int j = 1; j < 5; j++){
                int length = (int)(Math.log10(j*4)+2);
                out += String.format("%"+length+"d |",i * j);
            }
        }
        return out;
    }

    public String tableSquares(int n){
        String out = "tableSquares(6)\n*** Output ***\nA "+n+"x"+n+" table square";
        for (int i = 1; i <= n; i++){
            out += "\n|";
            for (int j = 1; j <= n; j++){
                int length = (int)(Math.log10(j*n)+2);
                out += String.format("%"+length+"d |",i * j);
            }
        }
        return out;
    }
}
