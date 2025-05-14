class simpint
{
public static void main(String args[])
	{
	float sint, rate, tot;
	int time, pamt;
	
	pamt = 50000;
	rate = 5;
	time = 4;
	
	System.out.println("Initial amount: Rs." + pamt);
	System.out.println("Rate of interest: " + rate + "%");
	System.out.println("Time: " + time + " years");
	
	sint = (pamt*rate*time)/100;
	tot = pamt + sint;

	System.out.println("");
	System.out.println("Interest: " + sint);
	System.out.println("Total amount: " + tot#include <iostream.h>
#include <fstream.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>
using namespace std;

class bank {
private:
    char name[100];
    int Acc_no;
    char Acc_type[10];  // Savings or Current
    float balance;
    int pin, entered_pin;
    int choice1;

public:
    bank() { balance = 0.0; }

    void get() {
        clrscr();
        cout << "Enter your Name: ";
        gets(name);

        cout << "Enter your Account Number: ";
        cin >> Acc_no;
        cin.ignore();

        // Load the account data if it already exists
        load_account_data();

        // If the account is not found, ask for account type and pin
        if (balance == 0.0) {
            do {
                cout << "Select Account Type (Savings/Current): ";
                cin >> Acc_type;
                if (strcasecmp(Acc_type, "Savings") != 0 && strcasecmp(Acc_type, "Current") != 0) {
                    cout << "Invalid Account Type! Please enter either 'Savings' or 'Current'.\n";
                }
            } while (strcasecmp(Acc_type, "Savings") != 0 && strcasecmp(Acc_type, "Current") != 0);

            cout << "Set your 4-digit PIN: ";
            cin >> pin;
            save_account();
        }
    }

    void save_account() {
        ofstream file("accounts.txt", ios::app);
        file << Acc_no << " " << name << " " << Acc_type << " " << balance << " " << pin << "\n";
        file.close();
    }

    void load_account_data() {
        ifstream file("accounts.txt");
        int acc, acc_pin;
        char acc_name[100], acc_type[10];
        float acc_balance;
        bool account_found = false;

        while (file >> acc >> acc_name >> acc_type >> acc_balance >> acc_pin) {
            if (acc == Acc_no) {
                balance = acc_balance;
                strcpy(name, acc_name);
                strcpy(Acc_type, acc_type);
                pin = acc_pin;
                account_found = true;
                break;
            }
        }

        file.close();
        
        // If account is not found, balance remains 0.0 and user will set it up
        if (!account_found) {
            cout << "Account not found! Creating a new account...\n";
        }
    }

    void update_account_balance() {
        ifstream file("accounts.txt");
        ofstream temp("temp.txt");
        int acc, acc_pin;
        char acc_name[100], acc_type[10];
        float acc_balance;

        while (file >> acc >> acc_name >> acc_type >> acc_balance >> acc_pin) {
            if (acc == Acc_no) {
                acc_balance = balance;
            }
            temp << acc << " " << acc_name << " " << acc_type << " " << acc_balance << " " << acc_pin << "\n";
        }

        file.close();
        temp.close();

        remove("accounts.txt");
        rename("temp.txt", "accounts.txt");
    }

    void authenticate() {
        do {
            cout << "\nEnter your PIN: ";
            cin >> entered_pin;
            if (entered_pin != pin) {
                cout << "Incorrect PIN! Try again.\n";
            }
        } while (entered_pin != pin);
    }

    void transaction() {
        authenticate();
        float withdraw;
        cout << "Enter the amount to Withdraw: ";
        cin >> withdraw;
        if (withdraw > balance) {
            cout << "Insufficient balance!\n";
        } else if (withdraw <= 0) {
            cout << "Invalid amount!\n";
        } else {
            balance -= withdraw;
            save_transaction("Withdrawal", withdraw);
            cout << "Withdrawal successful! Current balance: Rs." << balance << "\n";
            update_account_balance();
        }
    }

    void deposited() {
        authenticate();
        float deposit;
        cout << "Enter the amount to Deposit: ";
        cin >> deposit;
        if (deposit <= 0) {
            cout << "Invalid deposit amount!\n";
        } else {
            balance += deposit;
            save_transaction("Deposit", deposit);
            cout << "Deposit successful! Current balance: Rs." << balance << "\n";
            update_account_balance();
        }
    }

    void save_transaction(const char* type, float amount) {
        ofstream file("transactions.txt", ios::app);
        file << Acc_no << " " << type << " " << amount << "\n";
        file.close();
    }

    void check_balance() {
        authenticate();
        cout << "Your Current Balance: Rs." << balance << "\n";
    }

    void show_transactions() {
        authenticate();
        ifstream file("transactions.txt");
        int acc;
        char type[10];
        float amount;
        cout << "\nTransaction History:\n";
        bool found = false;
        while (file >> acc >> type >> amount) {
            if (acc == Acc_no) {
                cout << type << " of Rs." << amount << "\n";
                found = true;
            }
        }
        if (!found) {
            cout << "No transactions found.\n";
        }
        file.close();
    }

    void transaction_menu() {
        do {
            cout << "\nTransaction Menu\n";
            cout << "\n";
            cout << "1. Deposit Amount\n2. Withdraw Amount\n";
            cout << "3. Check Balance\n4. View Transactions\n5. Exit\n";
            cout << "Enter your choice: ";
            cin >> choice1;

            switch (choice1) {
                case 1: deposited(); break;
                case 2: transaction(); break;
                case 3: check_balance(); break;
                case 4: show_transactions(); break;
                case 5:
                    cout << "Thank you for banking with us!\n";
                    return;
                default:
                    cout << "Invalid choice! Try again.";
            }
        } while (1);
    }
};

void main() {
    clrscr();
    cout << "\n";
    cout << "Bank Of Students\n";
    cout << "\n\n";
    
    bank customer;
    customer.get();
    customer.transaction_menu();
    
    getch();
}
);
	}
}