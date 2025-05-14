#include <iostream.h>
#include <conio.h>
#include <graphics.h>
#include <fstream.h>
#include <stdio.h>
#include <stdlib.h>

struct Student {
    char name[30];
    int roll;
    float marks ;
};

void saveData() {
    ofstream fout("students.txt", ios::app);
    if (!fout) {
        cout << "\nError: Could not open file!";
        getch();
        return;
    }
    Student s;
    cout << "\nEnter Student Name: ";
    gets(s.name);  // Allows spaces
    cout << "Enter Roll No: ";
    cin >> s.roll;
    cout << "Enter Marks: ";
    cin >> s.marks;
    
    fout << s.name << " " << s.roll << " " << s.marks << "\n";
    fout.close();
    cout << "\nData Saved Successfully!";
}

void displayData() {
    ifstream fin("students.txt");
    if (!fin) {  
        cout << "\nError: File not found or empty!";
        getch();
        return;
    }
    
    Student s;
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "C:\\TURBOC3\\BGI");  // Verify this path
    
    setcolor(WHITE);
    rectangle(50, 50, 450, 400);  // Outer box
    line(50, 100, 450, 100);      // Header line
    line(150, 50, 150, 400);      // Column separators
    line(300, 50, 300, 400);  

    settextstyle(SANS_SERIF_FONT, HORIZ_DIR, 1);
    outtextxy(60, 60, "Name");
    outtextxy(180, 60, "Roll No");
    outtextxy(330, 60, "Marks");

    int y = 120;
    char buffer[50];
    while (fin >> s.name >> s.roll >> s.marks) {
        outtextxy(60, y, s.name);
        sprintf(buffer, "%d", s.roll);
        outtextxy(180, y, buffer);
        sprintf(buffer, "%.2f", s.marks);
        outtextxy(330, y, buffer);
        y += 40;
        if (y > 400) {
            outtextxy(60, 420, "Too many records!");
            break;
        }
    }
    
    fin.close();
    getch();
    closegraph();
}

int main() {
    int choice;
    while (1) {
        clrscr();
        cout << "\n1. Enter Student Data";
        cout << "\n2. Show Student Data (Graphics)";
        cout << "\n3. Exit";
        cout << "\nEnter choice: ";
        cin >> choice;

        switch (choice) {
            case 1: saveData(); break;
            case 2: displayData(); break;
            case 3: exit(0);
            default: cout << "Invalid Choice!";
        }
        getch();
    }
    return 0;
}
