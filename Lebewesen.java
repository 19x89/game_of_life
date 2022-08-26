package game_of_life;

class Lebewesen extends Wesen {
    Lebewesen( Welt welt, int lPos, int bPos ) {
        super( welt, lPos, bPos );
    }
    
    @Override
    protected boolean istHandelnNoetig() {
        int i = welt.anzahlNachbarn( lPos, bPos );
        return ( i < 2 ) || ( 3 < i );
    }

    @Override
    protected void handeln() {
        Wesen w = new Leerwesen( welt, lPos, bPos );
        welt.setWesen( lPos, bPos, w );
        w.start();
    }
}
