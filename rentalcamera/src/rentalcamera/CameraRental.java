package rentalcamera;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.io.*;
public class CameraRental {

	public static void main(String[] args) {
		System.out.println("+---------------------------------------+\n");
		System.out.println("|\t Welcome to rentmycam           |\n");
		System.out.println("+---------------------------------------+\n");
		System.out.println("Pease Login to continue\n");
		System.out.println("Username -\n");
		System.out.println("Password: \n");
		Selectoption();
	}
	private static void Selectoption() {
		String[] arr = {"1.MY CAMERA",
				"2.RENT A CAMERA",
				"3.VIEW ALL CAMERAS",
				"4.MY WALLET",
				"5.Exist"
				
		};
		int[] arr1 = {1,2,3,4,5};
		int  slen = arr1.length;
		for(int i=0; i<slen;i++){
			System.out.println(arr[i]);
			}
		System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=slen;j++){
            if(options==j){
                switch (options){
                    case 1:
                    	MyCamera();
                        break;
                    case 2:
                    	Available();
                    	break;
                    case 3:
                    	ArrayList1 obj3 = new ArrayList1();
                    	obj3.AllCam();
                    	break;
                    case 4:
                    	MyWallet();
                    	break;
                    case 5:
                    	System.out.println("THANKYOU FOR VISITING");
                    	
                }
            }
        }
	}
	
	
	private static void MyWallet() {
		double Balance = 0;
		System.out.println("YOUR CURRENT WALLET BALANCE IS - INR."+Balance);
		System.out.println("DO YOU WANT TO DEPOSIT MORE AMOUNT TO YOUR WALLET?(1.YES 2.NO)-");
		Scanner sc = new Scanner(System.in);
		int Choice = sc.nextInt();
		if(Choice==1) {
			System.out.println("ENTER THE AMOUNT (INR) -");
			double Amount = sc.nextDouble();
			double total = Balance + Amount;
			System.out.println("YOUR WALLET BALANCE UPDATED SUCCESSFULLY. CURRENT WALLET BALANCE - INR."+total);
		}
		else {
			Selectoption();
		}
		
		
	}
	private static void Available() {
		ArrayList1 OBJ = new ArrayList1();
		boolean found = true;
		
		
	}
	private static void MyCamera() {
		String[] mycam = {"1.ADD",
				"2.REMOVE",
				"3.VIEW MY CAMERAS",
				"4.GO TO PREVIOUS MENU"
		};
		int[] arr2 = {1,2,3,4};
		int  slen = arr2.length;
		for(int i=0; i<slen;i++){
			System.out.println(mycam[i]);
	}
		System.out.println("\nEnter your Choice:\n");
		Scanner sc = new Scanner(System.in);
		int MyCamOpt = sc.nextInt();
		for(int j=1;j<=slen;j++) {
			if(MyCamOpt==j) {
				switch (MyCamOpt) {
				case 1:
					ArrayList1 obj = new ArrayList1();
					obj.Add();
					System.out.println("YOUR CAMERA HAS BEEN SUCCESSFULLY ADDED TO THE LIST");
					MyCamera();
					break;
				case 2:
					ArrayList1 obj1 = new ArrayList1();
					obj1.AllCam();
					obj1.Remove();
					System.out.println("CAMERA SUCCESSFULLY REMOVED FROM THE LIST");
				case 3:
					ArrayList1 obj4 = new ArrayList1();
					obj4.AllCam();
					break;
				case 4:
					Selectoption();
					break;
				}
			}
			
		}
	
}
}
