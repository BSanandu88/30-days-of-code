#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<map>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int N;
    string name;
    cin>>N;

    map<string,int>phoneBook;

    for(int i=0;i<N;i++){
        cin>>name;
        
        if(!phoneBook[name]){
            cin>>phoneBook[name];
        }
    }
    while(cin>>name){
        if(phoneBook[name]){
            cout<<name<<"="<<phoneBook[name]<<endl;
        }
        else {
           cout<<"Not found"<<endl;
        }
    }
    


    return 0;
}
