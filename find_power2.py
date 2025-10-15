def power_two(number : int) -> None:
    if number  & (number -1) != 0:
        print(f"{number} is not a power of 2")
    else :
        print(f"{number} is a power of 2")




if __name__ == "__main__" :
   given_number = int(input("give the number"))
   power_two(given_number)
