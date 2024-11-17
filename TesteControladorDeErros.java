public class TesteControladorDeErros {
    public static void main(String[] args) {
        try {
            ControladorDeErros controlador = new ControladorDeErros(3);

            controlador.registreUmErro();
            controlador.registreUmErro();
            System.out.println("Erros registrados: " + controlador);

            System.out.println("Atingiu limite de erros? " + controlador.isAtingidoMaximoDeErros());
            controlador.registreUmErro();
            System.out.println("Atingiu limite de erros? " + controlador.isAtingidoMaximoDeErros());

            System.out.println("Controlador: " + controlador);

            ControladorDeErros clone = (ControladorDeErros) controlador.clone();
            System.out.println("Clone: " + clone);

            System.out.println("Original é igual ao clone? " + controlador.equals(clone));

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}