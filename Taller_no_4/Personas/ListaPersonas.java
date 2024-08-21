
package Taller_no_4.Personas;

import java.util.Vector;

public class ListaPersonas {
    
    Vector listaPersonas; 
    
    public ListaPersonas() {
        listaPersonas = new Vector(); 
    }

    public void añadirPersona(Persona p) {
        listaPersonas.add(p);
    }

    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i);
    }

    public void borrarLista() {
        listaPersonas.removeAllElements();
    }

}