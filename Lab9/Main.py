# main.py
from experimental_cat import ExperimentalCat

def main():
    # Створення об'єкта класу ExperimentalCat
    my_cat = ExperimentalCat("Tuzik", 2, "Common")

    # Виведення інформації про кота
    my_cat.display_info()

    # Зміна властивостей кота
    my_cat.set_name("Fluffy")
    my_cat.set_age(4)
    my_cat.set_breed("Persian")

    print("New cat info:")

    # Повторне виведення інформації про кота
    my_cat.display_info()

    # Виклик методів класу
    my_cat.meow()
    my_cat.run()
    my_cat.jump()
    my_cat.purr()
    my_cat.sleep()
    my_cat.eat("tuna")
    my_cat.play("a ball")

    # Виведення типу суб'єкта
    print(my_cat.get_subject_type())

# Запуск головної функції
if __name__ == "__main__":
    main()
