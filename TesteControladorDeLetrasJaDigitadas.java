public class TesteControladorDeLetrasJaDigitadas {
    public static void main(String[] args) {
        try {
            ControladorDeLetrasJaDigitadas controlador = new ControladorDeLetrasJaDigitadas();

            controlador.registre('A');
            controlador.registre('B');
            controlador.registre('C');
            System.out.println("Letras registradas: " + controlador);

            System.out.println("letra 'A' ja foi digitada? " + controlador.isJaDigitada('A'));
            System.out.println("Letra 'D' ja foi digitada? " + controlador.isJaDigitada('D'));

            try {
                controlador.registre('A');
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            ControladorDeLetrasJaDigitadas clone = (ControladorDeLetrasJaDigitadas) controlador.clone();
            System.out.println("Clone: " + clone);

            System.out.println("Original é igual ao clone? " + controlador.equals(clone));

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}