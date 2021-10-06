import java.util.Scanner;




public class ZeroTheHero {
	

	private static Scanner s=new Scanner (System.in);

	public static int a[][]=new int[3][3];
	public static int b[][]=new int[3][3];
  
    public static void main(String[]args) throws Exception
    {
    	for (int k=0;k<30;k++)
			System.out.print(' ');
		System.out.println("WELCOME TO 0-THE HERO");
		System.out.println();
		System.out.println("RULES");
		System.out.println("--> Grid should contain all 9 elements");
		System.out.println("--> All 9 numbers should be different and within the range given");
		System.out.println();
		System.out.println();
		System.in.read();
		
		System.out.println("\n SELECT YOUR TYPE OF GAME : ");
		System.out.println("1.COMPLETE HOUSE SQUAD");
		System.out.println("2.AIM THE  DIAGONAL ");
		System.out.println("3.EXIT");
		System.out.println("\n\nEnter your mode : ");
		int choice=mainmenu();
		 
		if(choice==1)
		{
			Allelements();
		}
		if(choice==2)
		{
			diagonal();
		}
		if(choice==3)
		{
			System.out.println("Exiting...");
			 System.exit(0);
		}
		
		
		System.out.println();
    }
	public static void Allelements () throws Exception {
		
		System.out.println("\n\n\n\n\n");
		for (int k=0;k<30;k++)
			System.out.print(' ');
		System.out.println("Welcome to COMPLETE HOUSE SQUAD");
		System.out.println("\n\n--> Enter your choice : Single Player(1)\n"
				+ "                        Dual Player (2)");
		int ch=player();
		 int ac=0,bc=0;
		//Taking input  
		input(a,1);
		 if(ch==2)
		 {
			 input(b,1);
		 }
		 //generating a random number 
		 int x ;
		 //checking for the integer in the grid
		 int i=20;
		while(i!=0)
		 {
			 x = (int)(Math.random() * (20- 1 + 1) + 1);
			 ac=check(a,x,ac,1);
			 if(ch==2)
			 {
				bc= check(b,x,bc,2);
			 }
			 System.out.println("\n\n\n\nNUMBER GENERATED : "+x);
			 //Displaying output
			 System.out.println("\n\nYOUR UPGRADED GRID");
			 System.in.read();
			 System.out.println("Player 1 : ");
			 output(a);
			
			 if(ch==2)
			 {
				 System.out.println("\n\nPLAYER 2 : ");
				 output(b);
				 System.in.read();
			  
			 }
			 //Checking for winning player
			 if(ac==9)
			 {
				 System.out.println("\n\nPLAYER 1 WON "); 
				 break;
			 }
			     else
			    	 if(bc==9)
			 {
				 System.out.println("\n\nPLAYER 2 WON ");	
			     break;
			 }
			 --i;
			 System.out.println("\n\n\nNumber Of Trials Remaining : "+ i);
			 System.out.println("\n\n\n----------------------------------------------------------------- ");
			 System.in.read();
			
		 }
		System.out.println("\n\nUh Oh.....Better Luck Next Time!!");
		System.out.println("\n\nExiting........");
		 System.exit(0);
		
		
	}
	
	public static void  diagonal() throws Exception
	{
		System.out.println("\n\n\n\n\n");
		for (int k=0;k<30;k++)
			System.out.print(' ');
		System.out.println("Welcome to AIM THE DIAGONAL");
		System.out.println("\n\n--> Enter your choice : Single Player(1)\n"
				+ "                        Dual Player (2)");
		int ch=player();
		 int ac=0,bc=0;
		//Taking input  
		input(a,1);
		 if(ch==2)
		 {
			 input(b,1);
		 }
		 //generating a random number 
		 int x ,i=10;
		 while(i!=0)
		 {
			 x = (int)(Math.random() * (20 - 1 + 1) + 1);
			 ac=check(a,x,ac,2);
			 if(ch==2)
			 {
				bc= check(b,x,bc,2);
			 }
			 System.out.println("\n\nNumber generated : "+x);
			 //Displaying output
			 System.out.println("\n\nYour Updated Grid:");
			 System.out.println("\n\nPlayer 1 : ");
			 output(a);
			 if(ch==2)
			 {
				 System.out.println("\n\nPlayer 2 : ");
				 output(b);
			  
			 }
			 //Checking for winning player
			 if(ac==3)
			 {
				 System.out.println("\n\nPLAYER 1 WON "); 
				 break;
			 }
			     else
			    	 if(bc==3)
			 {
				 System.out.println("\n\nPLAYER 2 WON ");	
			     break;
			 }
			 --i;
			 System.out.println("\n\n\nNumber Of Trials Remaining : "+ i);
		 }
		 System.out.println("\n\nUh Oh.....Better Luck Next Time!!");
		 System.out.println("\n\nExiting........");
		 System.exit(0);
		
	}
	

	public static int mainmenu() throws Exception 
	{
		
       while(true) {
        int ch;	
		try
		{
			ch= s.nextInt();
			if(ch==1 || ch==2)
			return ch;
			else
				if(ch==3)
				return ch;	
		        else
			    throw new Exception("Wrong entry ") ;	
			
		}
		catch(Exception e)
		{
			
		    System.out.print("\n\nThat’s not a valid entry.Try again: ");
			
		}
		
        
	}
	}
	
	public static int player() throws Exception 
	{
		
       while(true) {
        int ch;	
		try
		{
			ch= s.nextInt();
			if(ch==1 || ch==2)
			return ch;
			else
			throw new Exception("Wrong entry ") ;	
			
		}
		catch(Exception e)
		{
			
		    System.out.print("That’s not a valid entry.Try again: ");
			
		}
		
        //System.out.print("That’s not an integer. Try again: ");
	}
	}
	
	private static void input(int a[][],int n)
	{
		
		System.out.println("\n\nEnter grid for player "+n+"\n All numbers should be in the range of 1-20");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
			a[i][j]=s.nextInt();
		
	}
	private static void output(int a[][])
	{
		for(int i=0;i<3;i++)
			{ 
			  for(int j=0;j<3;j++)
				System.out.print("   "+a[i][j]);
			    System.out.println();
			}
		
	}
	
    private static int check(int a[][],int n,int ac,int c)
     	{
		
		
		  for(int j=0;j<3;j++)
			for(int i=0;i<3;i++)
			{ 
			  if(a[j][i]==n)
			  { a[j][i]=0;
			    if(c==1)
			    ac++;}  
			 
			  if(c==2)
			   {
			     	if(a[j][j]==0)  
				    ac++;	
			    }
			 
			  
				  
			} 
		 
			  
		  return ac;
		    
		
	
     	}
  
   
}
