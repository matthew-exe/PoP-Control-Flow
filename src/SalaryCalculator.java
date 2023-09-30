/**
 * SalaryCalculator class - part of Control Flow
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */

public class SalaryCalculator {

	/**
	 * salaryTax()
	 * works out the inputted salary's tax bracket and returns the salary with tax deducted
	 * @param salary	original salary
	 * @return salary with the tax deducted
	 */
	public double salaryTax(double salary) {
		double finalSalary;
		if (salary >= 45000) {
			finalSalary = salary - (salary * 0.5);
		}
		else if (salary >= 30000) {
			finalSalary = salary - (salary * 0.3);
		}
		else {
			finalSalary = salary - (salary * 0.15);
		}
		return finalSalary;
	}

	/**
	 * calculateNI()
	 * deducts the inputted national insurance bands percentage from the inputted salary
	 * @param salary	original salary
	 * @param band	nation insurance band
	 * @return salary with nation insurance deducted
	 */
	public double calculateNI(double salary, char band) {
		double finalSalary;
		if ("A".equalsIgnoreCase(String.valueOf(band))) { // if band a
			finalSalary = salary - (salary * 0.12);
		}
		else if ("B".equalsIgnoreCase(String.valueOf(band))) { // if band b
			finalSalary = salary - (salary * 0.0585);
		}
		else if ("C".equalsIgnoreCase(String.valueOf(band))) { // if band c
			finalSalary = salary - (salary * 0.02);
		}
		else { // if an invalid band is inputted
			finalSalary = salary;
		}
		return finalSalary;
	}

	/**
	 * salaryTotal()
	 * returns the total of an array of salaries
	 * @param salaries	array of salaries
	 * @return total sum of all salaries
	 */
	public double salaryTotal(double[] salaries) {
		double total = 0;
		for (double salary:salaries) { // for each salary in the array
			total += salary;
		}
		return total;
	}

	/**
	 * salaryAverage()
	 * returns the average of an array of salaries
	 * @param salaries	array of salaries
	 * @return average of the salaries
	 */
	public double salaryAverage(double[] salaries) {
		double average = 0;
		for (double salary:salaries) { // for salary in the array
			average += salary;
		}
		return average / salaries.length;
	}

	/**
	 * salaryIncrease()
	 * increases each salary in an array by 5%
	 * @param salaries	array of salaries
	 * @return array of salaries increased by 5%
	 */
	public double[] salaryIncrease(double[] salaries) {
		double[] increasedSalaries = new double[salaries.length]; // create new array
		for (int i = 0; i < salaries.length; i++) { // for salary in the array
			increasedSalaries[i] = salaries[i] + (salaries[i] * 0.05); // add increased salary to new array
		}
		return increasedSalaries;
	}
}
