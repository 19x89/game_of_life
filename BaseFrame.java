package game_of_life;

import java.awt.*;
import java.awt.event.*;

public class BaseFrame extends Frame {
    public BaseFrame() {
        addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing( WindowEvent e ) {
                System.exit( 0 );
            }
        });
        
        setSize( 300, 400 );
        setLocationRelativeTo( null );
    }
}
