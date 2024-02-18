def isPalindrome(x: int) -> bool:
        ref = x
        rev = 0
        temp =0

        if (x<0):
            return False

        while (ref!=0):
            temp=ref%10
            rev=(rev*10)+temp
            ref=ref/10

        print(rev)
        print(x)

        return x==rev

print(isPalindrome(121))