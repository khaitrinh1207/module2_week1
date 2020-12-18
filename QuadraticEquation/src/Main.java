public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,-5,4);
        System.out.println("Delta = "+quadraticEquation.Delta());
         double a = quadraticEquation.getA();
         double b = quadraticEquation.getB();
         double delta = quadraticEquation.Delta();
        if ( delta < 0)
            System.out.println("Phương trình vô nghiệm");
        else if (delta == 0)
            System.out.println("Phương trình có nghiệm kép x1 = x2 =" +(-b/(2*a)));
        else
            System.out.println("Phương trình có nghiệm kép x1 = "
                    +(-b-Math.sqrt(delta)/(2*a))
                    +" x2 = "
                    +(-b+Math.sqrt(delta)/(2*a)));

    }
}
