class funcaosub
{
    public static void main (String args[])
    {
        String A = "Aprendendo Java";
        System.out.println(A);
        System.out.println("do 3º caractere até o fim: " + A.substring(2));
        System.out.println("do 1º caractere até o 10º: " + A.substring(0, 10));
        System.out.println("do 12º caractere até o 15º: " + A.substring(11, 15));
    }
}
