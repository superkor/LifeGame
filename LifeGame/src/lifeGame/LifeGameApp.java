//CREATED BY JUSTIN CHOW

package lifeGame;

import java.util.Scanner;

public class LifeGameApp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x, y, cellCount;
        Logic game = new Logic();
        String keypress;

        System.out.print("How many cells do you want to start off with? ");
        cellCount = input.nextInt();

        for (int w = 0; w < cellCount; w++){
            System.out.print("Enter the x point (0-19): ");
            x = input.nextInt();

            while(x < 0 || x > 19){
                System.out.println("You must enter a value between 0-19.");
                System.out.print("Enter the x point (0-19): ");
                x = input.nextInt();
            }

            System.out.print("Enter the y point (0-19): ");
            y = input.nextInt();

               while(y < 0 || y > 19){
                   System.out.println("You must enter a value between 0-19.");
                   System.out.print("Enter the y point (0-19): ");
                   y = input.nextInt();
               }

             while(game.setValues(x, y)){
                 System.out.println("You must enter a point not already selected.");
                 System.out.print("Enter the x point (0-19): ");
                 x = input.nextInt();

                while(x < 0 || x > 19){
                    System.out.println("You must enter a value between 0-19.");
                    System.out.print("Enter the x point (0-19): ");
                    x = input.nextInt();
                }

                System.out.print("Enter the y point (0-19): ");
                y = input.nextInt();

               while(y < 0 || y > 19){
                   System.out.println("You must enter a value between 0-19.");
                   System.out.print("Enter the y point (0-19): ");
                   y = input.nextInt();
               }
             }

        }

        game.showBoard();
        do{
            game.cell();
            System.out.println("----------------------------\n");
            game.showBoard();
            
            System.out.print("Enter q to quit. Enter anything to continue...");
            keypress = input.next();

            if (keypress.equals("q")){
                break;
            }

        } while(game.checkDone());
        
        System.out.println("Simulation finished.");
        input.close();
    }
}