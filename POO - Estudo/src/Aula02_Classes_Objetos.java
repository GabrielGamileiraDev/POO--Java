public class Aula02_Classes_Objetos {

    //criando uma instância da classe "Caneta"
    public static void main(String[] args) {
        Caneta c1= new Caneta();
        c1.cor = "Azul";
        c1.modelo = "BIC";
        c1.ponta = 0.7f;
        c1.carga = 90;
        c1.tampar();
        c1.status();
        c1.rabiscar();

    }

}
