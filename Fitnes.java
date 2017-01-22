/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosgeneticos;

import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.jgap.FitnessFunction;
import org.jgap.IChromosome;

/**
 *
 * @author USRDES
 */
class Fitnes extends FitnessFunction {

    public ArrayList<Gen> lista = new ArrayList<>();

    public Fitnes(ArrayList<Gen> lista) {
       this.lista=lista;
    }

    @Override // este metodo evalua si es apto o no, si lo es, lo mantiene apto para la siguiente evolucion
    protected double evaluate(IChromosome ic) {  //double=que no hay numeros negativos
        double valorEvaluar = 0; //valor a devolver
        //obtener valor del cromosoma
    
        Integer c1= (Integer) ic.getGene(0).getAllele(); // obtener cada uno de los bit del cromosoma
        Integer c2= (Integer) ic.getGene(1).getAllele();
        Integer c3= (Integer) ic.getGene(2).getAllele();
        Integer c4= (Integer) ic.getGene(3).getAllele();
        Integer c5= (Integer) ic.getGene(4).getAllele();
        Integer c6= (Integer) ic.getGene(5).getAllele();
        Integer c7= (Integer) ic.getGene(6).getAllele(); 
        Integer c8= (Integer) ic.getGene(7).getAllele();
        Integer c9= (Integer) ic.getGene(8).getAllele();
        Integer c10= (Integer) ic.getGene(9).getAllele(); // obtener cada uno de los bit del cromosoma
        Integer c11= (Integer) ic.getGene(10).getAllele();
        Integer c12= (Integer) ic.getGene(11).getAllele();
        Integer c13= (Integer) ic.getGene(12).getAllele();
        Integer c14= (Integer) ic.getGene(13).getAllele();
        Integer c15= (Integer) ic.getGene(14).getAllele();
        Integer c16= (Integer) ic.getGene(15).getAllele(); 
        Integer c17= (Integer) ic.getGene(16).getAllele(); 
        Integer c18= (Integer) ic.getGene(17).getAllele();
      
        String valorx= c1+""+c2+""+c3+""+c4+""+c5+""+c6+""+c7+""+c8;//valor binario
        int valor_intx = Integer.parseInt(valorx,2);//valor decimal
        if (c9!=0)//0=positivo 1=negatiivo
            valor_intx=valor_intx*-1;
        
        String valory= c10+""+c11+""+c12+""+c13+""+c14+""+c15+""+c16+""+c17;//valor binario
        int valor_inty = Integer.parseInt(valory,2);//valor decimal
        if (c18!=0)//0=positivo 1=negatiivo
            valor_inty=valor_inty*-1;

        //valor el fitness
         valorEvaluar=(valor_intx*valor_intx*5)+(valor_inty*valor_inty*5);
         if (valorEvaluar<=5)
         {
             //es el tiempo 250
             Gen a=new Gen(valor_intx,valor_inty,valorEvaluar);
             if(lista.size()<=5){                
             lista.add(a);
 
            
            
            
            
             }
             else{
                 int intern = 0;
             Iterator<Gen> nombreIterator =lista.iterator();
                        while(nombreIterator.hasNext()){
                                            Gen elemento = nombreIterator.next(); 
                                                  System.out.println("cross_ind:"+elemento.getX()+" = "+elemento.getY()+" =x^2 "+elemento.getResultado());
                                            if(elemento.getResultado()>a.getResultado())   
                                                intern=lista.indexOf(elemento);
                        }
                  
                        System.out.println("");
                        lista.remove(intern);
                        lista.add(a);
             }
             valorEvaluar=250;
         }
         else
         {
             valorEvaluar=1;
         }
     
         return valorEvaluar;
    }

    public ArrayList<Gen> getLista() {
        return lista;
    }
    
}
