import java.util.*;
class Hospital{
	
	
	private int Patientno;
	private String Pname;
	private int MedicalBill;
	
	Hospital(int Patientno,String Pname,int MedicalBill){
		this.Patientno = Patientno;
		this.Pname = Pname;
		this.MedicalBill=MedicalBill;
	}
	public int getPatientno(){
		return Patientno;
	}
	public int getMedicalBill(){
		return MedicalBill;
	
	}
	public String getPname(){
		return Pname;
	}
	public String toString(){
		return Patientno+" "+Pname+" "+MedicalBill;
	}
}

class HospitalCRUD{
	public static void main(String[] args){
		ArrayList< Hospital> c= new ArrayList< Hospital>(); 
		Scanner s=new Scanner(System.in);
		int ch;
		do{
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Delete");
			System.out.println("5.Update");	
			System.out.println("Enter your choice : ");
			ch=s.nextInt();

			switch(ch){
				case 1:
					System.out.println("Enter Patientno : ");
					int Patientno = s.nextInt();
					s.nextLine();
					System.out.println("Enter Patient Name : ");
					String Pname = s.nextLine();
						
					System.out.println("Enter Medical Bill : ");
					int MedicalBill = s.nextInt();
				
					c.add(new  Hospital(Patientno,Pname,MedicalBill));
					//System.out.println(c);
					break;
				case 2:
					//System.out.println(c);
					System.out.println("___________________________________________________");
					Iterator< Hospital> i=c.iterator();
					while(i.hasNext())
					{
						 Hospital h=i.next();
						System.out.println(h);
						//System.out.println(i.next());
					}
					System.out.println("___________________________________________________");
					
					
						
					
					break;
				case 3:
					System.out.println("enter Patient id to search");
					int n=s.nextInt();
					int found=0;
					System.out.println("___________________________________________________");
						
					i=c.iterator();
					
					while(i.hasNext())
					{
						 Hospital h=i.next();
						if(h.getPatientno()==n)
						{
							System.out.println(h);
							found=1;
						}
						
					}
					if(found==0)
					{
						System.out.println("enter valid Patient number");
					}
					System.out.println("___________________________________________________");
					
						break;
				case 4:
					System.out.println("enter patient number to be deleted");
					 n=s.nextInt();
					
					 i=c.iterator();
					 found=0;
					
					while(i.hasNext())
					{
						try{

						Hospital h=i.next();
						
						
						if(h.getPatientno()==n)
						{
							c.remove(h);  
							System.out.println("data deleted");
							found=1;
							
							
						}
						}
						catch(Exception e){
							break;}
													

					}
					if(found==0)
					{
						System.out.println("enter valid patient number");
					}
						
					
						break;
				case 5:
					System.out.println("enter patient id to be updated");
					 n=s.nextInt();
					
					 i=c.iterator();
					found=0;
					int x=0;
					
					while(i.hasNext())
					{
						Hospital h=i.next();
						
						
						x=x+1;
						if(h.getPatientno()==n)
						{
							System.out.println("Enter Patient number : ");
							 Patientno = s.nextInt();
							s.nextLine();
							System.out.println("Enter patient Name : ");
							 Pname = s.nextLine();
						
							System.out.println("Enter  Medical bill : ");
							 MedicalBill = s.nextInt();
							
							c.set(x-1,new Hospital(Patientno, Pname,MedicalBill));
							found=1;							
						}
						

					}
					if(found==0)
						{
							System.out.println("enter valid Patient number");
						}
						
						
						
					
					
					
				}
				
				
				
		}while(ch!=0);
	}
}


		
	
	
