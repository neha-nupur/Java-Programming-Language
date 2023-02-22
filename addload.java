class Addition {
    int add(int a, int b) {
        return(a+b);
    }

    int add(int a, int b, int c) {
        return(a+b+c);
    }

    float add(float a, float b) {
        return(a+b);
    }

    float add(int a, float b , float c) {
        return(a+b+c);
    }
}
 class addload {
    public static void main(String args[]) {

        Addition A = new Addition();
        int r1;
        float r2;
        r1 = A.add(100, 200, 400);
        System.out.println("Addition of 3 - whole nos =" +r1);
        r2 = A.add(4.1F, 3.2F);
        System.out.println("Addition of 2 floating point nos =" +r2);
        r1 = A.add(10, 20);
        System.out.println("Addition of 2 whole nos = " +r1);
        r2 = A.add(100, 2.1F, 1.4F);
        System.out.println("Addition of 1 whole & 2 floating nos =" +r2);
    }
}
