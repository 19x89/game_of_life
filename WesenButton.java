package game_of_life;

import java.awt.*;
import java.awt.event.*;

/*
Diese Klasse bietet die Funktionalität für die Steuerung jede einzelne Zelle.
*/

class WesenButton extends Button implements ActionListener {
    private Welt welt;
    private int lPos;
    private int bPos;
    
    WesenButton( Welt welt, int lPos, int bPos ) {
        this.welt = welt;
        this.lPos = lPos;
        this.bPos = bPos;
        setBackground( Color.blue );
        addActionListener( this );
    }
    
    public void aktualisieren() {
        Wesen wesen = welt.getWesen( lPos,  bPos );
        if( wesen instanceof Lebewesen ) {
            setBackground( Color.yellow );
        } else {
            setBackground( Color.blue );
        }
    }
    
    @Override
    public void actionPerformed( ActionEvent e ) {
        welt.getWesen( lPos,  bPos ).interrupt();
    }
}
