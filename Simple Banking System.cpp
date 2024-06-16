#include<iostream.h>

void showMenu()
{
    cout << "Simple Banking System" <<endl;
    cout << "1. Check Balance" <<endl;
    cout << "2. Deposit Money" <<endl;
    cout << "3. Withdraw Money" <<endl;
    cout << "4. Exit" <<endl;
    cout << "Enter your choice: ";
}
                                    
int main()
{
    int choice;
    double balance = 0.0;
    double amount;
                                    
    do 
    {
        showMenu();
        cin >> choice;
                                    
        switch(choice) 
        {
            case 1:
            cout << "Your current balance is: $" << balance << endl;
            break;
            case 2:
            cout << "Enter amount to deposit: $";
            cin >> amount;
            if (amount > 0) 
            {
                balance += amount;
                cout << "Deposit successful. Your new balance is: $" << balance << endl;
            } 
            else
            {
                cout << "Invalid amount. Please enter a positive value." << endl;
            }
            break;
            case 3:
            cout << "Enter amount to withdraw: $";
            cin >> amount;
            if (amount > 0 && amount <= balance) 
            {
                balance -= amount;
                cout << "Withdrawal successful. Your new balance is: $" << balance << endl;
            } 
            else
            {
                cout << "Invalid amount. Please enter a value less than or equal to your balance." << endl;
            }
            break;
            case 4:
            cout << "Exiting..." << endl << "Thankyou for using this service";
            break;
            default:
            cout << "Invalid choice! Please try again." << endl;
        }
                                    
        cout << endl; 
    } while (choice != 4);
                                    
    return 0;
}               