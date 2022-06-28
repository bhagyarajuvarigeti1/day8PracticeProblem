import java.util.*;
public class lineComparisonProblem{
        public static void main(String[] args) {
                System.out.println("Welcome to Line Comparison Computation P>
                int x11,x12,y11,y12,x01,x02,y01,y02;
                Scanner in = new Scanner(System.in);
                x11 = in.nextInt();x01 = in.nextInt();
                y11 = in.nextInt();y01 = in.nextInt();
                x12 = in.nextInt();x02 = in.nextInt();
                y12 = in.nextInt();y02 = in.nextInt();
                double Line1=LengthOfTheLine(x11,x12,y11,y12);
                double Line2=LengthOfTheLine(x01,x02,y01,y02);
                if(Line1==Line2){
                        System.out.println("Both lines are equal");
                }
                else if(Line1<Line2){
                        System.out.println("Line 1 is less than Line 2");
                }
                else{
                        System.out.println("Line 1 is greater than Line 2");
                }
        }
        public static  double LengthOfTheLine(int x1,int x2,int y1,int y2){
                int x = x2-x1;
                int y = y2-y1;
                double Length_of_a_Line = Math.sqrt((x*x)+(y*y));
                return Length_of_a_Line;
        }
}
