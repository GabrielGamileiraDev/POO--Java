public class Caneta {
    //criação da classe
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //este metodo mostra os valores que eu atribuí nos atributos da classe
    void status(){
        System.out.println("O modelo desta caneta é: " + this.modelo);
        System.out.println("Esta caneta é da cor " + this.cor);
        System.out.println("A caneta está tampada? " + this.tampada);
        System.out.println("A ponta da caneta é: " + this.ponta);
        System.out.println("A carga desta caneta é: " + this.carga);
    }

    //este verifica se a caneta está tampada
    void rabiscar() {
        if (this.tampada == true){
            System.out.println("Impossível escrever com a caneta tampada.");
        } else{
            System.out.println("Escreva com todo prazer! ");
        }
    }

    //este metodo tampa a caneta
    void tampar() {
            this.tampada = true;
        }

    //este outro metodo destampa a caneta
    void destampar() {
            this.tampada = false;
        }

}
