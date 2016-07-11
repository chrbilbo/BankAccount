/*
Christina Bilbo
Project Week 4
February 8, 2015
 */
package cbilbo_project_week_4;

import java.util.Scanner;

/**
 *
 * @author cbilbo
 */
public class BankAccount {

    private static String accountNumber;
    private String accountHolder;
    private static double currentBalance;
    private int menuChoice;
    private String[] accountArray;
    
    Scanner input = new Scanner(System.in);
    public void Menu()
    {
        System.out.print("******-------MENU-------******\n");
        System.out.print("\nPlease choose an option number.\n");
        System.out.print("1. Create New Account\n");
        System.out.print("2. Delete Account\n");
        System.out.print("3. View Account Info\n");
        System.out.print("4. Make Deposit\n");
        System.out.print("5. Make Withdrawal\n");
        System.out.print("6. Exit Program\n\n");
        
        menuChoice = input.nextInt();
        
        for (int i = 0; i < 6; i++)
        {
            switch (menuChoice)
            {
                case 1:
                    CreateAccount();
                    break;
                case 2:
                    DeleteAccount();
                    break;
                case 3:
                    ViewAccountInfo();
                    break;
                case 4:
                    MakeDeposit();
                    break;
                case 5:
                    MakeWithdrawal();
                    break;
                case 6:
                    ExitProgram();
                    break;
            }
        }
    }
    
    public void CreateAccount()
    {
        int i = 1;
        System.out.print("Account Holder Name --> ");
        accountHolder = input.nextLine();
        accountNumber = Integer.toString(i);
        i++;
        currentBalance = 0.00;
        
        Menu();
    }
    
    public void DeleteAccount()
    {
        System.out.print("Please enter the account number of the account\n");
        System.out.print("that you wish to delete. --> ");
        accountNumber = input.nextLine();
        
        Menu();
    }
    
    public void ViewAccountInfo()
    {
        String number; 
        
        System.out.print("Please enter the account number of the\n");
        System.out.print("account you would like to view --> ");
        number = input.nextLine();
        accountNumber = number;
        
        Menu();
    }
    
    public void MakeDeposit()
    {
        double deposit;
        double balance;
        
        System.out.print("\nPlease enter the amount you wish to deposit --> ");
        deposit = input.nextDouble();
        balance = currentBalance + deposit;
        
        Menu();
    }
    
    public void MakeWithdrawal()
    {
        double withdraw;
        double balance;
        
        System.out.print("\nPlease enter the amount you wish to withdraw --> ");
        withdraw = input.nextDouble();
        balance = currentBalance - withdraw;
        
        Menu();
    }
    
    public void ExitProgram()
    {
        System.exit(0);
    }
    public static void main(String[] args) {
        
        BankAccount myBankAccount = new BankAccount();
        
        myBankAccount.Menu();
        
        }
        
    }