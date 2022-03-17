package lastProjectMedicalCenter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMedicalCenter {

	public static void main(String[] args) {

		MedicalCenter mc = new MedicalCenter("Sun", "Rehovot herzel 10", 
				"www.sun.co.il", "08-9342234");
			String filepath = "c:\\_medicalCenter\\med-center.txt";
				mc.readFromFile(filepath);
				consoleMenu(mc);
				
	}

	private static void consoleMenu(MedicalCenter mc) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String getId = "",service = "";
		int id = 0;
		
		
		while(true) {
		System.out.println("Chose option");
		System.out.println("1.Add new patient");
		System.out.println("2.Display all patients");
		System.out.println("3.RemovePatient");
		System.out.println("4.Change service");
		System.out.println("5.Save and exit");
		System.out.println("6.Exit without saving");
		
		try {
			String answer = br.readLine();
			switch(answer) {
			case "1": addPatient(mc,br); break;
			case "2": mc.display();break;
			case "3":
				System.out.println("Enter id...");
				getId = br.readLine();
				id = Integer.parseInt(getId);				
				mc.removePatient(id);break;
			case "4":
				System.out.println("Enter id...");
				getId = br.readLine();
				id = Integer.parseInt(getId);	
				System.out.println("Enter new service...");
				service = br.readLine();
				mc.changeService(id, service);break;

			case "5": 
				String folderPath = "c:\\_medicalCenter";
				String fileName = "med-center.txt";
				mc.saveAllPatientsToFile(folderPath, fileName);
				; return;
			case "6": return;
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	private static void addPatient(MedicalCenter mc, BufferedReader br) {
		
		String name, answer, service;
		int id,age;
		double weight;
		
		while(true) {
		try {
			System.out.println("Enter name...");
			name = br.readLine();
			System.out.println("id...");
			answer = br.readLine();
			id = Integer.parseInt(answer);
			System.out.println("age ...");
			answer = br.readLine();
			age = Integer.parseInt(answer);
			System.out.println("weight ...");
			answer = br.readLine();
			weight = Double.parseDouble(answer);
			
			Patient pt = new Patient(name, id, age, weight);
			System.out.println("service ...");
			service = br.readLine();
			mc.addNewPatient(pt, service);
			
			System.out.println("Another patient? yes or no");
			answer = br.readLine();
			if(answer.equalsIgnoreCase("no"))
				return;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		
	}

}
