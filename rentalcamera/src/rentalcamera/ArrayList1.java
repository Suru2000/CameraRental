package rentalcamera;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Camera{
	int CameraID;
	String Brand;
	String Model;
	double Price_perday;
	String Status;
	Camera(int CameraID, String Brand,String Model,double Price_perday, String string){
		this.CameraID = CameraID;
		this.Brand = Brand;
		this.Model = Model;
		this.Price_perday = Price_perday;
		this.Status = Status;
	}

}
class ArrayList1{
static void AllCam() {
	Camera c1 = new Camera(1,"Samsung", "DS123", 500.0, "Available");
	Camera c2 = new Camera(2, "Sony", "HD214", 500.0, "Available");
	Camera c3 = new Camera(3, "Panasonic", "XC", 500.0, "Available");
	Camera c4 = new Camera(4, "Canon", "XLR", 500.0, "Available");
	Camera c5 = new Camera(5, "Fukitsu", "J5", 500.0, "Available");
	Camera c6 = new Camera(6, "Sony", "HD226", 500.0, "Available");
	Camera c7 = new Camera(7, "NIKON", "DSLR-D75", 500, "Available");
	Camera c8 = new Camera(8, "LG", "L123", 500.0, "Available");
	Camera c9 = new Camera(9, "Canon", "XPL", 500.0, "Available");
	Camera c10 = new Camera(10, "Chroma", "CT", 500.0, "Available");
	
	ArrayList<Camera> allCam = new ArrayList<Camera>();
	allCam.add(c1);
	allCam.add(c2);
	allCam.add(c3);
	allCam.add(c4);
	allCam.add(c5);
	allCam.add(c6);
	allCam.add(c7);
	allCam.add(c8);
	allCam.add(c9);
	allCam.add(c10);
	
	
	System.out.println("==========================================\n");
	System.out.println("CameraID\tBrand \t\t Model \t\t Price(perday) \tStatus\n");
	Iterator itr = allCam.iterator();
	
	while(itr.hasNext()) {
		Camera cam = (Camera)itr.next();
		System.out.println(cam.CameraID+"\t\t"+cam.Brand+"\t\t"+cam.Model+"\t\t"+cam.Price_perday+"\t\t"+cam.Status);
	}
	
	
}


public ArrayList<Camera> Add() {
	 ArrayList<Camera> allCam = new ArrayList<>();
	
		System.out.println("ENTER CAMERA ID:");
		Scanner addid = new Scanner(System.in);
		int CameraID = (addid.nextInt());
		System.out.println("ENTER THE CAMERA BRAND:");
		Scanner addbrand = new Scanner(System.in);
		String Brand = (addbrand.nextLine());
		System.out.println("ENTER THE MODEL:");
		Scanner addmodel = new Scanner(System.in);
		String Model = (addmodel.nextLine());
		System.out.println("ENTER PER DAY PRICE:");
		Scanner addprice = new Scanner(System.in);
		double Price_perday = (addprice.nextDouble());
		String Status = "Available";
		allCam.add(new Camera(CameraID, Brand,Model,Price_perday, Status));
		return allCam;
		
	}


public void Remove() {
	ArrayList<Camera> allCam = new ArrayList<>();
	
	System.out.println("ENTER THE CAMERAID TO REMOVE:");
	Scanner sc = new Scanner(System.in);
	int value = sc.nextInt();
	allCam.removeIf(Camera->((Collection<rentalcamera.Camera>) Camera).contains(value));
	
	
}








}