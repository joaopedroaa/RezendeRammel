package etrr.pedro_lucas.filewritterexe;


	import java.util.Scanner;	

	import java.io.FileWriter;

	import java.io.InputStreamReader;



		public class FileWritterExe {

	

		public static void main(String[] args) {


		
		int num;
	

		Scanner sc = new Scanner(System.in);
	

			System.out.println("Digite um n�mero: ");
		
				try {
			
					num = Integer.parseInt( sc.readLine() );


			
			FileWriter fw = new FileWriter("D:\Rezende_pl\Trabalhos em Java\tabuada.txt");

	
		
			for (int i = 0; i <= 10; i++) {


						int tabuada = num*i;


						fw.write( num + " x " + i + " = " + tabuada + "\r\n");

			}

						fw.close();


						System.out.println("Imprimido!");

			}
						 catch {

					e.printStackTrace();
		
					}

	
				}


			}