class SelfKeyword:
    def __init__(self, a: int, b: int):
        self.a = a
        self.b = b

    def __str__(self) -> str:
        return f"{self.a}, {self.b}"

sk: SelfKeyword = SelfKeyword(1, 2)
print(sk)
