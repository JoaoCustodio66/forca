public class TesteTracinhos {
    public static void main(String[] args) {
        try {
            System.out.println("=== Teste Tracinhos ===");

            Tracinhos tracinhos = new Tracinhos(5);
            System.out.println("Tracinhos iniciais: " + tracinhos);

            tracinhos.revele(0, 'A');
            tracinhos.revele(3, 'B');
            System.out.println("Tracinhos após revelar: " + tracinhos);

            try {
                tracinhos.revele(-1, 'C');
            } catch (Exception e) {
                System.out.println("Exceção esperada: " + e.getMessage());
            }

            try {
                tracinhos.revele(5, 'C');
            } catch (Exception e) {
                System.out.println("Exceção esperada: " + e.getMessage());
            }

            System.out.println("Ainda com tracinhos? " + tracinhos.isAindaComTracinhos());
            tracinhos.revele(1, 'C');
            tracinhos.revele(2, 'D');
            tracinhos.revele(4, 'E');
            System.out.println("Tracinhos completos: " + tracinhos);
            System.out.println("Ainda com tracinhos? " + tracinhos.isAindaComTracinhos());


            System.out.println("String gerada: " + tracinhos.toString());

            Tracinhos clone = (Tracinhos) tracinhos.clone();
            System.out.println("Clone: " + clone);

            System.out.println("Original é igual ao clone? " + tracinhos.equals(clone));

            System.out.println("HashCode original: " + tracinhos.hashCode());
            System.out.println("HashCode clone: " + clone.hashCode());
            System.out.println("HashCodes são iguais? " + (tracinhos.hashCode() == clone.hashCode()));

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}