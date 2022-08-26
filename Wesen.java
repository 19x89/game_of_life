package game_of_life;

import java.util.Random;

abstract class Wesen extends Thread {
    private static Random random = new Random();
    protected Welt welt;
    protected int lPos;   // Längengrad
    protected int bPos;   // Breitengrad
    
    Wesen( Welt welt, int lPos, int bPos ) {
        this.welt = welt;
        this.lPos = lPos;
        this.bPos = bPos;
    }
    
    @Override
    public void run() {
        do {
            try {
                sleep( random.nextInt( 5000 ) );
            } catch( InterruptedException ie ) {
                Thread.currentThread().interrupt();
            }
        } while( !istHandelnNoetig() && !interrupted() );
        handeln();
    }
    
    protected abstract boolean istHandelnNoetig();
    
    protected abstract void handeln();
}
