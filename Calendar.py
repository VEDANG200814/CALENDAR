def start(y):
    mm=0
    for i in range (1900,y,1) :
        if ((i%4==0 and i%100!=0) or i%400==0):
            mm+=366
        else:
            mm+=365
    p=(mm+1)%7
    return p


y=int(input("Enter year\n"))
b=0
l=start(y)+1
m=("JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER")
for i in range(1,13,1):
    if((i<=7 and i%2==1)or(i>=8 and i%2==0)):
        b=31
    elif(((y%4==0 and y%100!=0)or(y%400==0))and i==2):
        b=29
    elif i==2:
        b=28
    else:
        b=30
    print(m[i-1],": ")
    print("S\tM\tT\tW\tT\tF\tS")
    k=0
    for k in range(1,l,1):
        print("\t",end="")
    k+=1
    for j in range(1,b+1,1):
        print(j ,"\t", end="")
        l+=1
        if l==8 or k%7==0:
            print()
            l=1
        k+=1
    print()