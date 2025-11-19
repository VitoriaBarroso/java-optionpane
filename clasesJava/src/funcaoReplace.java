class funcaoReplace
{
    public static void main (String args[])
    {
        String A = "banana nanica";
        System.out.println("String: " + A);
        System.out.println();
        System.out.println("Troca caracter 'a' por 'u': " + A.replace('a', 'u'));
        System.out.println("Troca caracter 'n' por 'N': " + A.replace('n', 'N'));
        System.out.println("Troca caracter espaço por '_': " + A.replace(' ', '_'));
    }
}
