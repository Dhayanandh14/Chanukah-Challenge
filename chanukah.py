p=int(input())
for i in range(0,p):
  lst = list(input().split())
  n=int(lst[0])
  k=int(lst[1])
  count=0;
  for j in range(1,k+1):
      count = count +j;
  print (n,count+k,sep=" ",end="\n")

