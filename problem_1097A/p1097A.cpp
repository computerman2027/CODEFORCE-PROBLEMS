#include<iostream>
#include<string>
using namespace std;

bool compare(string a, string b)
{
    if(a[0]==b[0] || a[1]==b[1])
    return true;
    return false;
}

int main()
{
    string tablecard="",handcard="";

    cin>>tablecard;
    cin.ignore();
    getline(cin,handcard);

    handcard=handcard+" ";

    string w="";
    int i;
    for(i=0;i<handcard.length();i++)
    {
        if(handcard[i]==' ')
        {
            if(compare(tablecard,w))
            {
                cout<<"YES"<<endl;
                return 0;
            }
            w="";
        }
        else
        {
            w=w+handcard[i];
        }
    }
    cout<<"NO"<<endl;
    return 0;
}