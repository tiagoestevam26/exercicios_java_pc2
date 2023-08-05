package classes;

public class Circulo extends Forma{
    
    public Circulo(Ponto2D[] pontos){
        super(pontos);
    }
 
    public double calculaArea(){
        double raio = pontos[0].calculaDistancia(pontos[1]);
        double area = Math.PI*Math.pow(raio, 2);
        return area;
    }
    public double calculaPerimetro(){
        double raio = pontos[0].calculaDistancia(pontos[1]);
        double perimetro = 2*Math.PI*raio;
        return perimetro;
    }

}