package com.cice.ejercicio1;

/**
 * Clase Circulo definirá las operaciones sobre un círculo.
 * Calculo del area 
 * Calculo del perimetro
 */
public class Circulo {
    
    //Local variables
    double area = 0;
    double perimetro = 0;
  
    
    //Constructor   
    public Circulo (){
        
    }
    
    
    //Getters y Setters
    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
      
    
    //AREA DE UN CIRCULO
    //A = π r²
    public void areaCirculo(int radio) {
        area = Math.PI * radio * radio;
        setArea(area);
    }
    
    
    //PERIMETRO DE UN CIRCULO
    //A = 2 π r
    public void perimetroCirculo (int radio){
        perimetro = 2 * Math.PI * radio;
        setPerimetro(perimetro);
    }

}
