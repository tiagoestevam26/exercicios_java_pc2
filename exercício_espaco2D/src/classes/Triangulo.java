package classes;

public class Triangulo extends Forma{

    public Triangulo(Ponto2D[] pontos) {
        super(pontos);
    } 

    public double calculaArea(){
        double distancia1 = pontos[0].calculaDistancia(pontos[1]);
        double distancia2 = pontos[1].calculaDistancia(pontos[2]);
        double distancia3 = pontos[2].calculaDistancia(pontos[0]);
        double sp = (distancia1+distancia2+distancia3)/2;
        double area = Math.sqrt(sp*(sp-distancia1)*(sp-distancia2)*(sp-distancia3));
        return area;
    }
    public double calculaPerimetro(){
        double distancia1 = pontos[0].calculaDistancia(pontos[1]);
        double distancia2 = pontos[1].calculaDistancia(pontos[2]);
        double distancia3 = pontos[2].calculaDistancia(pontos[0]);
        double perimetro = distancia1+distancia2+distancia3;
        return perimetro;
    }

    public String tipoTriangulo(){
        String tipo;
        tipo = null;
        double distancia1 = pontos[0].calculaDistancia(pontos[1]);
        double distancia2 = pontos[1].calculaDistancia(pontos[2]);
        double distancia3 = pontos[2].calculaDistancia(pontos[0]);
        if(distancia1 == distancia2 && distancia2 == distancia3){
            tipo = "Equilatero";
        }
        if((distancia1 == distancia2 && distancia2 != distancia3) || (distancia2 == distancia3 && distancia3 != distancia1) || (distancia3 == distancia1 && distancia2 != distancia1)){
            tipo = "Isoceles";
        }
        if(distancia1 != distancia2 && distancia2 != distancia3 && distancia3 != distancia1){
            tipo = "Escaleno";
        }
        return tipo;
    }
    
}