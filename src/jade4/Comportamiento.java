package jade4;

import jade.core.behaviours.Behaviour;

public class Comportamiento extends Behaviour{
    
    private String posicion;
    private boolean sucio;
    
    public Comportamiento(){
        
    }
    
    public Comportamiento(String p, boolean s){
        this.posicion = p;
        this.sucio = s;
    }

    @Override
    public void action() {
        
        if (this.posicion.equals("Izquierda")) {
            if (this.sucio == true) {
                this.sucio = false;
            } else {
                this.posicion = "Derecha";
            }
        } else {
            if (this.sucio == true) {
                this.sucio = false;
            } else {
                this.posicion = "Izquierda";
            }
        }
        
    }

    @Override
    public boolean done() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isSucio() {
        return sucio;
    }

    public void setSucio(boolean sucio) {
        this.sucio = sucio;
    }
    
    
    
}
