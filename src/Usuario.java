import java.util.Date;

public class Usuario {
    
    private String nome;
    private String email; 
    private Date dataDeNacimento; 
    private Endereco endereco;
    private int quantidadeDeEmprestimo;

    public Usuario(String nome, String email, Date dataDeNacimento, Endereco endereco, int quantidadeDeEmprestimo) {
        this.nome = nome;
        this.email = email;
        this.dataDeNacimento = dataDeNacimento;
        this.endereco = endereco;
        this.quantidadeDeEmprestimo = quantidadeDeEmprestimo;
    }

    public pegar(String livro){
        if(this.quantidadeDeEmprestimo==0){
            
        }
    }

    public void devolver(){

    }

}
