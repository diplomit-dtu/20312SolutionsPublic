package opg09_04_TestBiograf;
import opg09_03_Biograf.Cinema;

public class TestCinema {
		public static void main(String[] args) {
			Cinema c = new Cinema(new int[]{8, 7, 6, 6, 7, 8, 10});
			c.booking(1, 5);
			c.booking(10, 1);
			System.out.println("Rows: " + c.rows());
			System.out.println("Seats on row 5: " + c.seatsOnRow(5));
			System.out.println("Total number of seats: " + c.seats());
			System.out.println("Total number of available seats: " + c.vacancies());
			System.out.println("Avalable seats on row 1: " + c.rowVacancies(1));
			System.out.println(c);

		}
}
