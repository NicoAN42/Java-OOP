/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

import java.awt.Point;
import java.util.*;
/**
 *
 * @author Acer
 */
public class lj_myRect {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;
        
        lj_myRect buildRect(int x1, int y1, int x2, int y2){
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
            return this;
        }
        
        lj_myRect buildRect(Point topLeft, Point bottomRight){
            x1 = topLeft.x;
            y1 = topLeft.y;
            x2 = bottomRight.x;
            y2 = bottomRight.y;
            return this;
        }
        
        lj_myRect buildRect(Point topLeft, int w , int h){
            x1 = topLeft.x;
            y1 = topLeft.y;
            x2 = (x1 + w);
            y2 = (y1 + h);
            return this;
        }
        
        void printRect(){
            System.out.print("My Rect: <" + x1 + "," + y1);
            System.out.println("," + x2 + "," + y2 + ">");
        }
        
        public static void main(String args[]){
            lj_myRect rect = new lj_myRect();
            
            System.out.println("Calling buildreact with coordinates 25, 25, 50, 50");
            rect.buildRect(25, 25, 50, 50);
            rect.printRect();
            System.out.println("----------");
            System.out.println("Calling buildRect w/points (10,10), (20,20):");
            rect.buildRect(new Point(10,10), new Point(20,20));
            rect.printRect();
            System.out.println("----------");
            System.out.print("Calling buildRect w/1 point (10,10),");
            System.out.println(" width (50) and height (50)");
            rect.buildRect(new Point(10,10), 50, 50);
            rect.printRect();
            System.out.println("----------");

        }
    
    
}
