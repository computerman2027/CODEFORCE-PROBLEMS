#include <iostream>
#include <vector>

using namespace std;

int noofinvite(vector<int> &arr)
{
    for (int i = 1; i <= arr.size(); i++)
    {
        if (i == arr[arr[i - 1] - 1])
        {
            return 2;
        }
    }
    return 3;
}

int main()
{
    int nooftestcase;
    cin >> nooftestcase;

    for (int i = 0; i < nooftestcase; i++)
    {
        int noOfFriends;
        cin >> noOfFriends;

        vector<int> arr(noOfFriends);
        for (int j = 0; j < noOfFriends; j++)
        {
            cin >> arr[j];
        }

        cout << noofinvite(arr) << endl;
    }
    return 0;
}
