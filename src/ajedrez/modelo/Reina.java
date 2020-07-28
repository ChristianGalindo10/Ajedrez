/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez.modelo;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Christian Galindo
 */
public class Reina extends Ficha{

    public Reina(String color, Point posicion) {
        super(color, posicion);
        this.cargarAnimacion("animacionReina.gif");
    }

    @Override
    public ArrayList<Point> posiblesMovimientos() {
        ArrayList<Point> pm = new ArrayList<Point>();
        int x=0,y=0;
        x=this.getPosicion().x;
        y=this.getPosicion().y;
        while(x<7){
            pm.add(new Point(x+1,y));
            x++;
        }
        x=this.getPosicion().x;
        y=this.getPosicion().y;
        while(x>0){
            pm.add(new Point(x-1,y));
            x--;
        }
        x=this.getPosicion().x;
        y=this.getPosicion().y;
        while(y<7){
            pm.add(new Point(x,y+1));
            y++;
        }
        x=this.getPosicion().x;
        y=this.getPosicion().y;
        while(y>0){
            pm.add(new Point(x,y-1));
            y--;
        }
        x=this.getPosicion().x;
        y=this.getPosicion().y;
        while (x < 7 && y < 7) {
            pm.add(new Point(x+1, y+1));
            x++;
            y++;
        }
        x = this.getPosicion().x;
        y = this.getPosicion().y;
        while (x < 7 && y > 1) {
            pm.add(new Point(x+1, y-1));
            x++;
            y--;
        }
        x = this.getPosicion().x;
        y = this.getPosicion().y;
        while (x > 0 && y < 7) {
            pm.add(new Point(x-1, y+1));
            x--;
            y++;
        }
        x = this.getPosicion().x;
        y = this.getPosicion().y;
        while (x > 0 && y > 1) {
            pm.add(new Point(x-1, y-1));
            x--;
            y--;
        }
        return pm;
    }
    
}
