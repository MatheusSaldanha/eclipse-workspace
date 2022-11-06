package classes_e_metodos;

public class Data {
    int dia;
    int mes;
    int ano;
    
    Data(){
    	dia = 01;
    	mes = 01;
    	ano = 1970;
    	
    }
    
    Data(int Dia, int Mes, int Ano){
    	dia = Dia;
    	mes = Mes;
    	ano = Ano; 
    	
    }
    String obterDataFormatada(){
        return String.format("%d/%d/%d\n", dia, mes, ano);    
    }

}