public class EmployeeWageComputationProblem {
    public static void main(String[] args) {
        int fullDayHour=8,pratTimeHour=8,wagePerHour=20;

        long totalWage=0;
        int days=0,hours=0;
        while (days<20 && hours<100)
        {
            int p=(int)(Math.random()*3);
            switch (p){
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
            System.out.println(totalWage);
        }
    }
}