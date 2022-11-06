package classes_e_metodos;

public class DataTeste {

    public static void main(String[] args) {
        
        Data d1 = new Data();
        d1.ano = 2000;
        
        var d2 = new Data(31,12,2022);
       
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }


}