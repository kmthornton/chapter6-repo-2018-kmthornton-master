/********************************************************************
// Starter Code for Magic Square


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.*;

public class MagicSquareTest

{       final static int MAX = 15;

      public static void main (String[] args)
   {


    // make a 2d array with an iniitalizer list.
    //If you test this and it not Magic your waving your wand wrong

    int [][] square = { {16,3, 2,13},
                        {5,10,11, 8},
                        {9, 6, 7,12},
                        {4,15,14, 1}  };

    // magic square or not a magic square, that is the question
    int [][] square1 = { {5,9,1},
                         {7,2,6},
                         {3,4,8}  };

    // Do you belive in magic?
    int [][] square2 = {{11,24, 7,20, 3},
                        { 4,12,25, 8,16},
                        {17, 5,13,21, 9},
                        {10,18, 1,14,22},
                        {23, 6,19, 2,15}  };
                        
    //this should not be a magic square
    int [][] square3 = {{4,9,2},
                        {3,5,7},
                        {8,1,4}};

    MagicSquareClass useful = new MagicSquareClass(square1);
    if (useful.isMagic(square))
        System.out.println("It's MAGIC!! With a sum of "+ useful.getMagicNum(square));
    else
        System.out.println("Hello muggle");

    useful.setMagicSquare(square1);

     if (useful.isMagic(square1))
        System.out.println("It's MAGIC!! With a sum of "+ useful.getMagicNum(square1));
    else
        System.out.println("Hello muggle");
     
    useful.setMagicSquare(square2);
         if (useful.isMagic(square2))
        System.out.println("It's MAGIC!! With a sum of "+ useful.getMagicNum(square2));
    else
        System.out.println("Hello muggle");
    
    useful.setMagicSquare(square3);
         if (useful.isMagic(square3))
        System.out.println("It's MAGIC!! With a sum of "+ useful.getMagicNum(square3));
    else
        System.out.println("Hello muggle");



}//end of main
}// end of class











