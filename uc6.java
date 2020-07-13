public class uc6
{
    public static void main(String[] args)
    {

        int  is_full=1;
        int is_part=2;
	int max_hr_in_month=100;
        int rate_per_hr=20;
	int Numof_working_days=20;
	int total_emp_hr=0;
	int total_working_days=0;
	while( totaL_emp_hr < max_hr_in_month && total_working_days < Numof_working_days)
	{
                double emp = Math.floor(Math.random() * 10) % 3;
                if (is_full == emp )
                 {
                                System.out.println("employee is present for full day");
                                int day =(8*rate_per_hr);
				int cal =(day*Numof_working_days);
                                System.out.println("monthly wage for full time employee " +cal);

                 }
                else if (is_part == emp)
                        {
                                System.out.println("employee is present for half day");
                                int day =(8*rate_per_hr);
                                int cal =(day*Numof_working_days);

                                System.out.println("monthly wage for part time employee " +cal);

                        }

                else
                        {
                                System.out.println("employee is absent");
                        }
		totaL_emp_hr++;
		total_working_days++;
	}
    }
}






