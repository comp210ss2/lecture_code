"""Hashing demo

Won't get same results for the string hashes in different runs
Likely because string hash is based on object memory address
But still true that hash("a") == hash("a")
So ignore this detail"""

def main():
    print(hash("a"))                        # -6588312747986162059
    print(hash("a"))                        # -6588312747986162059
    print(hash(-6588312747986162059))       # -1976626729558774157
                                            #   i.e., not "a"

    print(hash("b"))                        # 4102657837602767868
    print(hash("arbitrarily long string"))  # 5696518988526620602
    print(hash("brbitrarily long string"))  # -8273835205753002689
                                            #   small change => completely different hash
                                            #   "cascading" effect

    print(hash(3.14))                       # 322818021289917443
                                            #   can hash floats
    print(hash((3, 1, 4)))                  # -2653327859907630399
                                            #   can hash tuples
                                            #   can hash pretty much anything
                                            #   besides our own custom types
                                            #   then we have to define our own hash function

if __name__ == "__main__":
    main()
