# cat.py
class Cat:
    # Ініціалізатор (конструктор) для класу Cat
    def __init__(self, name="", age=0, breed=""):
        self.name = name
        self.age = age
        self.breed = breed

    # Сеттер для зміни імені
    def set_name(self, name):
        self.name = name

    # Сеттер для зміни віку
    def set_age(self, age):
        self.age = age

    # Сеттер для зміни породи
    def set_breed(self, breed):
        self.breed = breed

    # Геттер для отримання імені
    def get_name(self):
        return self.name

    # Геттер для отримання віку
    def get_age(self):
        return self.age

    # Геттер для отримання породи
    def get_breed(self):
        return self.breed

    # Мяукання кота
    def meow(self):
        print(self.name + " says: Meow!")

    # Кіт біжить
    def run(self):
        print(self.name + " is running.")

    # Кіт стрибає
    def jump(self):
        print(self.name + " jumped.")

    # Кіт муркоче
    def purr(self):
        print(self.name + " is purring.")

    # Кіт спить
    def sleep(self):
        print(self.name + " is sleeping.")

    # Кіт їсть
    def eat(self, food):
        print(self.name + " is eating " + food + ".")

    # Кіт грається
    def play(self, toy):
        print(self.name + " is playing with " + toy + ".")

    # Виведення інформації про кота
    def display_info(self):
        print("Name:", self.name)
        print("Age:", self.age)
        print("Breed:", self.breed)
