/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosgeneticos;

import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.Iterator;
import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.InvalidConfigurationException;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;

/**
 *
 * @author USRDES
 */
class CrearGenotipo {
    // se necesita una lista para que en esta se ubique los 5 mejores individuos
    //crear constructor de la lista
          public ArrayList<Gen> lista = new ArrayList<>();
    //metodo para crear genotipo
    public Genotype create(int poblacionincial) throws InvalidConfigurationException{//cuantos individuos voy a iniciar
        //configuracion inicial ALEATORIO
        Configuration configuracion = new DefaultConfiguration();
        //funcion de actitud o fitness
        configuracion.setPreservFittestIndividual(true);//si lo encuentra al individuo que se detenga
        //fitness = clase en java extends fitness
        Fitnes fitness= new Fitnes(lista);//psar la lista al fitness
        
        configuracion.setFitnessFunction(fitness);
        Gene[] genes=new Gene[18];//cuantos genes tiene el cromosoma 
        for(int i=0;i<18;i++)
        genes[i]=new IntegerGene(configuracion, 0,1);
        //cromosoma 
        Chromosome cromosama= new Chromosome(configuracion, genes);//combinacion de los genes y configuracion
        //cromosama se da el ejemplo del individuo deseado
        configuracion.setSampleChromosome(cromosama);
        //inicializado la poblacion
        configuracion.setPopulationSize(poblacionincial);
        Genotype population=Genotype.randomInitialGenotype(configuracion);//dar de manera aleatoria los genes [0101010] y guardalo en el genotipo
              return population;
        
    }
    public void solucion(Genotype population){
         ArrayList<IChromosome > crom = new ArrayList<>();
   
      
    }
    
}
