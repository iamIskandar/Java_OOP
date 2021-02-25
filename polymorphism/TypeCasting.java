class TypeCasting
{
	public static void main(String[] args)
	{
		int harga=5;
		double hargaBaru=harga;
		System.out.println(hargaBaru);//implicit casting//widening//automaticallyy

		double HargaBarang=25.25;
		int hargaBarangBaru=(int)HargaBarang;
		System.out.println(hargaBarangBaru);//explicit casting//narrowing//buat sendiri
	}
}