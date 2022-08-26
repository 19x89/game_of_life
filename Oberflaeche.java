package game_of_life;

import java.awt.*;

public class Oberflaeche extends BaseFrame {
    Welt welt;
    Panel p;
    
    Oberflaeche( Welt welt ) {
        this.welt = welt;
        p = new Panel();
        p.setLayout( new GridLayout( welt.MXG, welt.MXG ) );
        for( int lPos = 0; lPos < welt.MXG; lPos++ ) {
            for( int bPos = 0; bPos < welt.MXG; bPos++ ) {
                p.add( new WesenButton( welt, lPos, bPos ) );
            }
        }
        add( p );
        setVisible( true );
    }
    
    void aktualisieren( int lPos, int bPos ) {
        WesenButton wesenButton = (WesenButton) p.getComponent( lPos * welt.MXG + bPos );
        wesenButton.aktualisieren();
        repaint();
    }
}
