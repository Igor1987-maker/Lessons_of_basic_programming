package lastProjectMedicalCenter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class MedicalCenter {

	private String name;
	private String address;
	private String url;
	private String phone;
	private TreeMap<Patient, String> patients = new TreeMap<>();

	public MedicalCenter(String name, String address, String url, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.url = url;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void addNewPatient(Patient pt, String service) {

		boolean isExists = patients.containsKey(pt);
		if (isExists == true) {
			patients.replace(pt, service);
		} else {
			patients.put(pt, service);
		}
	}

	public void changeService(int id, String service) {

		
		for (Patient p : patients.keySet()) {

			if (p.getId() == id) {
			 patients.replace(p, service);
			 	return;
			}
			
		}
		System.out.println("Patient not found ! \n CHEK ID");
	}

	public void removePatient(int id) {

		for (Patient p : patients.keySet()) {

			if (p.getId() == id) 
				patients.remove(p);
				return;
			}
		System.out.println("there's no such patient");
	}
	

	public void display() {

		for (Patient p : patients.keySet()) {

			System.out.println(p + " Service: " + 
				patients.get(p));
		}

	}

	public void saveAllPatientsToFile(String folderPath, String fileName) {

		File folder = new File(folderPath);
		if (!folder.exists()) {
			folder.mkdirs();
		}
		String filePath = folderPath + "\\" + fileName;
		File file = new File(filePath);
		if (!file.exists()) {

			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			for (Patient pt : patients.keySet()) {

				String toFile = pt.getName() + ";" + pt.getId() + ";" + pt.getAge() + ";" + pt.getWeight() + ";"
						+ patients.get(pt);
				bw.write(toFile);
				bw.newLine();
			}
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void readFromFile(String filePath) {

		File file = new File(filePath);
		if (!file.exists()) {
			System.out.println("Sorry file not exist");
			return;
		}
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while (true) {

				String line = br.readLine();
				if (line == null) {
					break;
				}
				String[] arr = line.split(";");
				String name = arr[0];
				int id = Integer.parseInt(arr[1]);
				int age = Integer.parseInt(arr[2]);
				double weight = Double.parseDouble(arr[3]);
				Patient pt = new Patient(name, id, age, weight);
				patients.put(pt, arr[4]);

			}
			br.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
