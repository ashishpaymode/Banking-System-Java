import java.util.ArrayList;
import java.util.Scanner;
public class mainPro {
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		String name, city;
		int accono, amt;
		boolean found;
		ArrayList< Account> list=new ArrayList<>();
		list.add(new Account("Ashish Patil",5000,"Pune"));
		list.add(new Account("Aditya Patil",9000,"Shirur"));
		list.add(new Account("Devansh Patil",6000,"Parner"));

		
		System.out.println("1. Login as Administrator ");
		System.out.println("2. Login as Customer ");
		
		int login;
		 do {
		login = sc.nextInt();
		switch(login) {
		case 1:
			System.out.println(" Login Successfully as Administrator ");
			System.out.println("          ");
			System.out.println("1. Add new customer ");
			System.out.println("2. Search Details ");
			System.out.println("3. Modify Details ");
			System.out.println("4. Balance Enquiry ");
			int select;
			select = sc.nextInt();
			switch(select) {
			case 1:
				
				System.out.print("Enter the Name ");
				name = sc.next();
				System.out.println("Enter the Amount ");
				amt = sc.nextInt();
				System.out.println("Enter the city ");
				city = sc.next();
				Account acc = new Account(name,amt, city);
				list.add(acc);
				System.out.println("Account Opened... ");
				break;
				
			case 2:
				
				System.out.println("Enter Account No.");
				for(Account ac : list){
					accono = sc.nextInt();
					if(accono == ac.getAccno()) {
						found = true;
						System.out.println("Customer Name "+ac.getName());
						System.out.println("Account Balance "+ac.getBal());
						System.out.println("City "+ac.getCity());
						break;
						
			}
				}
				break;
			case 3:
				System.out.println("Modify Details");
				System.out.println("		");
				System.out.println("Enter Account No.");
				for(Account ac : list){
					accono = sc.nextInt();
					if(accono == ac.getAccno()) {
						found = true;
						System.out.println("Customer Name "+ac.getName());
						System.out.println("Account Balance "+ac.getBal());
				
						
					break;	
						
			}
				}
				
				
				break;
			case 4: 
				System.out.println("Balance Enquiry");
				found=false;
				System.out.print("Enter the Account Number ");
				accono = sc.nextInt();
				for(Account ac : list){
					if(accono == ac.getAccno()) {
						found = true;
						System.out.println("Account Balance "+ac.getBal());
						break;
					}
					}
			
				}
		
			break;	
		case 2:
			System.out.println("Login Successfully as Customer ");
			System.out.println("	 ");
			System.out.println("1. Deposit Money");
			System.out.println("2. Withdraw Money ");
			System.out.println("3. Transfer Money ");
			int turn;
			turn = sc.nextInt();
			switch(turn) {
			case 1:
				
				System.out.println("Account Deposit ");
				found=false;
				System.out.print("Enter the Account Number ");
				accono = sc.nextInt();
				for(Account ac : list){
					if(accono == ac.getAccno()) {
						found = true;
						System.out.println("Customer Name "+ac.getName());
						System.out.println("Account Balance "+ac.getBal());
						
						System.out.println("\n Enter the deposit Amount ");
						amt = sc.nextInt();
						ac.setBal(ac.getBal()+ amt);
						System.out.println("Deposit Successfully ");
						break;
					}
				
				
				}
				if(!found) {
					System.out.println("Invalid Account No. ");
				}
				break;
			case 2:
				System.out.println("Account Withdraw ");
				found=false;
				System.out.print("Enter the Account Number ");
				accono = sc.nextInt();
				for(Account ac : list){
					if(accono == ac.getAccno()) {
						found = true;
						System.out.println("Customer Name "+ac.getName());
						System.out.println("Account Balance "+ac.getBal());
						
						System.out.println("\n Enter the Amount to Withdraw ");
						amt = sc.nextInt();
						if(amt<=ac.getBal()) {
						ac.setBal(ac.getBal()- amt);
						System.out.println("Withdraw Successfully ");
						}
						else {
							System.out.println("Insufficient Balance ");
						}
						break;
					}
				}
				if(!found) {
					System.out.println("Invalid Account No. ");
				}
				break;
			case 3:
				System.out.println("Account Transfer ");
				found=false;
				System.out.print("Enter the Account Number ");
				accono = sc.nextInt();
				for(Account ac : list){
					if(accono == ac.getAccno()) {
						found = true;
						System.out.println("Customer Name "+ac.getName());
						System.out.println("Account Balance "+ac.getBal());
						
						System.out.println("\n Enter the Transfer Amount ");
						amt = sc.nextInt();
						ac.setBal(ac.getBal()+ amt);
						System.out.println("Transfer Successfully ");
					
			
					}
					
				
			}
				break;
			
			}

	

		}
		}while(login!=3);
		
	}
	}


