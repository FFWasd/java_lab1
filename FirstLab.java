import java.util.Scanner;
import java.util.Random;

public class FirstLab {
    public int sumLastNums(int x){
        return x%10 + (x%100)/10;
    }

    public boolean isPositive(int x){
        if (x>0) return true;
        else return false;
    }

    public boolean isUpperCase(char x){
        if ('A' <= x && x <= 'Z') return true;
        else return false;
    }

    public boolean isDivisor(int a, int b){
        if (a!=0 && b!=0){
            if (a%b==0 || b%a==0) return true;
        }
        return false;
    }

    public int lastNumSum(int a, int b){
        return a%10 + b%10;
    }

    public double safeDiv(int x, int y){
        if (y == 0) return 0;
        else return x/y;
    }

    public String makeDecision(int x, int y){
        if (x>y) return (String.valueOf(x) + ">" + String.valueOf(y));
        else if (x<y) return (String.valueOf(x) + "<" + String.valueOf(y));
        else return (String.valueOf(x) + "==" + String.valueOf(y));
    }

    public boolean sum3(int x, int y, int z){
        if (x+y==z || x+z==y || y+z==x) return true;
        else return false;
    }

    public String age(int x){
        if (x%10 == 1 && x != 11) return String.valueOf(x) + " год";
        else if ((x%10 == 2 || x%10 == 3 || x%10 == 4) && x!= 12 && x!=13 && x!=14) return String.valueOf(x) + " года";
        else return String.valueOf(x) + " лет";
    }

    public void printDays(String x){
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
                System.out.println("вторник");
                System.out.println("среда");
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "вторник":
                System.out.println("вторник");
                System.out.println("среда");
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "среда":
                System.out.println("среда");
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "четверг":
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "пятница":
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "суббота":
                System.out.println("суббота");
                System.out.println("воскресенье");
                break;
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
                break;
        }
    }

    public String reverseListNums(int x){
        String res = "";
        while (x!=0){
            res += String.valueOf(x) + " ";
            x--;
        }
        res += "0";
        return res;
    }

    public double pow(int x, int y){
        double res = 1.0;
        if (y>0){
            for (int i = 0; i<y;i++){
                res*=x;
            }
        }
        else{
            for (int i=0;i>y;i--){
                res/=x;
            }
        }
        return res;
    }

    public boolean equalNum(int x){
        int y = x%10;
        x/=10;
        while (x>0){
            if (x%10 != y) return false;
            x/=10;
        }
        return true;
    }

    public void leftTriangle(int x){
        String s = "*";
        for (int i=1;i<=x;i++){
            System.out.println(s);
            s+="*";
        }
    }

    public void guessGame(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int x = random.nextInt((9-0)+1)+1;
        int i = 1;
        System.out.print("Введите число от 0 до 9: ");
        while (true){
            int y = scanner.nextInt();
            if (x==y){
                System.out.println("Вы угадалии!");
                if (i%10 == 1 && i != 11) System.out.println("Вы отгадали число за " + i + " попытку");
                else if ((i%10 == 2 || i%10 == 3 || i%10 == 4) && i!= 12 && i!=13 && i!=14) System.out.println("Вы отгадали число за " + i + " попытки");
                else System.out.println("Вы отгадали число за " + i + " попыток");
                break;
            }
            else{
                i++;
                System.out.print("Вы не угадали, введите число от 0 до 9: ");
            }
        }
    }

    public int findLast(int[] arr, int x){
        int c = -1;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == x) c=i;
        }
        return c;
    }

    public int[]add(int[] arr , int x, int pos){
        int[] new_arr = new int[arr.length + 1];
        for (int i=0; i<new_arr.length; i++){
            if (i<pos) new_arr[i] = arr[i];
            else if(i == pos) new_arr[i] = x;
            else new_arr[i] = arr[i-1];
        }
        return new_arr;
    }

    public void reverse (int[] arr){
        int x = arr.length/2;
        for (int i = 0; i< x; i++){
            int t = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = t;
        } 
        for (int num : arr){
            System.out.print(num + " ");
        }
    }

    public int[] concat(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i =0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for (int i = 0;i < arr2.length; i++){
            arr3[i+arr1.length] = arr2[i];
        }
        return arr3;
    }

    public int[] deleteNegative (int[] arr){
        int n = 0;
        for (int i : arr) {
            if (i>0) n++;
        }
        int[] arr2 = new int[n];
        int j=0;
        for (int i : arr) {
            if (i>0){
                arr2[j] = i;
                j++;
            }
        }
        return arr2;
    }
    public static void main(String[] args){
        FirstLab obj = new FirstLab();
        String consoleEncoding = System.getProperty("console.encoding", "UTF-8");
        Scanner scanner = new Scanner(System.in, consoleEncoding);
        int z = 1;
        while (z!=0){
            System.out.print("\033[H\033[J");
            System.out.flush();
            System.out.print("Выберите блок заданий: \n1. Методы \n2. Условия \n3. Циклы \n4. Массивы \n0. Выход \n--> ");
            z = scanner.nextInt();
            System.out.print("\033[H\033[J");
            System.out.flush();
            int e = 1;
            switch (z) {
                case 1:
                    while (e!=0){
                        System.out.print("\033[H\033[J");
                        System.out.flush();
                        System.out.print("Выберите номер задания: \n1. Сумма знаков \n2. Есть ли позитив \n3. Большая буква \n4. Делитель \n5. Многократный вызов \n0. Выход \n--> ");
                        e = scanner.nextInt();
                        int g = 1;
                        System.out.print("\033[H\033[J");
                        System.out.flush();
                        switch (e) {
                            case 1:
                                while (g!=0){
                                    int x = 1;
                                    while (x<10){
                                        System.out.print("Введите число больше 9: ");
                                        x = scanner.nextInt();
                                    }
                                    int _x = obj.sumLastNums(x);
                                    System.out.println("Сумма последних двух цифр: " + _x);
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 2:
                                while (g!=0){
                                    System.out.print("Введите число: ");
                                    int x = scanner.nextInt();
                                    System.out.println("Результат: " + obj.isPositive(x));
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 3:
                                while (g!=0){
                                    System.out.print("Введите символ: ");
                                    char x = scanner.next().charAt(0);
                                    System.out.println("Результат: " + obj.isUpperCase(x));
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 4:
                                while (g!=0){
                                    System.out.print("Введите число a: ");
                                    int a = scanner.nextInt();
                                    System.out.print("Введите число b: ");
                                    int b = scanner.nextInt();
                                    System.out.println("Результат: " + obj.isDivisor(a, b));
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 5:
                                while (g!=0){
                                    for (int i=0; i<4;i++){
                                        System.out.print("Введите число a: ");
                                        int a = scanner.nextInt();
                                        System.out.print("Введите число b: ");
                                        int b = scanner.nextInt();
                                        System.out.println(a + "+" + b + " это " + obj.lastNumSum(a,b));
                                    }
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    while (e!=0){
                        System.out.print("\033[H\033[J");
                        System.out.flush();
                        System.out.print("Выберите номер задания: \n1. Безопасное деление \n2. Строка сравнения \n3. Тройная сумма \n4. Возраст \n5. Вывод дней недели \n0. Выход \n--> ");
                        e = scanner.nextInt();
                        int g = 1;
                        System.out.print("\033[H\033[J");
                        System.out.flush();
                        switch (e) {
                            case 1:
                                while (g!=0){
                                    System.out.print("Введите число x: ");
                                    int x = scanner.nextInt();
                                    System.out.print("Введите число y: ");
                                    int y = scanner.nextInt();
                                    System.out.println("Результат: " + obj.safeDiv(x, y));
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 2:
                                while (g!=0){
                                    System.out.print("Введите число x: ");
                                    int x = scanner.nextInt();
                                    System.out.print("Введите число y: ");
                                    int y = scanner.nextInt();
                                    System.out.println("Результат: " + obj.makeDecision(x, y));
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 3:
                                while (g!=0){
                                    System.out.print("Введите число x: ");
                                    int x = scanner.nextInt();
                                    System.out.print("Введите число y: ");
                                    int y = scanner.nextInt();
                                    System.out.print("Введите число z: ");
                                    int z1 = scanner.nextInt();
                                    System.out.println("Результат: " + obj.sum3(x, y, z1));
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 4:
                                while (g!=0){
                                    int x = -1;
                                    while (x <0){
                                        System.out.print("Введите возраст: ");
                                        x = scanner.nextInt();
                                    }
                                    System.out.println("Результат: " + obj.age(x));
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 5:
                                while (g!=0){
                                    scanner.nextLine();
                                    System.out.print("Введите день недели: ");
                                    String s1 = scanner.nextLine();
                                    System.out.println("Результат: ");
                                    obj.printDays(s1);
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 3:
                    while (e!=0){
                        System.out.print("\033[H\033[J");
                        System.out.flush();
                        System.out.print("Выберите номер задания: \n1. Числа наоборот \n2. Степень числа \n3. Одинаковость \n4. Левый треугольник \n5. Угадайка \n0. Выход \n--> ");
                        e = scanner.nextInt();
                        int g = 1;
                        System.out.print("\033[H\033[J");
                        System.out.flush();
                        switch (e) {
                            case 1:
                                while (g!=0){
                                    System.out.print("Введите число x: ");
                                    int x = scanner.nextInt();
                                    System.out.println("Результат: " + obj.reverseListNums(x));
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 2:
                                while (g!=0){
                                    System.out.print("Введите число: ");
                                    int x = scanner.nextInt();
                                    System.out.print("Введите степень: ");
                                    int y = scanner.nextInt();
                                    System.out.println("Результат: " + obj.pow(x, y));
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 3:
                                while (g!=0){
                                    System.out.print("Введите число x: ");
                                    int x = scanner.nextInt();
                                    System.out.println("Результат: " + obj.equalNum(x));
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 4:
                                while (g!=0){
                                    int x = -1;
                                    while (x<=0){
                                        System.out.print("Введите число x: ");
                                        x = scanner.nextInt();
                                    }
                                    System.out.println("Результат: ");
                                    obj.leftTriangle(x);
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 5:
                                while (g!=0){
                                    obj.guessGame();
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 4:
                    while(e!=0){
                        System.out.print("\033[H\033[J");
                        System.out.flush();
                        System.out.print("Выберите номер задания: \n1. Поиск последнего значения \n2. Добавление в массив \n3. Реверс \n4. Объединение \n5. Удалить негатив \n0. Выход \n--> ");
                        e = scanner.nextInt();
                        int g = 1;
                        System.out.print("\033[H\033[J");
                        System.out.flush();
                        switch (e) {
                            case 1:
                                while (g!=0){
                                    int n = -1;
                                    while (n<=0){
                                        System.out.print("Введите размер массива: ");
                                        n = scanner.nextInt();
                                    }
                                    int[] arr = new int[n];
                                    for (int i=0;i<n;i++){
                                        System.out.print("Введите число: ");
                                        int j = scanner.nextInt();
                                        arr[i] = j;
                                    }
                                    System.out.print("Введите число x: ");
                                    int x = scanner.nextInt();
                                    System.out.println("Индекс последнего вхождения: " + obj.findLast(arr, x));
                                    System.out.print("Для выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 2:
                                while (g!=0){
                                    int n = -1;
                                    while (n<=0){
                                        System.out.print("Введите размер массива: ");
                                        n = scanner.nextInt();
                                    }
                                    int[] arr = new int[n];
                                    for (int i=0;i<n;i++){
                                        System.out.print("Введите число: ");
                                        int j = scanner.nextInt();
                                        arr[i] = j;
                                    }
                                    System.out.print("Введите число для вставки: ");
                                    int x = scanner.nextInt();
                                    System.out.print("Введите индекс: ");
                                    int pos = scanner.nextInt();
                                    int[] new_arr = obj.add(arr, x, pos);
                                    System.out.print("Изначальный массив: ");
                                    for (int i : arr) {
                                        System.out.print(i + " ");
                                    }
                                    System.out.print("\nНовый массив: ");
                                    for (int i : new_arr) {
                                        System.out.print(i + " ");
                                    }
                                    System.out.print("\nДля выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 3:
                                while (g!=0){
                                    int n = -1;
                                    while (n<=0){
                                        System.out.print("Введите размер массива: ");
                                        n = scanner.nextInt();
                                    }
                                    int[] arr = new int[n];
                                    for (int i=0;i<n;i++){
                                        System.out.print("Введите число: ");
                                        int j = scanner.nextInt();
                                        arr[i] = j;
                                    }
                                    System.out.print("Изначальный массив: ");
                                    for (int i : arr){
                                        System.out.print(i + " ");
                                    }
                                    System.out.print("\nРезультат: ");
                                    obj.reverse(arr);
                                    System.out.print("\nДля выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 4:
                                while (g!=0){
                                    int n1 = -1;
                                    while (n1<=0){
                                        System.out.print("Введите размер массива 1: ");
                                        n1 = scanner.nextInt();
                                    }
                                    int[] arr1 = new int[n1];
                                    for (int i=0;i<n1;i++){
                                        System.out.print("Введите число: ");
                                        int j = scanner.nextInt();
                                        arr1[i] = j;
                                    }
                                    int n2 = -1;
                                    while (n2<=0){
                                        System.out.print("Введите размер массива 2: ");
                                        n2 = scanner.nextInt();
                                    }
                                    int[] arr2 = new int[n2];
                                    for (int i=0;i<n2;i++){
                                        System.out.print("Введите число: ");
                                        int j = scanner.nextInt();
                                        arr2[i] = j;
                                    }
                                    
                                    int[] arr3 = obj.concat(arr1, arr2);
                                    System.out.print("arr1 = ");
                                    for (int i : arr1) {
                                        System.out.print(i + " ");
                                    }
                                    System.out.print("\narr2 = ");
                                    for (int i : arr2) {
                                        System.out.print(i + " ");
                                    }
                                    System.out.print("\narr3 = ");
                                    for (int i : arr3) {
                                        System.out.print(i + " ");
                                    }
                                    System.out.print("\nДля выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            case 5:
                                while (g!=0){
                                    int n = -1;
                                    while (n<=0){
                                        System.out.print("Введите размер массива: ");
                                        n = scanner.nextInt();
                                    }
                                    int[] arr = new int[n];
                                    for (int i=0;i<n;i++){
                                        System.out.print("Введите число: ");
                                        int j = scanner.nextInt();
                                        arr[i] = j;
                                    }
                                    int[] arr2 = obj.deleteNegative(arr);
                                    System.out.print("Изначальный массив: ");
                                    for (int i : arr) {
                                        System.out.print(i + " ");
                                    }
                                    System.out.print("\nНовый массив: ");
                                    for (int i : arr2) {
                                        System.out.print(i+" ");
                                    }
                                    System.out.print("\nДля выхода введите 0: ");
                                    g = scanner.nextInt();
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    default:
                        break;
                }
            }
        }
}