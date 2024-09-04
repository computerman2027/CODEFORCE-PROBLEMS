year=input()
year=str(int(year)+1)
while(True):
    a=int(year[0])
    b=int(year[1])
    c=int(year[2])
    d=int(year[3])
    if a!=b and a!=c and a!=d and b!=c and b!=d and c!=d:
        print(year)
        break
    year=str(int(year)+1)
