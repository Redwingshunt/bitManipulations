def printBitWise(str1):
   n = len(str1)
   pSize = 1<<n
   for i in range(pSize):
     for j in range(n):
         if(i & (1<<j) != 0):
            print(str1[j], end = "" )
     print()








if __name__ == "__main__" :
   base_string = input("give the number")
   printBitWise(base_string)
