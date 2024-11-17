public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra(String texto) throws Exception
    {
        if (texto == null || texto.trim().isEmpty())
            throw new Exception("Texto inválido");
        this.texto = texto.toUpperCase();
    }

    public int getQuantidade(char letra)
    {
        int contador = 0;
        for (int i = 0; i < this.texto.length(); i++) {
            if (this.texto.charAt(i) == letra)
                contador++;
        }
        return contador;
    }

    public int getPosicaoDaIezimaOcorrencia(int i, char letra) throws Exception
    {
        int contador = 0;
        for (int j = 0; j < this.texto.length(); j++) {
            if (this.texto.charAt(j) == letra) {
                if (contador == i)
                    return j;
                contador++;
            }
        }
        throw new Exception("Ocorrência não encontrada");
    }

    public int getTamanho()
    {
        return this.texto.length();
    }

    @Override
    public String toString()
    {
        return this.texto;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Palavra outra = (Palavra) obj;
        if(this.texto == outra.texto){return true;}
        return false;
    }

    @Override
    public int hashCode()
    {
        int ret = 666;
        ret = ret*13 + this.texto.hashCode();
        if (ret < 0)ret = -ret;
        return ret;
    }

    public int compareTo(Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}
