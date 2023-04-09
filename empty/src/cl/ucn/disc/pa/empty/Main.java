package cl.ucn.disc.pa.empty;

import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // rango
        double min = 0;
        double max = 780;

        // lienzo

        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);

        // parpadeo de pantalla
        StdDraw.enableDoubleBuffering();

        Color[] colores = {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};

        // Posicion inicial

        double x = min + (max - min) * Math.random();
        double y = min + (max - min) * Math.random();

        // Velocidad inicial

        double vx0 = Math.random();
        double vy0 = Math.random();
        

        int lineas = 6;

        for (int i = 0; i < lineas; i++) {

            double x0 = min + (max - min) * Math.random();
            double y0 = min + (max - min) * Math.random();
            double x1 = min + (max - min) * Math.random();
            double y1 = min + (max - min) * Math.random();


            StdDraw.setPenColor(colores[(int) (Math.random() * colores.length)]);



            StdDraw.line(x0, y0, x1, y1);
            StdDraw.show();
            StdDraw.pause(350);


        }


    }
}







