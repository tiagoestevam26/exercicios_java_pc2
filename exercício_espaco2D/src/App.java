import classes.Forma;
import classes.Ponto2D;

public class App {
    public static void main(String[] args){

        Ponto2D[] pontos = new Ponto2D[2];
        Ponto2D ponto1 = new Ponto2D(0, 0);
        Ponto2D ponto2 = new Ponto2D(0, 3);
        pontos[0] = ponto1;
        pontos[1] = ponto2;
        Forma forma = Forma.geraForma(pontos);
        // se nao for circulo nao sei aaaaaaaaa
        double area = forma.calculaArea();
        double perimetro = forma.calculaPerimetro();
        System.out.println("A forma 1 tem area "+ area +" e perimetro "+ perimetro);

        Ponto2D[] pontos2 = new Ponto2D[3];
        Ponto2D ponto3 = new Ponto2D(0, 0);
        Ponto2D ponto4 = new Ponto2D(0, 3);
        Ponto2D ponto5 = new Ponto2D(2, 3);
        pontos2[0] = ponto3;
        pontos2[1] = ponto4;
        pontos2[2] = ponto5;
        Forma forma2 = Forma.geraForma(pontos2);
        double area2 = forma2.calculaArea();
        double perimetro2 = forma2.calculaPerimetro();
        // nao sei saber o tipo do triangulo
        System.out.println("A forma 2 tem area "+ area2 +" e perimetro "+ perimetro2);

        Ponto2D[] pontos3 = new Ponto2D[4];
        Ponto2D ponto6 = new Ponto2D(0, 0);
        Ponto2D ponto7 = new Ponto2D(0, 3);
        Ponto2D ponto8 = new Ponto2D(3, 3);
        Ponto2D ponto9 = new Ponto2D(3, 0);
        pontos3[0] = ponto6;
        pontos3[1] = ponto7;
        pontos3[2] = ponto8;
        pontos3[3] = ponto9;     
        Forma forma3 = Forma.geraForma(pontos3);
        double area3 = forma3.calculaArea();
        double perimetro3 = forma3.calculaPerimetro();
        System.out.println("A forma 3 tem area "+ area3 +" e perimetro "+ perimetro3);

    } 
}
