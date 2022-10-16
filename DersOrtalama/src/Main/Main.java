package Main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ınp=new Scanner(System.in);
		int total=0;
		
		System.out.println("Matematik Notum: ");
		
	    double mat=ınp.nextDouble();
	    if (mat>=0 && mat<=100) {
	    	total+=mat;
	    	
	    	
	    }else {
	    	System.out.println("0 ile 100 arasında girmeniz gerekir ");
	    }
	    System.out.println("Fizik Notum: ");
	    double fizik=ınp.nextDouble();
	    if (fizik>=0 && fizik<=100) {
	    	total+=fizik;
	    	
	    	
	    }else {
	    	System.out.println("0 ile 100 arasında girmeniz gerekir ");
	    }
	    
	    System.out.println("Edebiyat Notum");
	    double turkce=ınp.nextDouble();
	    if (turkce>=0 && turkce<=100) {
	    	total+=turkce;
	    	
	    	
	    }else {
	    	System.out.println("0 ile 100 arasında girmeniz gerekir ");
	    }
	    System.out.println("Kimya Notum: ");
	    double kimya = ınp.nextDouble();
	    if (kimya>=0 && kimya<=100) {
	    	total+=mat;
	    	
	    	
	    }else {
	    	System.out.println("0 ile 100 arasında girmeniz gerekir ");
	    }
	    System.out.println("Biyoloji Notum: ");
	    double biyo = ınp.nextDouble();
	    if (biyo>=0 && biyo<=100) {
	    	total+=biyo;
	    	
	    	
	    }else {
	    	System.out.println("0 ile 100 arasında girmeniz gerekir ");
	    }
	    double average = (mat+fizik+turkce+kimya+biyo)/5;
	    System.out.println("Not Ortalamam: "+average);
	    if(kimya<55 || mat<55 || fizik<55 || biyo<55 || turkce<55) {
	    	System.out.println("Bir veya birden fazla notunuz 55 ten küçük olduğu için sınıfta kaldınız...");
	     
	    }else {
	    	System.out.println("Teberikler sınıfı geçtiniz..");
	    	
	    }
	    
	    //bu okulda tek derseten kalsanız bile sınıfta kalıyorsunuz:)
	    if (0<=mat && mat>=100 && 0<=fizik && fizik<=100 && 0<=kimya  && kimya>=100 && 0<=biyo && biyo<=100 && 0<=turkce && turkce<=100) {
	    System.out.println("Not Ortalamam: "+average);
	    }
	    
	    if(kimya<55 || mat<55 || fizik<55 || biyo<55 || turkce<55) {
	    	System.out.println("Bir veya birden fazla notunuz 55 ten küçük olduğu için sınıfta kaldınız...");
	     
	    }else {
	    	System.out.println("Teberikler sınıfı geçtiniz..");
	    	
	     }
  }
}
	    
	    	
	    
	    
	    
	    
	       
	     
	    

