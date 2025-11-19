class funcaoMin{
    public static void main(String args[]){
        int A = 10, B = 15;
        double C = -5.9, D = -4.5;

        System.out.println("O menor entre 10 e 15 é   "+Math.min(A,B));
        System.out.println("O menor entre-5.9 e -4.5 é "+Math.min(C,D));
        System.out.println("O menor entre 10 e -5.9 é "+Math.min(A,C));
    }
}