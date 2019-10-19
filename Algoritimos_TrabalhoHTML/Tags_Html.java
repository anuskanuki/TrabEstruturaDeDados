package Algoritimos_TrabalhoHTML;

public class Tags_Html {

    private String nomeTag;
    private int quantidadeTag;

    public Tags_Html(String nomeTag, int quantidadeTag) {
        setNomeTag(nomeTag);
        setQuantidadeTag(quantidadeTag);
    }

    public String getNomeTag() {
        return nomeTag;
    }

    public void setNomeTag(String nomeTag) {
        if (nomeTag == null) {
            throw new IllegalArgumentException("Nome de tag inválido");
        }
        this.nomeTag = nomeTag;
    }

    public int getQuantidadeTag() {
        return quantidadeTag;
    }

    public void setQuantidadeTag(int quantidadeTag) {
        if (quantidadeTag < 0) {
            throw new IllegalArgumentException("Quantidade de tag inválida");
        }
        this.quantidadeTag = quantidadeTag;
    }

}
