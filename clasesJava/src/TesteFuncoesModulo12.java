
public class TesteFuncoesModulo12 {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("INÍCIO DO TESTE DE CAIXA PRETA - MÓDULO 12");
        System.out.println("=========================================");

        rodarFuncaoMin();
        rodarFuncaoCase();
        rodarFuncaoCeil();
        rodarFuncaoChar();
        rodarFuncaoFloor();
        rodarFuncaoLength();
        rodarFuncaoMax();
        rodarFuncaoPow();
        rodarFuncaoReplace();
        rodarFuncaoSqrt();
        rodarFuncaoSub();
        rodarFuncaoTrim();
        rodarFuncaoValue();
    }

    // --- 1. funcaoMin.java (Math.min) ---
    public static void rodarFuncaoMin() {
        System.out.println("\n--- Teste 1: Math.min ---");
        int A = 10, B = 15;
        double C = -5.9, D = -4.5;

        System.out.println("O menor entre 10 e 15 é   " + Math.min(A, B));
        System.out.println("O menor entre-5.9 e -4.5 é " + Math.min(C, D));
        System.out.println("O menor entre 10 e -5.9 é " + Math.min(A, C));
    }

    // --- 2. funcaoCase.java (toUpperCase/toLowerCase) ---
    public static void rodarFuncaoCase() {
        System.out.println("\n--- Teste 2: toUpperCase/toLowerCase ---");
        String A = "Arroz", B = "Batata";
        System.out.println("Arroz em minuscula " + A.toLowerCase());
        System.out.println("Batatta em maiuscula  " + B.toUpperCase());
        System.out.println("SaLaDa em maiuscula  " + "SaLaDa".toLowerCase());
    }

    // --- 3. funcaoCeil.java (Math.ceil) ---
    public static void rodarFuncaoCeil() {
        System.out.println("\n--- Teste 3: Math.ceil ---");
        double A = 5.2, B = 5.6, C = -5.8;
        System.out.println("Arrendondado 5.2 = " + Math.ceil(A));
        System.out.println("Arrendondado 5.6 = " + Math.ceil(B));
        System.out.println("Arrendondado -5.8 = " + Math.ceil(C));
    }

    // --- 4. funcaoChar.java (charAt) ---
    public static void rodarFuncaoChar() {
        System.out.println("\n--- Teste 4: charAt ---");
        String A = "Aprendendo Java";
        System.out.println("String " + A);
        System.out.println("O caractere na pos 5 é  " + A.charAt(5)); // Deve ser 'd'
        System.out.print("Caracteres de 11 a 14: ");
        for (int i = 11; i <= 14; i++) {
            System.out.print(A.charAt(i));
        }
        System.out.println();
    }

    // --- 5. funcaoFloor.java (Math.floor) ---
    public static void rodarFuncaoFloor() {
        System.out.println("\n--- Teste 5: Math.floor ---");
        double A = 5.2, B = 5.6, C = -5.8;
        System.out.println("Arrendondado 5.2 = " + Math.floor(A));
        System.out.println("Arrendondado 5.6 = " + Math.floor(B));
        System.out.println("Arrendondado -5.8 = " + Math.floor(C));
    }

    // --- 6. funcaoLength.java (length) ---
    public static void rodarFuncaoLength() {
        System.out.println("\n--- Teste 6: length ---");
        String A = "Aprendendo Java";
        int tamanho = A.length();
        System.out.println("String " + A);
        System.out.println("O tamanho da String é  " + tamanho);
    }

    // --- 7. funcaoMax.java (Math.max) ---
    public static void rodarFuncaoMax() {
        System.out.println("\n--- Teste 7: Math.max ---");
        int A = 10, B = 15;
        double C = -5.9, D = -4.5;

        System.out.println("O maior entre 10 e 15 é   " + Math.max(A, B));
        System.out.println("O maior entre-5.9 e -4.5 é " + Math.max(C, D));
        System.out.println("O maior entre 10 e -5.9 é " + Math.max(A, C));
    }

    // --- 8. funcaoPow.java (Math.pow) ---
    public static void rodarFuncaoPow() {
        System.out.println("\n--- Teste 8: Math.pow ---");
        double base = 5.5, potencia = 2;
        System.out.println("5.5 elevado a 2 é  " + Math.pow(base, potencia));
        System.out.println("25 elevado a 0.5 é  " + Math.pow(25, .5));
        System.out.println("5678 elevado a 0 é  " + Math.pow(5678, 0));
    }

    // --- 9. funcaoReplace.java (replace) ---
    public static void rodarFuncaoReplace() {
        System.out.println("\n--- Teste 9: replace ---");
        String A = "banana nanica";
        System.out.println("String: " + A);
        System.out.println("Troca caracter 'a' por 'u': " + A.replace('a', 'u'));
        System.out.println("Troca caracter 'n' por 'N': " + A.replace('n', 'N'));
        System.out.println("Troca caracter espaço por '_': " + A.replace(' ', '_'));
    }

    // --- 10. funcaoSqrt.java (Math.sqrt) ---
    public static void rodarFuncaoSqrt() {
        System.out.println("\n--- Teste 10: Math.sqrt ---");
        double A = 900, B = 30.25;
        System.out.println("A raiz quadrada de 900 é " + Math.sqrt(A));
        System.out.println("A raiz quadrada de 30.25 é " + Math.sqrt(B));
    }

    // --- 11. funcaosub.java (substring) ---
    public static void rodarFuncaoSub() {
        System.out.println("\n--- Teste 11: substring ---");
        String A = "Aprendendo Java";
        System.out.println(A);
        System.out.println("do 3º caractere até o fim: " + A.substring(2));
        System.out.println("do 1º caractere até o 10º: " + A.substring(0, 10));
        System.out.println("do 12º caractere até o 15º: " + A.substring(11, 15));
    }

    // --- 12. funcaoTrim.java (trim) - Originalmente Exemplo0412 ---
    public static void rodarFuncaoTrim() {
        System.out.println("\n--- Teste 12: trim ---");
        String frase = "   Cristo: o rei dos reis   ";
        System.out.println("Com espacos: " + "'" + frase + "'");
        System.out.println("Sem espacos: " + "'" + frase.trim() + "'");
    }

    // --- 13. funcaoValue.java (String.valueOf) ---
    public static void rodarFuncaoValue() {
        System.out.println("\n--- Teste 13: String.valueOf ---");
        int a = 11;
        long b = 222;
        float c = 3333;
        double d = 4.444;
        String S = String.valueOf(a) + " * " + String.valueOf(b) + " * " +
                String.valueOf(c) + " * " + String.valueOf(d);
        System.out.println("Conteudo de S: " + S);
    }
}