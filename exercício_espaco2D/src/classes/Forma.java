package classes;


public abstract class Forma {
    public Ponto2D[] pontos;


    public Forma(Ponto2D[] pontos){
        this.pontos = pontos;
    }

    public abstract double calculaArea();
    public abstract double calculaPerimetro();

    public static Forma geraForma(Ponto2D[] pontos){
        Forma forma;
        forma = null;
        int contador=pontos.length;
        if(contador == 2){
            double distancia;
            distancia = pontos[0].calculaDistancia(pontos[1]);
            if(distancia>0){
                forma = new Circulo(pontos);
            }else{
                System.out.println("ERRO: Nao eh um circulo!!!!!");
            }
        }
        if(contador==3){
            int cont=0;
            double distancia1, distancia2, distancia3, soma;
            distancia1 = pontos[0].calculaDistancia(pontos[1]);
            distancia2 = pontos[1].calculaDistancia(pontos[2]);
            distancia3 = pontos[2].calculaDistancia(pontos[0]);
            if(distancia1 == 0 || distancia2 == 0 || distancia3 == 0){
                System.out.println("ERRO: Nao eh um triangulo!!!!!");
            }else{
                soma = distancia1 + distancia2;
                if(soma>distancia3){
                    cont++;
                }
                soma = distancia1 + distancia3;
                if(soma>distancia2){
                    cont++;
                }
                soma = distancia2 + distancia3;
                if(soma>distancia1){
                    cont++;
                }
                if(cont==3){
                    forma = new Triangulo(pontos);
                }else{
                    System.out.println("ERRO: Nao eh um triangulo!!!!!");
                }
            }

        }
        if(contador==4){
            double dist1, dist2, dist3, dist4;
            dist1 = pontos[0].calculaDistancia(pontos[1]);
            dist2 = pontos[1].calculaDistancia(pontos[2]);
            dist3 = pontos[2].calculaDistancia(pontos[3]);
            dist4 = pontos[3].calculaDistancia(pontos[0]);
            if (dist1 == dist2 && dist2 == dist3 && dist3 == dist4){
                forma = new Quadrado(pontos);
            } else{
                System.out.println("ERRO: Nao eh um quadrado!!!!!");
            }





        }
        return forma;
    }
}