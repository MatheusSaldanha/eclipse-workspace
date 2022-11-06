package arrays.classes;

public class Usuario {
    String nome, email;
    
    
    public boolean equals(Object objeto) {
        
        if(objeto instanceof Usuario){

            Usuario outros =  (Usuario) objeto;
    
            boolean nomeIgual = outros.nome.equals(this.nome);
            boolean emailIgual = outros.email.equals(this.email);
    
            return nomeIgual && emailIgual;
        }else{
            return false;
        }
    }
}
