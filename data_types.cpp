#include <iostream>
#include <iomanip>
#include <limits>

using namespace std;

int main() {
    int i = 4;
    double d = 4.0;
    string s = "HackerRank ";

    
    // Declare second integer, double, and String variables.
    int num;
    double num1;
    string name;
    // Read and save an integer, double, and String to your variables.
    cin>>num>>num1;
    cin.ignore();
    getline(cin,name);
    // Print the sum of both integer variables on a new line.
    cout<<i+num<<endl;
    // Print the sum of the double variables on a new line.
    cout<<fixed<<setprecision(1)<<d+num1<<endl;
    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.
    cout<<s+name<<endl;
    return 0;
}