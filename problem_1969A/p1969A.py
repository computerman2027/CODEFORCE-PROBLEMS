def noofinvite(arr):
    for i in range(1, len(arr) + 1):
        if i == arr[arr[i - 1] - 1]:
            return 2
    return 3

def main():
    nooftestcase = int(input())
    
    for _ in range(nooftestcase):
        noOfFriends = int(input())
        arr = list(map(int, input().split()))
        print(noofinvite(arr))

if __name__ == "__main__":
    main()
