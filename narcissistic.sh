#!/bin/bash
echo Enter a number n: 
read n

((temp=n))

while (( temp > 0 ))
do
	((digit="$temp % 10"))
	((temp="$temp / 10"))
	((res="$res + $digit*$digit*$digit"))
done
if  (( res == n ))
then	
	echo "$n is a narcissistic number"
else
	echo "$n is not a narcissistic number"
fi
exit 0
