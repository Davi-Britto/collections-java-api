package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        if(!palavrasSet.isEmpty()){
            for(String p : palavrasSet){
                if(p.equalsIgnoreCase(palavra)){
                    palavraParaRemover = p;
                    break;
                }
            }
            palavrasSet.remove(palavraParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }

    }

    public boolean verificarPalavra(String palavra) {
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasSet.isEmpty()) {
            System.out.println(palavrasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    @Override
    public String toString() {
        return "ConjuntoPalabrasUnicas{" +
                "palavrasSet=" + palavrasSet +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}

