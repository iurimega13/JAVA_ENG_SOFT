// Exemplo de classe em Java, objeto: pessoa

public class pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;
    private String cpf;
    private String rg;

    
    /** 
     * @param nome
     */
    // Setters e Getters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return this.sexo;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }

    public void setRg(String rg){
        this.rg = rg;
    }
    public String getRg(){
        return this.rg;
    }
}
