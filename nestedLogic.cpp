#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int date_returned,month_returned,year_returned;
    int date,month,year;
    int fine = 0;
    cin>>date_returned>>month_returned>>year_returned;
    cin>>date>>month>>year;
    if(year_returned>year)fine = 10000;
    else if(year==year_returned){
        if(month_returned>month)fine = (month_returned-month)*500;
        else if(month==month_returned && date_returned>date){
            fine = (date_returned-date)*15;
        }
    }
  cout<<fine;
    return 0;
}
