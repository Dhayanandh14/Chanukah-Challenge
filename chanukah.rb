p=gets.to_i;
for i in 0...p
  n,k=gets.chomp.split.map(&:to_i)
  count=0;
  for j in 1..k
      count = count +j;
  end
  print n," ", count+k,"\n"
end
    