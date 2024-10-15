# experimental_cat.py
from cat import Cat

class ExperimentalCat(Cat):
    # Ініціалізатор для класу ExperimentalCat
    def __init__(self, name, age, breed):
        super().__init__(name, age, breed)

    # Метод для отримання типу суб'єкта
    def get_subject_type(self):
        return "Experimental cat"
