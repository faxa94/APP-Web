/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosgeneticos;

import org.jgap.Genotype;
import org.jgap.InvalidConfigurationException;

/**
 *
 * @author USRDES
 */
public class AlgoritmosGeneticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InvalidConfigurationException {
        int numeroMaximoEvolucion=50;//a mayor cantidad de bits el numero de las Y se tiene
        //genotipo = [00000000] un 0 representa un gen
        CrearGenotipo a = new CrearGenotipo();//pasar como parametro la lista
        Genotype population= a.create(numeroMaximoEvolucion);
        //evolucionar
        population.evolve();
        for (int i=0; i<numeroMaximoEvolucion; i++){
            population.evolve();
        
             
        //imprimir individuos de la solucion
        }
          a.solucion(population);
        //mostrar el mejor individuo
        
    }
    
}
