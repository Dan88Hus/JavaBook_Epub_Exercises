package ch1;

import java.awt.Point;

public class ZZZZZnake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point playerPosition = new Point(10,9);
		Point snakePosition = new Point(30,2);
		Point goldPosition = new Point(6,6);
		Point doorPosition = new Point(0,5);
		boolean rich = false;
		while (true) {
		      for ( int y = 0; y < 10; y++ ) {
		          for ( int x = 0; x < 40; x++ ) {
		            Point p = new Point( x, y );
		            if ( playerPosition.equals( p ) ) {
		              System.out.print( '&' );}
		            else if ( snakePosition.equals( p ) ) {
		              System.out.print( 'S' );}
		            else if ( goldPosition.equals( p ) ) {
		              System.out.print( '$' );}
		            else if ( doorPosition.equals( p ) ) {
		              System.out.print( '#' );}
		            else {System.out.print( '.' );}
		          }
		      }
		}         
	}
}
