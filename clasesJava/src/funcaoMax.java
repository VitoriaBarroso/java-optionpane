class funcaoMax{
    public static void main(String args[]){
        int A = 10, B = 15;
        double C = -5.9, D = -4.5;

        System.out.println("O maior entre 10 e 15 é   "+Math.max(A,B));
        System.out.println("O maior entre-5.9 e -4.5 é "+Math.max(C,D));
        System.out.println("O maior entre 10 e -5.9 é "+Math.max(A,C));
    }
}
