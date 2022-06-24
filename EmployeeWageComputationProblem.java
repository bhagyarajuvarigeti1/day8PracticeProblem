public class EmployeeWageComputationProblem {
    public static void main(String[] args) {

        while (true)
        {
            int p=(int)(Math.random()*3);
            System.out.println(wagePerDay(p));
        }
    }
    public  static  int wagePerDay(int i){
        int fullDayHour=8,pratTimeHour=8,wagePerHour=20,totalWage=0,days=0,hours=0;
        switch (i){
            case 0:
            {
                totalWage+=fullDayHour*wagePerHour;
                hours+=fullDayHour;
            }
            case 1:
            {
                totalWage+=pratTimeHour*wagePerHour;
                hours+=fullDayHour;

            }

        }
        if(hours>92){
            totalWage+=pratTimeHour*wagePerHour;
            hours=100;
        }

        days++;
        if (days<20 && hours<100){
            System.exit(0);
        }
        return totalWage;
    }
}