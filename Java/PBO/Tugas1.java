import java.util.Scanner; // Nomor 1 - 5
// import java.lang.Math; // Nomor 2 - 3
import java.lang.String; // Nomor 5
import java.util.Arrays; // Nomor 5

public class Tugas1 {
    public static void main(String[] args) {
        // Nomor 1 "Si Paling Besar"
        /* 
        Deskripsi:
        Pak Romlah adalah seorang guru Matematika. Dia memberikan tebak-
        tebakan kepada para muridnya tentang bilangan terbesar.

        Input:
        Satu baris inputan yang terdiri dari 2 inputan angka, a dan b.
        
        Output:
        Jika a > b maka 1, selain itu 0.
        */
        /* 
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan 2 bilangan bulat: ");

        // Input bilangan bulat
        int a = input.nextInt(), b = input.nextInt();
        input.close();

        int output;

        if (a > b) {
            output = 1;
        } else {
            output = 0;
        }

        System.out.println("Output: " + output);
        */

        // Nomor 2 "Jarak Manhattan"
        /*
        Deskripsi:
        Jarak Manhattan adalah jarak dari suatu titik menuju suatu titik lainnya pada suatu sistem koordinat Kartesius dengan menyusuri bagian vertikal dan horizontal, tanpa pernah kembali. Secara sederhana, sama dengan jumlah dari selisih absis dan selisih ordinat. Dengan kata lain, jarak Manhattan = |x1 - x2| + |y1 - y2|. Pak Dengklek ingin pergi dari koordinat (x1, y1) menuju (x2, y2). Tentukan jarak Manhattan yang harus ditempuh Pak Dengklek.
        
        Input:
        Sebuah baris berisi empat buah bilangan bulat x1, y1, x2, dan y2.
        
        Output:
        Sebuah baris berisi sebuah bilangan bulat yang merupakan jarak Manhattan dari kedua titik tersebut.
        */
        /*
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan 4 bilangan bulat: ");

        // Input bilangan bulat
        int x1 = input.nextInt(), y1 = input.nextInt(), x2 = input.nextInt(), y2 = input.nextInt();
        input.close();

        int jarak = Math.abs((x1 - x2) + (y1 - y2));

        System.out.println("Jarak: " + jarak);
        */

        // Nomor 3 "Dua Pangkat"
        /*
        Deskripsi:
        Bilangan dua pangkat adalah bilangan bulat yang dapat dinyatakan dalam bentuk 2K, dengan K adalah suatu bilangan bulat. Pak Dengklek memberikan Anda sebuah bilangan bulat N. Tentukan apakah N adalah
        bilangan "dua pangkat" atau bukan.
        
        Input:
        Baris pertama berisi sebuah bilangan bulat N.
        
        Output:
        Sebuah baris berisi ya apabila N adalah bilangan dua pangkat, atau bukan apabila bukan.
        */
        /* 
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan 1 bilangan bulat: ");

        // Manual
        /*
        int N = input.nextInt(), n;
        input.close();

        n = N / 2;
         
        if (N % 2 == 1) {
            System.out.println("bukan");
        } else {
            for (int i = 0; i < n; i++) {
                N /= 2;
                if (N % 2 == 1) {
                    System.out.println("bukan");
                    break;
                } else if (N == 2) {
                    System.out.println("ya");
                    break;
                }
            }
        }
        

        // Math pow
        double N = input.nextDouble(), n;
        input.close();

        n = Math.floor(N / 2);

        for (double i = 0; i <= n; i++) {
            if (Math.pow(2, i) == N) {
                System.out.println("ya");
                break;
            } else if (Math.pow(2, i) != N && i == n) {
                System.out.println("bukan");
            }
        } 
        */

        // Nomor 4 "Kuadran"
        /*
        Deskripsi:
        Dalam diagram kartesius, terdapat 4 kuadran. Tentukan kuadran dari koordinat yang diinputkan!
        
        Input:
        Satu baris yang terdiri dari 2 bilangan, x dan y.
        
        Output:
        Satu bilangan bulat dari 1 hingga 4 yang menjelaskan koordinat yang
        dimasukkan.
        */
        /* 
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan 2 bilangan: ");

        int x = input.nextInt(), y = input.nextInt();
        input.close();

        if (x > 0 && y > 0) {
            System.out.println("Kuadran 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Kuadran 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Kuadran 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Kuadran 4");
        } else if (x == 0 && y != 0) {
            System.out.println("Sumbu Y");
        } else if (x != 0 && y == 0) {
            System.out.println("Sumbu X");
        } else {
            System.out.println("Pusat");
        }
        */

        // Nomor 5 "Berjumlah"
        /*
        Deskripsi:
        Bu Minah memiliki seorang anak bernama Budi. Bu Minah mendidik Budi dengan keras agar dapat berhitung. Bu Minah memberikan teka-teki
        dimana diberikan 3 angka a b c, dan Budi harus memperkirakan bagaimana cara menjumlah 3 angka tersebut agar menjadi T.
        
        Input:
        Satu baris inputan yang terdiri dari 4 bilangan, a, b, c, dan T.
        
        Output:
        Semua jawaban yang memungkinkan, dimana a, b, dan c berjumlah T dalam urutan leksikografis. Bila tidak ada kemungkinan, keluarkan
        ‘mustahil’.
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan 3 bilangan dan jumlahnya: ");
        
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt(), T = input.nextInt(), fill, countSize;
        input.close();

        int[] one = new int[T + 1], two = new int[T + 1], three = new int[T + 1];
        String count[] = new String[T * 10], first, second, third;

        if (T == 0) {
            System.out.println("0 0 0");
        } else {
            for (int i = 0; i < T * 10; i++) {
                count[i] = "";
            }
    
            for (int i = 0; i <= T; i++) {
                one[i] = 0;
                two[i] = 0;
                three[i] = 0;            
            }
            for (int i = 0; i <= T; i++) {
                if (a * i <= T) {
                    one[i] = i;
                } else {
                    break;
                }
            }
    
            for (int i = 0; i <= T; i++) {
                if (b * i <= T) {
                    two[i] = i;
                } else {
                    break;
                }
            }
    
            for (int i = 0; i <= T; i++) {
                if (c * i <= T) {
                    three[i] = i;
                } else {
                    break;
                }
            }
    
            fill = 0;
            for (int i = 0; i <= T; i++) {
                for (int j = 0; j <= T; j++) {
                    for (int k = 0; k <= T; k++) {
                        if ((a * one[i]) + (b * two[j]) +(c * three[k]) == T) {
                            if (i == 0 && one[i] != one[i + 1] && (j < T && two[j] != two[j + 1] || j == T) && (k < T && three[k] != three[k + 1] || k == T)) {
                                first = String.valueOf(one[i]);
                                second = String.valueOf(two[j]);
                                third = String.valueOf(three[k]);
                                
                                // System.out.println(fill);
                                count[fill] = first + " " + second + " " + third;
    
                                fill++;
                            } else if (i > 0 && one[i] != one[i - 1] && (j < T && two[j] != two[j + 1] || j == T) && (k < T && three[k] != three[k + 1] || k == T)) {
                                first = String.valueOf(one[i]);
                                second = String.valueOf(two[j]);
                                third = String.valueOf(three[k]);
                                
                                // System.out.println(fill);
                                count[fill] = first + " " + second + " " + third;
    
                                fill++;
                            }
                        }
                    }
                }
            }
    
            Arrays.sort(count);
            countSize = count.length;
    
            for (int i = 0; i < countSize; i++) {
                // System.out.println(i + " " +countSize + " " + fill);
                if (count[countSize - 1].compareTo("") == 0) {
                    System.out.println("Mustahil");
                    break;
                } else if (i < countSize - 1 && count[i].compareTo(count[i + 1]) != 0 && count[i].compareTo("") != 0) {
                    System.out.println(count[i]);
                } else if (i == countSize - 1) {
                    System.out.println(count[i]);
                }
            }
        }
    }
}
