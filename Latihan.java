public class Latihan{
	public static double ReturnAverage(int value[], int AS, int MIN, int MAX){
	/*Fungsi ReturnAverage menghitung rerata dari nilai prositif antara MIN-MAX yang diinputkan kedalam larik. Ukuran maksimum dari larik adalah AS. Tetapi,
	ukuran larik dapat lebih kecil dari AS, dalam kasus ini akhir dari input ditandai dengan nilai -999*/

	int i, ti, tv, sum;
	double av;
	i=0; ti=0; tv=0; sum=0;
	while (ti < AS && value[i] != -999){
		ti++;
		if(value[i] >= MIN && value[i] <= MAX ){
			tv++;
			sum = sum + value[i];
			}
			i++;
		}
		if (tv > 0)
			av = (double)sum/tv;
		else
			av = (double) -999;
			return(av);
	}

	public static void main(String []args){
			double hasil =0;
			int value[] = {1,2,3,4,5};
			int AS = -5;
			int MIN = 1;
			int MAX = 20;

			hasil = ReturnAverage(value, AS, MIN, MAX);

			System.out.println("Hasil ="+hasil);
		}
}
