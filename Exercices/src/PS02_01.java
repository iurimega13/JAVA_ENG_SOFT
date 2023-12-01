
/*Um desenvolvedor iniciou a criação de um programa em Java para controlar a quantidade de combustível de um posto de gasolina. O posto possui diversos tipos de combustíveis que precisam ser tratados de forma independente. A seguir veja o código que já foi criado da classe principal do programa:
 * Entretanto o desenvolvedor teve um problema em seu computador e não deu tempo de salvar o código no Git e, por conta disso, precisa ser implementada a classe Combustível novamente.
 * 
 */
package atv1prsisii; 

    /*Desenvolva o código da classe Combustível de forma encapsulada em que todos os atributos sejam privados e os valores sejam manipulados e acessados apenas pelos métodos reporEstoque, abastecerVeiculo, mostrarEstoque.
 
Fique atento às seguintes regras:

- O estoque não pode ser reposto com valores negativos, neste caso o método deve retornar 0.
- O estoque não pode ser reposto além do limite do estoque que foi definido no construtor da classe. Nesse caso, o método deve retornar o valor que deu para repor, exemplo: tinha-se 10 litros disponíveis, entraram 100, retorne 10 que é o valor disponível, claro, atualizando a quantidade do estoque.
- O abastecimento deve reduzir a quantidade de estoque, deve ser verificado também se há quantidade disponível; caso não haja, deverá retornar apenas a quantidade disponível, diminuindo a quantidade do estoque.
- Não deve aceitar valores negativos para abastecimento; caso isso ocorra, deve retornar o valor 0 do método.
- Mostrar estoque: apenas mostrar a quantidade atual do estoque do objeto.
     */

public class Combustivel {
    private String nome;
    private int estoque;
    private int limiteEstoque;

    public Combustivel(String nome, int limiteEstoque) {
        this.nome = nome;
        this.limiteEstoque = limiteEstoque;
    }

    
    /** 
     * @param quantidade
     * @return int
     */
    public int reporEstoque(int quantidade) {
        if (quantidade < 0) {
            return 0;
        }
        if (quantidade > limiteEstoque) {
            estoque = limiteEstoque;
            return estoque;
        }
        estoque += quantidade;
        return estoque;
    }

    public int abastecerVeiculo(int quantidade) {
        if (quantidade < 0) {
            return 0;
        }
        if (quantidade > estoque) {
            int qtdRealmenteAbastecido = estoque;
            estoque = 0;
            return qtdRealmenteAbastecido;
        }
        estoque -= quantidade;
        return quantidade;
    }

    public int mostrarEstoque() {
        return estoque;
    }
}
}

public class Atv1PrSisII {
    public static void main(String[] args) {
        int limiteEstoque = 10000;
        combustivel gasolina = new combustivel("Gasolina", limiteEstoque);
        int quantidadeAposReposicao = gasolina.reporEstoque(1000);
        System.out.println("Qtd Após Reposição: " + quantidadeAposReposicao);
        int qtdRealmenteAbastecido1 = gasolina.abastecerVeiculo(51);
        System.out.println("Qtd Abastecido 1 " + qtdRealmenteAbastecido1);
        int qtdRealmenteAbastecido2 = gasolina.abastecerVeiculo(10);
        System.out.println("Qtd Abastecido 2 " + qtdRealmenteAbastecido2);
        System.out.println("Estoque de Gasolina" + gasolina.mostrarEstoque());

    }
    

