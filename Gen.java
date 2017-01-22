/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosgeneticos;

/**
 *
 * @author Administrador
 */
public class Gen {
    public Integer x;
    public Integer y;
    public double resultado;

    public Gen(Integer x, Integer y, double resultado) {
        this.x = x;
        this.y = y;
        this.resultado = resultado;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }
    
    
}
