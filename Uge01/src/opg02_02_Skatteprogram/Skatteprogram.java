package opg02_02_Skatteprogram;

public class Skatteprogram {

	public static void main(String[] args){
		int indkomst = 120000;
		int personfradrag = 33400;
		double ambi, pension, bundskat;

		ambi = indkomst * 8.0 / 100.0; 
		pension = indkomst * 1.0 / 100.0;
		bundskat = (indkomst - ambi - pension -personfradrag) * 7/100;

		System.out.print("Arbejdsmarkedsbidrag: ");
		System.out.println(ambi);
		System.out.print("Særlig pensionsopsparing:  "); 
		System.out.println(pension);
		System.out.print("Bundskat: ");
		System.out.println(bundskat);
	}
}