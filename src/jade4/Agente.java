package jade4;

import jade.core.Agent;

public class Agente extends Agent{
    
    private String posicion;
    private boolean sucioIzquierda;
    private boolean sucioDerecha;
    private Formulario formulario;
    
    public void setup(){
        this.formulario = new Formulario(this);
        this.formulario.setVisible(true);
        this.formulario.setResizable(false);
        this.formulario.setLocationRelativeTo(null);
    }
    
    public void algo(){
        Comportamiento c = new Comportamiento();
        String cadena;
        
        System.out.print(   "\n________________________________________"
                +           "\nPosicion\tIzquierda\tDerecha");
        
        if (this.posicion.equals("Derecha")) {
            cadena = "\n" + this.posicion + "  ";
        } else {
            cadena = "\n" + this.posicion;
        }
        
        if (this.sucioIzquierda == true) {
            cadena = cadena + "\tSi";
        } else {
            cadena = cadena + "\tNo";
        }
        
        if (this.sucioDerecha == true) {
            cadena = cadena + "\t\tSi";
        } else {
            cadena = cadena + "\t\tNo";
        }
        
        System.out.print(cadena);
        
        while(this.sucioDerecha == true || this.sucioIzquierda == true){
            
            c.setPosicion(this.posicion);
            if (this.posicion.equals("Derecha")) {
                c.setSucio(this.sucioDerecha);
            } else {
                c.setSucio(this.sucioIzquierda);
            }
            
            String pa = this.posicion;
            
            c.action();
            
            this.posicion = c.getPosicion();
            if (pa.equals("Derecha")) {
                this.sucioDerecha = c.isSucio();
            } else {
                this.sucioIzquierda = c.isSucio();
            }
            
            
            if (this.posicion.equals("Derecha")) {
                cadena = "\n" + this.posicion + "  ";
            } else {
                cadena = "\n" + this.posicion;
            }
        
        if (this.sucioIzquierda == true) {
            cadena = cadena + "\tSi";
        } else {
            cadena = cadena + "\tNo";
        }
        
        if (this.sucioDerecha == true) {
            cadena = cadena + "\t\tSi";
        } else {
            cadena = cadena + "\t\tNo";
        }
        System.out.print(cadena);
            
            
        }
    }
    
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    public void setSucioIzquierda(boolean sucioIzquierda) {
        this.sucioIzquierda = sucioIzquierda;
    }
    
    public void setSucioDerecha(boolean sucioDerecha) {
        this.sucioDerecha = sucioDerecha;
    }
}
