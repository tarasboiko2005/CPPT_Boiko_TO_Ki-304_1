import os
import struct
import math
import sys

# Запис результату у текстовий файл
def writeResTxt(fName, result):
    with open(fName, 'w') as f:
        f.write(str(result))

# Читання результату з текстового файлу
def readResTxt(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'r') as f:
                result = f.read()
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result


# Запис результату у бінарний файл
def writeResBin(fName, result):
    with open(fName, 'wb') as f:
        # Див. документацію Python для struct: https://docs.python.org/3/library/struct.html
        f.write(struct.pack('f', result))

# Читання результату з бінарного файлу
def readResBin(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                # Див. документацію Python для struct: https://docs.python.org/3/library/struct.html
                result = struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

# Обчислення результату
def calculate(x):
    return math.cos(x) / math.sin(x)

# Основна частина програми
if __name__ == "__main__":
    try:
        data = float(input("Enter data: "))
        result = calculate(data)
        print(f"Result in python is : {result}")

        writeResTxt("textRes.txt", result)
        writeResBin("binRes.bin", result)

        print("Result in txt is: {0}".format(readResTxt("textRes.txt")))
        print("Result in bin is: {0}".format(readResBin("binRes.bin")))

    except FileNotFoundError as e:
        print(e)
        sys.exit(1)
