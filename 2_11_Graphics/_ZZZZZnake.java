import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;

public class _ZZZZZnake
{
  private static class ZZZZZnakePanel extends JPanel implements KeyListener
  {
    Point playerPosition   = new Point( 10, 9 );
    Point goldPosition     = new Point( 6, 6 );
    Point doorPosition     = new Point( 0, 5 );
    Point[] snakePositions = { new Point( 30, 2 ), null, null, null, null };
    int snakeIdx = 0;
    boolean rich = false;
    boolean end  = false;
    final int WIDTH = 40, HEIGHT = 10;

    ZZZZZnakePanel()
    {
      setPreferredSize( new Dimension(WIDTH*10, HEIGHT*10) );
      setFocusable( true );
      addKeyListener( this );
    }

    @Override protected void paintComponent( Graphics g )
    {
      // Bildschirm löschen

      g.setColor( Color.WHITE );
      g.fillRect( 0, 0, getWidth() - 1, getHeight() - 1 );
      g.setColor( Color.BLACK );

      // Figuren zeichnen
  
      for ( int y = 0; y < HEIGHT; y++ )
      {
        for ( int x = 0; x < WIDTH; x++ )
        {
          char c = ' ';
          Point p = new Point( x, y );
          if ( doorPosition.equals( p ) )
            c = '#';
          else if ( goldPosition.equals( p ) )
            c = '$';
          if ( playerPosition.equals( p ) )
            c = '&';
          if ( Arrays.asList( snakePositions ).contains( p ) )
            c = 'S';

          if ( ! Character.isWhitespace( c ) )
            g.drawString( Character.toString( c ), x * 10, y * 10 );
        }
      }

      // Status aktualisieren

      if ( rich && playerPosition.equals( doorPosition ) )
      {
        System.out.println( "Gewonnen!" );
        end = true;
        return;
      }
      if ( Arrays.asList( snakePositions ).contains( playerPosition ) )
      {
        System.out.println( "ZZZZZZZ. Die Schlage hat dich!" );
        end = true;
        return;
      }
      if ( playerPosition.equals( goldPosition ) )
      {
        rich = true;
        goldPosition.setLocation( -1, -1 );
      }
    }

    @Override public void keyReleased( KeyEvent e )
    {
      if ( end )
        return;

      // Tasteneingabe und Spielerposition verändern
    
      switch ( e.getKeyCode() )
      {
        case KeyEvent.VK_UP:
          playerPosition.y = Math.max( 0, playerPosition.y - 1 );
          break;
        case KeyEvent.VK_DOWN:
          playerPosition.y = Math.min( HEIGHT-1, playerPosition.y + 1 );
          break;
        case KeyEvent.VK_LEFT:
          playerPosition.x = Math.max( 0, playerPosition.x - 1 );
          break;
        case KeyEvent.VK_RIGHT:
          playerPosition.x = Math.min( WIDTH-1, playerPosition.x + 1 );
          break;
      }
  
      // Schlange bewegt sich Richtung Spieler
  
      Point snakeHead = new Point( snakePositions[snakeIdx].x,
                                   snakePositions[snakeIdx].y );
  
      if ( playerPosition.x < snakeHead.x )
        snakeHead.x--;
      else if ( playerPosition.x > snakeHead.x )
        snakeHead.x++;
      if ( playerPosition.y < snakeHead.y )
        snakeHead.y--;
      else if ( playerPosition.y > snakeHead.y )
        snakeHead.y++;
  
      snakeIdx = (snakeIdx + 1) % snakePositions.length;
      snakePositions[snakeIdx] = snakeHead;

      repaint();
    }

    @Override public void keyTyped( KeyEvent e ) { /* Empty */ }
    @Override public void keyPressed( KeyEvent e ) { /* Empty */ }
  }

  public static void main( String[] args )
  {
    JFrame f = new JFrame( "ZZZZZnake" );
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.add( new ZZZZZnakePanel() );
    f.pack();
    f.setVisible( true );
  }
}