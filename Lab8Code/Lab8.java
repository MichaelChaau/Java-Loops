import java.util.Scanner;
/*
 * Copyright (C) 2020 Aparna Mahadev
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
 */
/**
 * Creates a ShapeDrawer and draws 5 different shapes on the screen.
 *
 * @author Aparna Mahadev
 * @version Lab 8
 */
public class Lab8  {
    public static void main (String[] args)   {
        Scanner keyboard = new Scanner(System.in);
        ShapeDrawer drawer = new ShapeDrawer();
        String response;

        do {
	    System.out.print("Please enter a positive integer in the range 2-8(both inclusive): ");
            int size = Integer.parseInt(keyboard.nextLine() );

            drawer.setSize(size);

            // tell the drawer object to draw a box
            drawer.drawBox();
            System.out.println("\n");

            // tell the drawer to draw a line slanted to the right
            drawer.drawSlantRight();
            System.out.println("\n");
            
            // tell the drawer to draw a line slanted to the left
            drawer.drawSlantLeft();
            System.out.println("\n");

            // tell the drawer to draw a triangle
            drawer.drawTriangle();
            System.out.println("\n");
            
            // tell the drawer to draw a X
            drawer.drawX();
            System.out.println("\n");

            // tell the drawer to draw a Xmas tree
            drawer.drawXmasTree();
            System.out.println("\n");

            System.out.print("Do you want to try again? Enter Y for yes or N for no: ");
            response = keyboard.nextLine().toUpperCase();
	} while (response.charAt(0) == 'Y');
	System.out.println("Thank you for using my program.  Have a nice day.");
    } // end of main
}   // end of Lab8
