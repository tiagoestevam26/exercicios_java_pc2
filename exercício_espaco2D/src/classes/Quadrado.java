package classes;

public class Quadrado extends Forma{
    
    public Quadrado(Ponto2D[] pontos) {
        super(pontos);
    } 

    public double calculaArea(){
        double distancia = pontos[0].calculaDistancia(pontos[1]);
        double area = Math.pow(distancia, 2);
        return area;        
    }
    public double calculaPerimetro(){
        double distancia = pontos[0].calculaDistancia(pontos[1]);
        double perimetro = distancia*4;
        return perimetro;
    }

}