import java.util.*;
import java.text.*;

public class atm implements mesinATM{
	double seratus;
	double limapuluh;
	double duapuluh;
	double bagi;
	@Override
	public void keluarkanUang(double nominal){
		Date date = new Date();
		DateFormat datefor = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
			bagi= nominal/50000;
			if(nominal<50000){
				if (nominal%20000==0){
					duapuluh=nominal/20000;
					limapuluh=0;
					seratus=0;
	
					System.out.println(datefor.format(date));
					System.out.println((int)seratus+" 100ribu");
					System.out.println((int)limapuluh+" 50ribu");
					System.out.println((int)duapuluh+" 20ribu");
				}else{
					System.out.println("becanda anda");
					atm atm = new atm();
					System.out.print("ambil berapa ?");
					int jumlah = new Scanner(System.in).nextInt();
					atm.keluarkanUang(jumlah);
				}
			}else if(nominal%50000==10000||nominal%50000==30000){
				bagi--;
				duapuluh=50000+(nominal%50000);
				duapuluh=duapuluh/20000;
				limapuluh=bagi%2;
				seratus=bagi/2;


				System.out.println(datefor.format(date));
				System.out.println((int)seratus+" 100ribu");
				System.out.println((int)limapuluh+" 50ribu");
				System.out.println((int)duapuluh+" 20ribu");
			}else if(nominal%50000==20000||nominal%50000==40000||nominal%50000==0){
				duapuluh=nominal%50000;
				duapuluh=duapuluh/20000;
				limapuluh=bagi%2;
				seratus=bagi/2;

				System.out.println(datefor.format(date));
				System.out.println((int)seratus+" 100ribu");
				System.out.println((int)limapuluh+" 50ribu");
				System.out.println((int)duapuluh+" 20ribu");
				
			}else{
				System.out.println("becanda anda");
				atm atm = new atm();
				System.out.print("ambil berapa ?)");
				int jumlah = new Scanner(System.in).nextInt();
				atm.keluarkanUang(jumlah);
			}
			//}
		
	
	}
	public static void main (String[] arg){
		atm atm = new atm();
		
		System.out.print("ambil berapa ?");
		int jumlah = new Scanner(System.in).nextInt();
		atm.keluarkanUang(jumlah);
		}
}