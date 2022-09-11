// Задача №1 Напишите функцию, для поиска наиболее длинного общего префикса, 
// среди массива строк. Если общего префикса нет, то возвращать пустую строку. 
// Пример ["aabb", "aabbb", "aaabb"] - ответ "aa"
public class task2 {
    public static void main(String[] args) {
        String[] array = {"aabb", "aabbb", "aaabb"};
        String s;
        char[] charArray = new char[3];
        String[] StringArray = new String[3];
        String s1;
        int min = 100;
        String result="";
        for (int i = 0; i < array.length; i++) {
            s = array[i];
            charArray[i]  = s.charAt(0);

        }
        if ((charArray[0]!=charArray[1])||(charArray[1]!=charArray[2])) {
            System.out.println("Общего префикса не существует!");
            
        } else {
                for (int k = 0; k < array.length; k++) {
                    s1= array[k];
                    for (int j = 0; j < s1.length(); j++) {
                        if (s1.charAt(j)!=s1.charAt(0)) {
                            StringArray[k] = s1.substring(0, j);
                        break; 
                        }
                    }
                }

                for (int k = 0; k < StringArray.length; k++) {
                    s1= StringArray[k];
                    if (s1.length() < min) {
                        min = s1.length();
                        result = s1;
                    }
                }
            }
            if (result!="") {
                System.out.printf("Наибольший общий префикс - '%s'", result); 
            }
    }
}
