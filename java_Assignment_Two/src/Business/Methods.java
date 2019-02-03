
package Business;

import java.util.Scanner;

public class Methods 
{
    Product P = new Product();
    Scanner scan = new Scanner(System.in);
    int choice = 0;
    int repeat = 0;
    //OPTION SELECTION
    public void options()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n" + "----------------------------CHOOSE OPTION----------------------------");
        System.out.println("1. Enter a new product\n" + "2. Exit\n");
        System.out.print("You choice is : ");
        choice = scan.nextInt();
        scan.nextLine();
        switch(choice)
        {
            case 1 : createProduct(); break;
            case 2 : System.out.println("----------------------------Thankyou----------------------------");break;
            default: System.out.println("Error: Invalid Input, Please select correct option");
                     options();
                     break;
        }
                     
    }
   //CREATE PRODUCTS
    public void createProduct()
    {
         System.out.print("\n" + "----------------------------CREATING NEW PRODUCT----------------------------" + "\n");
         System.out.print("Enter name of the product : ");
         P.setProduct_name(scan.nextLine());
         System.out.print("Enter price of the product : ");
         P.setPrice(scan.nextDouble());
         scan.nextLine();
         System.out.print("Enter description of the product : ");
         P.setDescription(scan.nextLine());
         System.out.print("Enter availability of the product : ");
         P.setAvailability_number(scan.nextInt());
         scan.nextLine();
         System.out.print("Enter supplier name of the product : ");
         P.getSupplier().setSupplier_name(scan.nextLine());
         System.out.print("Enter supplier address of the product : ");
         P.getSupplier().setSupplier_address(scan.nextLine());
         
                         
         do
         {
            System.out.println("\n" + "----------------------------CHOOSE OPTION----------------------------");
            System.out.println("1. Update an existing product\n" + "2. View the product\n" + "3. Exit\n");
            System.out.print("You choice is : ");
            choice = scan.nextInt();
            scan.nextLine();
            switch(choice)
            {
                case 1 : updateProduct();break;
                case 2 : viewProduct(); break;
                case 3 : System.out.println("----------------------------Thankyou----------------------------"); break;
                default: System.out.println("Error: Invalid Input, Please select correct option");
                         repeat = 1;
                         break;
            }
         }while(repeat == 1);
    }
    //VIEW PRODUCTS
    public void viewProduct()
    {
        System.out.println("\n" + "----------------------------VIEWING PRODUCT DETAILS----------------------------");
        System.out.println("name of the product : " + P.getProduct_name());
        System.out.println("price of the product : " + P.getPrice() );
        System.out.println("availability of the product : " + P.getAvailability_number());
        System.out.println("description of the product : " + P.getDescription());
        System.out.println("supplier name of the product : " + P.getSupplier().getSupplier_name());
        System.out.println("supplier address of the product : "  + P.getSupplier().getSupplier_address());
        
        do
        {
          System.out.println("\n" + "----------------------------CHOOSE OPTION----------------------------");
          System.out.println("1. Update an existing product\n" + "2. Create the product\n" + "3. Exit\n");
          System.out.print("You choice is : ");
          choice = scan.nextInt();
          scan.nextLine();
          switch(choice)
            {
                case 1 : updateProduct();break;
                case 2 : createProduct();break;
                case 3 : System.out.println("----------------------------Thankyou----------------------------");break;
                default: System.out.println("Error: Invalid Input, Please select correct option");   
                         repeat = 1;
                         break;
            }  
        }while(repeat == 1);
        
    }
    //UPDATE PRODUCTS
    public void updateProduct()
    {
       int choice_2 = 0;
       System.out.println("\n" + "----------------------------UPDATING PRODUCT DETAILS----------------------------" );
       System.out.println("Do you want to update:\n" +"1. Product name\n" + "2. Price\n" + "3. Availability\n" + "4. Description\n" + "5. Supplier name\n"+ "6. Supplier address\n");
       System.out.print("You choice is : ");
       choice = scan.nextInt();
       scan.nextLine();
       if(choice == 1)
       {
         System.out.print("Enter name of the product : ");
         P.setProduct_name(scan.nextLine()); 
         System.out.println("SUCCESS : product name updated\n");
       }
       else if(choice == 2)
       {
         System.out.print("Enter price of the product : ");
         P.setPrice(scan.nextDouble());
         System.out.println("SUCCESS : product price updated");
       }
       else if(choice == 3)
       {
         System.out.print("Enter availability of the product : ");
         P.setAvailability_number(scan.nextInt());
         System.out.println("SUCCESS : product availability updated");         
       }
       else if(choice == 4)
       {
         System.out.print("Enter description of the product : ");
         P.setDescription(scan.nextLine());
         System.out.println("SUCCESS : product description updated");
       }
       else if(choice == 5)
       {
         System.out.print("Enter supplier name of the product : ");
         P.getSupplier().setSupplier_name(scan.nextLine());
         System.out.println("SUCCESS : Supplier name updated");
       }
       else if(choice == 6)
       {
         System.out.print("Enter supplier address of the product : ");
         P.getSupplier().setSupplier_address(scan.nextLine());
         System.out.println("SUCCESS : Supplier address updated");
       }
       
       do
       {
           System.out.println("\n" + "----------------------------CHOOSE OPTION----------------------------");
           System.out.println("Enter the choice\n" + "1. View an existing product\n" + "2. Create the product\n" + "3. Update other fields" + "4. Exit\n");
           System.out.print("You choice is : ");
           choice_2 = scan.nextInt();
           scan.nextLine();
           switch(choice_2)
            {
                case 1 : viewProduct();break;
                case 2 : createProduct();break;
                case 3 : viewProduct();break;
                case 4 : System.out.println("----------------------------Thankyou----------------------------");break;
                default: System.out.println("Error: Invalid Input, Please select correct option"); 
                         repeat = 1;
                         break;           
            }
       }while(repeat == 1);
       
    }   
}
