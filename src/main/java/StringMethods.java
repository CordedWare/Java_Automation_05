public class StringMethods {

{//    1.  Написать метод removeSpaces(), который принимает на вход строку.
//        Если строка не пустая (проверить методом класса String), то примените
//        метод по удалению пробелов в начале и в конце строки.
//        Догадаться, каким методом из видео можно проверить, были ли пробелы
//        в строке.
//        Если пробелы были, то метод должен удалить их и вернуть сообщение:
//        “Лишние пробелы удалены”.
//        Если пробелов не было, вернуть сообщение “Пробелов не было”.
//        Если строка пустая (проверить методом класса String), вернуть
//        сообщение “Строка пустая”.
//
//        Test Data:
//        “    Red Rover School   “ → “Лишние пробелы удалены”
//        “Red Rover School“ → “Пробелов не было”
//        “” → “Строка пустая”
} // (1)
    public String removeSpaces(String string) {

        if (string != "") { // проверяет, если строка не пустая, то...

            string.trim(); // удаляет лишние пробелы вначале и в конце

            return "Лишние пробелы удалены";
        } //if else (string.) { как проверить, если пробелов не было?!!!!!

        //}
        return "Строка пустая";
    }

{//   2. Написать алгоритм removeAllAs().
//    С помощью методов из видео1, написать алгоритм, который принимает
//    на вход строку. Если строка валидная, то метод удаляет все буквы
//    'a' из строки, если таковые имеются. Метод возвращает обработанную строку.
//    Test Data:
//            “    Red Rover School   “ →  “Red Rover School“
//            “panda   “ → “pnd”
//            “taramasalata” → “trmslt”
} // (2)
    public String removeAllAs(String string) {

    return string.trim().replace("a","");
    }

{//    3. Написать алгоритм removeAllZeros().
//    С помощью методов из видео1, написать алгоритм, который принимает на вход
//    строку, состоящую из цифр. Если строка валидная, то метод удаляет все пробелы
//    из строки, если таковые имеются. Метод возвращает обработанную строку, в которой
//    нет нулей. Если в строке не было нулей, метод возвращает сообщение
//    “This is a valid string”.

//    Test Data:
//            “3504209706040000 “ →  “35429764“
//            “0000000111“ → “111
} // (3)

    public String removeAllZeros(String string) {

    return string.trim().replace("0", "");

    // как написать условие, что если нет нолей????!
    }

{
//        Написать алгоритм removeAllSpaces.
//        С помощью методов из видео1, написать алгоритм, который принимает на вход
//        строку. Если строка валидная, то метод удаляет все пробелы из строки, если
//        таковые имеются. Метод возвращает обработанную строку.

//        Test Data:
//        “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
//        “p a     n   d a   “ → “panda”
} // (4)

    public String removeAllSpaces(String string) {

    return string.trim().replace("     ", "").replace(" ", "");
    }
}
