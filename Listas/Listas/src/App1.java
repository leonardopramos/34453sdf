public class App1 {
    
    public static void main(String[] args) {
        
        ListaSimplesmenteEncadeada ls1 = new ListaSimplesmenteEncadeada();

        ls1.adicionar(12);
        ls1.adicionar(64);
        ls1.adicionar(34);
        ls1.adicionar(0, 324);
        System.out.println(ls1);
        ls1.adicionar(0, 43986);
        System.out.println(ls1);

        //System.out.println(ls1.retornarPosicao(34));
    }
}
