public class Tracinhos implements Cloneable
{
    private char texto[];

    public Tracinhos(int qtd) throws Exception
    {
        if (qtd <= 0)
            throw new Exception("Quantidade inválida");
        this.texto = new char[qtd];
        for (int i = 0; i < qtd; i++)
            this.texto[i] = '_';
    }

    public void revele(int posicao, char letra) throws Exception
    {
        if (posicao < 0 || posicao >= this.texto.length)
            throw new Exception("Posição inválida");
        this.texto[posicao] = letra;
    }

    public boolean isAindaComTracinhos()
    {
        for (char c : this.texto) {
            if (c == '_')
                return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.texto.length; i++) {
            if (i > 0) sb.append(' ');
            sb.append(this.texto[i]);
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Tracinhos outro = (Tracinhos) obj;
        if(this.texto.length != outro.texto.length)return false;
        for(int i = 0; i<this.texto.length;i++){
            if(this.texto[i] != outro.texto[i])return false;
        }
        return true;
    }

    @Override
    public int hashCode()
    {
        int ret = 666;
        for(int i = 0; i<this.texto.length;i++){
            ret = ret*13+((Character)this.texto[i]).hashCode();
        }
        if(ret < 0)ret = -ret;
        return ret;
    }

    public Tracinhos(Tracinhos t) throws Exception
    {
        if (t == null)
            throw new Exception("Objeto nulo");
        this.texto = new char[t.texto.length];
        System.arraycopy(t.texto, 0, this.texto, 0, t.texto.length);
    }

    @Override
    public Object clone()
    {
        try {
            return new Tracinhos(this);
        } catch (Exception e) {
            return null;
        }
    }
}
