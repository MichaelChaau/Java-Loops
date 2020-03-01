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
 * A class that provides a facility to draw different shapes on the screen.
 *
 * @author Aparna Mahadev
 * @version Lab8
 */
public class ShapeDrawer   {
    private int size;

    /**
      * Sets the size variable to a new value
      * @param size is the new value for the instance variable
      */
    public void setSize(int size) {
		this.size = size;
    }

    /**
      *  Draws a box on the screen of using size
      *  For example, if size is 4, the following shape
      *  would be drawn.
      *  <pre>
      *         *...
      *         **..
      *         ***.
      *         ****
      *  </pre>
      */
    public void drawBox() {

    }

    /**
      *  Draws a line on the screen of using size
      *  For example, if size is 4, the following shape
      *  would be drawn.
      *  <pre>
      *         *
      *          *
      *           *
      *            * 
      * </pre>
      */
    public void drawSlantRight() {

    }

    /**
     *  Draws a slanted line on the screen of using size
     *  For example, if size is 4, the following shape
     *  would be drawn.
     *  <pre>
     *            *
     *           *
     *          *
     *         *
     *  </pre>
    */
    public void drawSlantLeft() {

    }

    /**  
     *  Draws a triangle on the screen of using size
     *  For example, if size is 4, the following shape
     *  would be drawn.
     *  <pre>
     *            *       
     *           ***
     *          *****
     *         *******
     *  </pre>
     */
    public void drawTriangle() {

    }
    
    /**  
     *  Draws a X on the screen of using size
     *  For example, if size is 4, the following shape
     *  would be drawn. 
     *  <pre>
     *  
     *            *       *       
     *             *     *
     *              *   *
     *               * *
     *                *
     *               * *
     *              *   *
     *             *     *
     *            *       *
     * </pre>
    */
    public void drawX() {

    }

    /**
     *  Draws a Xmas tree on the screen of using size
     *  For example, if size is 4, the following shape
     *  would be drawn. 
     *  <pre>
     *            *
     *           ***
     *           ***
     *          *****
     *          *****          
     *          *****
     *         *******
     *         *******
     *         *******
     *         *******
     * </pre>
     */
    public void drawXmasTree() {

    }

    /**
     * writes a line consisting of n1 copies of ch1, n2 copies
     * of ch2, n3 copies of ch3, n4 copies of ch4 and n5 copies
     * of ch5 - but the total length of the line is not to exceed
     * length.  If more than length characters have been requested,
     * writePattern silently truncates the line.
     */
    private void writePattern(char ch1, char ch2, char ch3, char ch4, char ch5,
                 int n1, int n2, int n3, int n4, int n5, int length)  {
         while ((n1 > 0) && (length > 0)) {
		System.out.print(ch1);
		n1--;
		length--;
         }

	 while ((n2 > 0) && (length > 0)) {
		System.out.print(ch2);
		n2--;
		length--;
	 }

	 while ((n3 > 0) && (length > 0)) {
		System.out.print(ch3);
		n3--;
		length--;
	 }

	 while ((n4 > 0) && (length > 0)) {
		System.out.print(ch4);
		n4--;
		length--;
	 }

	 while ((n5 > 0) && (length > 0)) {
		System.out.print(ch5);
		n5--;
		length--;
	}

	System.out.println();   /* advance the cursor to the beginning of a new line */
    }
}  // ShapeDrawer