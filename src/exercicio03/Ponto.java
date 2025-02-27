package exercicio03;

public class Ponto {
    int x;
    int y;

    public double calculaDistancia(Ponto p){
        double d;
        d = Math.sqrt(Math.pow(x-p.x,2) + Math.pow(y-p.y,2));
        return d;
    }

    public double calculaDistOrigem(){
        double dOrigem;
        //dOrigem = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        Ponto origem = new Ponto();//x e y já são inicializados com 0 pelo construtor
        dOrigem = calculaDistancia(origem);
        return dOrigem;
    }

    public String FormataPonto(){
        return "("+x+","+y+")";
    }

    public Ponto calculaPontoProx(Ponto p1, Ponto p2){
        double distP1 = p1.calculaDistOrigem();
        double distP2 = p2.calculaDistOrigem();
        if (distP1 < distP2){
            return p1;
        }
        return p2;
    }



}
