import sys
import stdio

n = int(sys.argv[1])

factor = 2
while factor * factor <= n:
    while (n % factor) == 0:
        # Cast out and write factor.
        n //= factor
        stdio.write(str(factor) + ' ')
    factor += 1
    # Any factors of n are greater than or equal to factor.
    
if n > 1:
    stdio.write(n)
stdio.writeln()