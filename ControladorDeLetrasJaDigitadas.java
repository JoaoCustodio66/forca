public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        this.letrasJaDigitadas = "";
    }

    public boolean isJaDigitada (char letra)
    {
        return this.letrasJaDigitadas.indexOf(letra) != -1;
    }

    public void registre (char letra) throws Exception
    {
        if (isJaDigitada(letra))
            throw new Exception("Letra já digitada!");
        this.letrasJaDigitadas += letra;
    }

    @Override
    public String toString ()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.letrasJaDigitadas.length(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(this.letrasJaDigitadas.charAt(i));
        }
        return sb.toString();
    }

    @Override
    public boolean equals (Object obj)
    {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        ControladorDeLetrasJaDigitadas outro = (ControladorDeLetrasJaDigitadas) obj;
        if(this.letrasJaDigitadas == outro.letrasJaDigitadas)return true;
        return false;
    }
    @Override
    public int hashCode ()
    {
        int ret = 666;
        ret = ret*13 + this.letrasJaDigitadas.hashCode();
        if(ret < 0)ret = -ret;
        return ret;
    }

    public ControladorDeLetrasJaDigitadas(ControladorDeLetrasJaDigitadas controlador) throws Exception
    {
        if (controlador == null) throw new Exception("Objeto nulo");
        this.letrasJaDigitadas = controlador.letrasJaDigitadas;
    }
    @Override
    public Object clone ()
    {
        try {
            return new ControladorDeLetrasJaDigitadas(this);
        } catch (Exception e) {
            return null;
        }
    }
}