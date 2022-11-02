#include <stdio.h>
#include <locale.h>

void main()
{
	int a, mhs;
	printf(" Jumlah Data Mahasiswa yang Mau Diinputkan : ");
	scanf("%d", &mhs);
	printf("\n");
	char nim[mhs][10], nama[mhs][20];
	int tagihan[mhs], sks[mhs];
    setlocale(LC_NUMERIC, "");

	for(a = 0; a < mhs; a++)
	{
		printf(" Masukkan NIM Mahasiswa ke %d : ", a+1);
		scanf(" %s", &nim[a]);
		printf(" Masukkan Nama Mahasiswa ke %d : ", a+1);
		scanf(" %[^\n]s", &nama[a]);
		printf(" Masukkan Jumlah SKS Mahasiswa ke %d : ", a+1);
		scanf("%d", &sks[a]);
		printf("\n");
	}
	printf("\n");
	for(a = 0; a < mhs; a++)
	{
		tagihan[a] = sks[a] * 250000;
		printf(" Data Mahasiswa %d\n", a+1);
		printf(" NIM Mahasiswa\t\t\t: %s\n", nim[a]);
		printf(" Nama Mahasiswa\t\t\t: %s\n", nama[a]);
		printf(" Jumlah SKS Mahasiswa\t\t: %d\n", sks[a]);
		printf(" Jumlah Tagihan Mahasiswa\t: %'d\n", tagihan[a]);
		printf("\n");
	}
	printf("\n");
}