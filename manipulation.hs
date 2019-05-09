fstMethod xs x = if even x then xs else reverse xs
sndMethod xs = [ if even (length x) then x else reverse x, x <- xs ] 