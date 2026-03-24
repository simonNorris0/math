#!/bin/bash
echo Enter a number to calculate factorial of: 
read n
factorial=1
for ((i=1; i<=n; i++))
do
	factorial=$(($factorial * $i))
done
echo $factorial
exit 0
