public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
        if (qtdMax <= 0) throw new Exception ("Quantidade invalida");
        this.qtdMax = qtdMax;
    }

    public void registreUmErro () throws Exception
    {
        if (this.qtdErr == this.qtdMax) throw new Exception ("Erro maximo atingido");
        this.qtdErr++;
    }

    public boolean isAtingidoMaximoDeErros ()
    {
        return this.qtdErr == this.qtdMax;
    }

    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }

    public boolean equals (Object obj)
    {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        ControladorDeErros outro = (ControladorDeErros) obj;
        return this.qtdMax == outro.qtdMax && this.qtdErr == outro.qtdErr;
    }

    public int hashCode ()
    {
        return Integer.hashCode(this.qtdMax) + Integer.hashCode(this.qtdErr);
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception
    {
        if (c == null) throw new Exception ("Objeto nulo");
        this.qtdMax = c.qtdMax;
        this.qtdErr = c.qtdErr;
    }

    public Object clone ()
    {
        try {
            return new ControladorDeErros(this);
        } catch (Exception e) {
            return null;
        }
    }
}
