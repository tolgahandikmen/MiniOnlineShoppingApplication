import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadFile {
	public Items[] readFileItems(String file, String filecommand) {
		BufferedReader br1 = null;
		BufferedReader br = null;
		String line = "";
		String line1 = "";
		int i = 0;
		try {
			br = new BufferedReader(new FileReader(file));
			br1 = new BufferedReader(new FileReader(filecommand));
			int extraItem = 0;
			while ((line1 = br1.readLine()) != null) {
				String[] word = line1.split("\t");

				if (word[0].equals("ADDITEM")) {
					extraItem++;
				}
			}
			int itemId = 1;
			int length = Files.readAllLines(Paths.get(file), Charset.forName("Cp1252")).size() + extraItem;
			;
			Items[] item = new Items[length];

			while ((line = br.readLine()) != null) {
				String[] word = line.split("\t");

				if (word[0].equals("BOOK")) {
					int temp_cost = Integer.parseInt(word[1]);
					int temp_date = Integer.parseInt(word[2]);
					String[] authors = word[5].split(",");
					int temp_number = Integer.parseInt(word[6]);
					item[i++] = new Book(temp_cost, temp_date, word[3], word[4], authors, temp_number, itemId);
					itemId++;
				} else if (word[0].equals("LAPTOP")) {
					int temp_cost = Integer.parseInt(word[1]);
					int temp_maxVolt = Integer.parseInt(word[4]);
					int temp_maxWatt = Integer.parseInt(word[5]);
					int temp_ram = Integer.parseInt(word[8]);
					int temp_hdd = Integer.parseInt(word[9]);
					int temp_hdmi = Integer.parseInt(word[10]);
					item[i++] = new Laptop(temp_cost, word[2], word[3], temp_maxVolt, temp_maxWatt, word[6], word[7],
							temp_ram, temp_hdd, temp_hdmi, itemId);
					itemId++;
				} else if (word[0].equals("TV")) {
					int temp_cost = Integer.parseInt(word[1]);
					int temp_maxVolt = Integer.parseInt(word[4]);
					int temp_maxWatt = Integer.parseInt(word[5]);
					int temp_screeensize = Integer.parseInt(word[6]);
					item[i++] = new TV(temp_cost, word[2], word[3], temp_maxVolt, temp_maxWatt, temp_screeensize,
							itemId);
					itemId++;
				} else if (word[0].equals("SMARTPHONE")) {
					int temp_cost = Integer.parseInt(word[1]);
					int temp_maxVolt = Integer.parseInt(word[4]);
					int temp_maxWatt = Integer.parseInt(word[5]);
					item[i++] = new SmartPhone(temp_cost, word[2], word[3], temp_maxVolt, temp_maxWatt, word[6],
							itemId);
					itemId++;
				} else if (word[0].equals("DESKTOP")) {
					int temp_cost = Integer.parseInt(word[1]);
					int temp_maxVolt = Integer.parseInt(word[4]);
					int temp_maxWatt = Integer.parseInt(word[5]);
					int temp_ram = Integer.parseInt(word[8]);
					int temp_hdd = Integer.parseInt(word[9]);
					item[i++] = new Desktop(temp_cost, word[2], word[3], temp_maxVolt, temp_maxWatt, word[6], word[7],
							temp_ram, temp_hdd, word[10], itemId);/* contructor */
					itemId++;
				} else if (word[0].equals("SKINCARE")) {
					int temp_cost = Integer.parseInt(word[1]);
					int temp_organic = Integer.parseInt(word[4]);
					int temp_date = Integer.parseInt(word[5]);
					int temp_weight = Integer.parseInt(word[6]);
					int temp_babySensitive = Integer.parseInt(word[6]);
					item[i++] = new SkinCare(temp_cost, word[2], word[3], temp_organic, temp_date, temp_weight,
							temp_babySensitive, itemId);
					itemId++;
				} else if (word[0].equals("HAIRCARE")) {
					int temp_cost = Integer.parseInt(word[1]);
					int temp_organic = Integer.parseInt(word[4]);
					int temp_date = Integer.parseInt(word[5]);
					int temp_weight = Integer.parseInt(word[6]);
					int temp_medicate = Integer.parseInt(word[6]);
					item[i++] = new HairCare(temp_cost, word[2], word[3], temp_organic, temp_date, temp_weight,
							temp_medicate, itemId);
					itemId++;
				} else if (word[0].equals("PERFUME")) {
					int temp_cost = Integer.parseInt(word[1]);
					int temp_organic = Integer.parseInt(word[4]);
					int temp_date = Integer.parseInt(word[5]);
					int temp_weight = Integer.parseInt(word[6]);
					int temp_lastingDuration = Integer.parseInt(word[6]);
					item[i++] = new Perfume(temp_cost, word[2], word[3], temp_organic, temp_date, temp_weight,
							temp_lastingDuration, itemId);
					itemId++;
				} else if (word[0].equals("CDDVD")) {
					int temp_cost = Integer.parseInt(word[1]);
					int temp_date = Integer.parseInt(word[2]);
					String[] songs = word[5].split(",");
					item[i++] = new CD_DVD(temp_cost, temp_date, word[3], word[4], songs, itemId);
					itemId++;
				} else if (word[0].equals("TABLET")) {
					int temp_cost = Integer.parseInt(word[1]);
					int temp_maxVolt = Integer.parseInt(word[4]);
					int temp_maxWatt = Integer.parseInt(word[5]);
					int temp_ram = Integer.parseInt(word[8]);
					int temp_hdd = Integer.parseInt(word[9]);
					int temp_dimension = Integer.parseInt(word[10]);
					item[i++] = new Tablet(temp_cost, word[2], word[3], temp_maxVolt, temp_maxWatt, word[6], word[7],
							temp_ram, temp_hdd, temp_dimension, itemId);
					itemId++;
				}

			}
			return item;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br1.close();
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;

	}

	public Person[] readFileUsers(String file, String filecommand) {

		BufferedReader br1 = null;
		BufferedReader br = null;
		String line = "";
		String line1 = "";
		int i = 0;
		try {
			br = new BufferedReader(new FileReader(file));
			br1 = new BufferedReader(new FileReader(filecommand));
			int extraCustomer = 0;
			while ((line1 = br1.readLine()) != null) {
				String[] word = line1.split("\t");

				if (word[0].equals("ADDCUSTOMER") || word[0].equals("ADDADMIN") || word[0].equals("ADDTECH")) {
					extraCustomer++;
				}
			}

			int length = Files.readAllLines(Paths.get(file), Charset.forName("Cp1252")).size() + extraCustomer;
			Person[] person = new Person[length];
			int costumerId = 1;
			DateFormat Date_Format = new SimpleDateFormat("dd.MM.yyyy");
			while ((line = br.readLine()) != null) {
				String[] word = line.split("\t");

				if (word[0].equals("ADMIN")) {
					double temp_salary = Double.parseDouble(word[4]);
					try {
						Date birth = Date_Format.parse(word[3]);
						person[i++] = new Admin(word[1], word[2], birth, temp_salary, word[5]);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else if (word[0].equals("TECH")) {
					double temp_salary = Double.parseDouble(word[4]);
					int temp_senior = Integer.parseInt(word[5]);
					try {
						Date birth = Date_Format.parse(word[3]);
						person[i++] = new Technician(word[1], word[2], birth, temp_salary, temp_senior);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else if (word[0].equals("CUSTOMER")) {
					double temp = Double.parseDouble(word[4]);
					try {
						Date birth = Date_Format.parse(word[3]);
						person[i++] = new Customer(word[1], word[2], birth, temp, word[5], costumerId);
						costumerId++;
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}
			return person;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br1.close();
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;

	}

	public void readFileCommands(String file, Person[] persons, Items[] items) {

		BufferedReader br = null;
		String line = "";
		DateFormat Date_Format = new SimpleDateFormat("dd.MM.yyyy");
		try {
			br = new BufferedReader(new FileReader(file));

			while ((line = br.readLine()) != null) {
				String[] word = line.split("\t");
				System.out.print("COMMAND TEXT: ");
				if (word[0].equals("ADDCUSTOMER")) {

					int control = 0;
					for (int i = 0; i < persons.length; i++) {
						if (persons[i] != null) {

							if (persons[i].getName().equals(word[1])) {
								control++;
								double temp = Double.parseDouble(word[5]);
								int j = 0, temp_costumerId = 1;

								for (int k = 0; k < persons.length; k++) {
									if (persons[j] == null) {
										break;
									}
									j++;
									if (persons[k].getCustomerID() != 0) {
										temp_costumerId++;
									}

								}
								Date birth;
								try {
									birth = Date_Format.parse(word[4]);
									persons[j] = new Customer(word[2], word[3], birth, temp, word[6], temp_costumerId);
								} catch (ParseException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

								System.out.println("<" + line + ">");

								break;
							}
						}
					}
					if (control == 0) {
						System.out.println("<" + line + ">");
						System.out.println("No admin person named " + word[1] + " exists!");
					}

				} else if (word[0].equals("SHOWCUSTOMER")) {
					int control = 0;

					for (int i = 0; i < persons.length; i++) {
						if (persons[i] != null) {
							if (persons[i].getName().equals(word[1])) {
								for (int j = 0; j < persons.length; j++) {
									if (persons[j].getCustomerID() == Integer.parseInt(word[2])) {
										control++;
										System.out.println("<" + line + ">");

										System.out.println("Customer name: " + persons[j].getName() + " ID: "
												+ persons[j].getCustomerID() + " e-mail: " + persons[j].getEmail()
												+ " Date of Birth: " + persons[j].getBirthday() + " Status: "
												+ persons[j].getStatus());

										break;
									}
								}

							}
						}
					}
					if (control == 0) {
						System.out.println("<" + line + ">");
						System.out.println("No admin person named " + word[1] + " exists!");
					}
				} else if (word[0].equals("SHOWCUSTOMERS")) {
					int control = 0;

					for (int i = 0; i < persons.length; i++) {
						if (persons[i] != null) {
							if (persons[i].getName().equals(word[1])) {
								control++;
								System.out.println("<" + line + ">");
								for (int j = 0; j < persons.length; j++) {
									if (persons[j] == null) {
										break;
									}
									if (persons[j].getCustomerID() != 0) {
										System.out.println("Customer name: " + persons[j].getName() + " ID: "
												+ persons[j].getCustomerID() + " e-mail: " + persons[j].getEmail()
												+ " Date of Birth: " + persons[j].getBirthday() + " Status: "
												+ persons[j].getStatus());

									}

								}
								break;
							}
						}
					}
					if (control == 0) {
						System.out.println("<" + line + ">");
						System.out.println("No admin person named " + word[1] + " exists!");
					}
				} else if (word[0].equals("ORDER")) {
					System.out.println(word[1]);
				} else if (word[0].equals("SHOWADMININFO")) {
					int control = 0;

					for (int i = 0; i < persons.length; i++) {
						if (persons[i] != null) {
							if (persons[i].getName().equals(word[1])&&persons[i].getClass().getName().equals("Admin")) {
								control++;
								System.out.println("<" + line + ">");
								System.out.println("----------- Admin info -----------");
								System.out.println("Admin name: "+persons[i].getName());
								System.out.println("Admin email: "+persons[i].getEmail());
								System.out.println("Admin date of birth: "+persons[i].getBirthday());
								System.out.println();

								break;
							}

						}
					}
					if (control == 0) {
						System.out.println("<" + line + ">");
						System.out.println("No admin person named " + word[1] + " exists!");
					}
				} else if (word[0].equals("CREATECAMPAIGN")) {
					System.out.println(word[1]);
				} else if (word[0].equals("SHOWCAMPAIGNS")) {
					System.out.println(word[1]);
				} else if (word[0].equals("ADDTOCART")) {
					System.out.println(word[1]);
				} else if (word[0].equals("EMPTYCART")) {
					System.out.println(word[1]);
				} else if (word[0].equals("SHOWORDERS")) {

				} else if (word[0].equals("CHPASS")) {
					int control = 0;

					for (int i = 0; i < persons.length; i++) {
						if (persons[i] != null) {

							if (persons[i].getCustomerID() == Integer.parseInt(word[1])) {
								control++;
								if (persons[i].getPassword().equals(word[2])) {
									persons[i].setPassword(word[3]);
								} else {

									System.out.println("<" + line + ">");

									System.out.println(
											"The given password does not match the current password. Please try again.");
								}

								System.out.println("<" + line + ">");

								System.out.println("The password has been successfully changed.");

								break;
							}
						}
					}
					if (control == 0) {
						System.out.println("<" + line + ">");
						System.out.println("No customer with ID number " + word[1] + " exists!");
					}
				} else if (word[0].equals("DEPOSITMONEY")) {
					System.out.println(word[1]);
				} else if (word[0].equals("SHOWITEMSLOWONSTOCK")) {
					System.out.println(word[1]);
				} else if (word[0].equals("SHOWVIP")) {
					System.out.println(word[1]);
				} else if (word[0].equals("ADDADMIN")) {
					int control = 0;
					for (int i = 0; i < persons.length; i++) {
						if (persons[i] != null) {

							if (persons[i].getName().equals(word[1])) {
								control++;
								double temp = Double.parseDouble(word[5]);
								int j = 0;

								while (persons[j] != null) {
									j++;

								}
								Date birth;
								try {
									birth = Date_Format.parse(word[4]);
									persons[j] = new Admin(word[2], word[3], birth, temp, word[6]);
								} catch (ParseException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

								System.out.println("<" + line + ">");

								break;
							}
						}
					}
					if (control == 0) {
						System.out.println("<" + line + ">");
						System.out.println("No admin person named " + word[1] + " exists!");
					}
				}else if (word[0].equals("ADDTECH")) {
					int control = 0;
					for (int i = 0; i < persons.length; i++) {
						if (persons[i] != null) {

							if (persons[i].getName().equals(word[1])) {
								control++;
								double temp = Double.parseDouble(word[5]);
								int temp_senior = Integer.parseInt(word[6]);
								int j = 0;

								while (persons[j] != null) {
									j++;

								}
								Date birth;
								try {
									birth = Date_Format.parse(word[4]);
									persons[j] = new Technician(word[2], word[3], birth, temp, temp_senior);
								} catch (ParseException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

								System.out.println("<" + line + ">");

								break;
							}
						}
					}
					if (control == 0) {
						System.out.println("<" + line + ">");
						System.out.println("No admin person named " + word[1] + " exists!");
					}
				} else if (word[0].equals("ADDITEM")) {
					System.out.println(word[1]);
				} else if (word[0].equals("LISTITEM")) {
					System.out.println(word[1]);
				} else if (word[0].equals("DISPITEMSOF")) {
					System.out.println(word[1]);
				}

				// person[count].setcID(Integer.parseInt(word[0]));
				// person[count].setFirstName(word[1]);
				// person[count].setLastName(word[2]);

			}
		} catch (

		FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}


}
