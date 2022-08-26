package game_of_life;

class Leerwesen extends Wesen {
    Leerwesen( Welt welt, int lPos, int bPos ) {
        super( welt, lPos, bPos );
    }
    
    @Override
    protected boolean istHandelnNoetig() {
        return welt.anzahlNachbarn( lPos, bPos ) == 3;
    }

    @Override
    protected void handeln() {
        Wesen w = new Lebewesen( welt, lPos, bPos );
        welt.setWesen( lPos, bPos, w );
        w.start();
    }
}
