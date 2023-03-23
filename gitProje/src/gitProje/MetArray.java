package gitProje;
//Verilen 2 boyutlu dizide ki tek sayıları method ile bulan ve method ile ekrana yazdıran program
public class MetArray {
	public static void main(String[] args) {
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 } };
		tekSayi(matris);

		yazdirma(tekSayi(matris));
	}

	public static int[] tekSayi(int[][] matris) {

		int s = 0;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 != 0) {
					s++;

				}
			}

		}
		int[] tekSayi = new int[s];
		s = 0;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {

				if (matris[i][j] % 2 != 0) {

					tekSayi[s] = matris[i][j];
					s++;
				}
			}
		}
		return tekSayi;
	}

	public static void yazdirma(int[] tekSayi) {

		for (int i = 0; i < tekSayi.length; i++) {

			System.out.println("dizi[" + i + "] tek sayidir=" + tekSayi[i]);

		}
	}
}
