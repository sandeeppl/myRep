package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooRegistration_3 {

	@Test(dataProvider="dataReg")
	public void regUsr(String un,String pwd, String city,String state){
		//un
		//pw
		//city
		//stat
		System.out.println("UN-->"+un+"    pwd-->"+pwd+ "    City-->"+city+ "    State-->"+state);
	}
	
	@DataProvider
	public Object[][] dataReg(){
		
		Object [][] data = new Object[3][4];
		
		data[0][0] ="user1";
		data[0][1]="pw1";
		data[0][2]="Bang";
		data[0][3]="Karnataka"	;	
		
		data[1][0] ="user2";
		data[1][1]="pw2";
		data[1][2]="Bang2";
		data[1][3]="Karnataka2"	;
		
		data[2][0] ="user3";
		data[2][1]="pw3";
		data[2][2]="Bang3";
		data[2][3]="Karnataka3"	;	
		
		
		return data;
		
	}
}
