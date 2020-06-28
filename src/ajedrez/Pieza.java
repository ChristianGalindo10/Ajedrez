
import java.util.*;

/**
 * 
 */
public abstract class Pieza implements Movimiento {

    /**
     * Default constructor
     */
    public Pieza() {
    }

    /**
     * 
     */
    private String color;


    /**
     * 
     */
    public abstract void validarMov();

    /**
     * 
     */
    public abstract void posibleMov();

    /**
     * 
     */
    public void mover() {
        // TODO implement here
    }

}