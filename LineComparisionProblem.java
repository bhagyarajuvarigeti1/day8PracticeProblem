public class lineComparisonProblem{
        public static void main(String[] args) {
                System.out.println("Welcome to Line Comparison Computation P>
                int x1,x2,y1,y2;
                Scanner in = new Scanner(System.in);
                x1 = in.nextInt();
                y1 = in.nextInt();
                x2 = in.nextInt();
                y2 = in.nextInt();
                x = x2-x1;
                y = y2-y1;
                double Length_of_a_Line = Math.sqrt((x*x)+(y*y));
                System.out.println(Length_of_a_Line);
        }
}

