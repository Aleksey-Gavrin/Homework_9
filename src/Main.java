public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Результат выполнения задачи 1:");
        task1();
        System.out.println();
        System.out.println("Результат выполнения задачи 2:");
        task2();
        System.out.println();
        System.out.println("Результат выполнения задачи 3:");
        task3();
        System.out.println();
        System.out.println("Результат выполнения задачи 4:");
        task4();
    }
    // Генератор случайного массива трат. В каждой из 30 ячеек случайное целое число в диапазоне от 100_000 до 200_000.
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

//    Задача 1
//    Бухгалтеры попросили посчитать сумму всех выплат за месяц.
//    Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».
    public static void task1 () {
        int[] expensesArray = generateRandomArray();
        int expensesSum = 0;
        for (int expense : expensesArray) {
            expensesSum += expense;
        }
        System.out.println("Сумма трат за месяц составила " + expensesSum + " рублей.");
    }

//    Задача 2
//    Также бухгалтерия попросила найти минимальную и максимальную трату за день.
//    Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Минимальная сумма трат за
//    день составила … рублей. Максимальная сумма трат за день составила … рублей».

    public static void task2 () {
        int[] expensesArray = generateRandomArray();
        int expenseMin = expensesArray[0];
        int expenseMax = expensesArray[0];
        for (int expense : expensesArray) {
            if (expense < expenseMin) {
                expenseMin = expense;
            }
            if (expenseMax < expense) {
                expenseMax = expense;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + expenseMin + " рублей. Максимальная сумма трат" +
                " за день составила " + expenseMax + " рублей.");
    }

//    Задача 3
//    Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
//    Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на
//    количество дней), и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
//    Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.

    public static void task3 () {
        int[] expensesArray = generateRandomArray();
        int expensesSum = 0;
        double avgExpense;
        int expensesArrayLength = expensesArray.length;
        for (int expense: expensesArray) {
            expensesSum += expense;
        }
        avgExpense = (double) expensesSum / expensesArrayLength;
        System.out.print ("Средняя сумма трат за месяц составила ");
        System.out.printf("%.2f", avgExpense);
        System.out.println(" рублей.");
    }

//    Задача 4
//    В бухгалтерской книге появился баг. Что-то пошло не так: фамилии и имена сотрудников начали отображаться в обратную
//    сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов
//    char[ ]. Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.
//    В качестве данных для массива используйте:
//    char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//    В результате в консоль должно быть выведено: Ivanov Ivan.
//    Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом
//    и распечатать его элементы в правильном порядке.

    public static void task4 () {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; 0 <= i; i--) {
            if (i == 0) {
                System.out.println(reverseFullName[i]);
            }
            else {
                System.out.print(reverseFullName[i]);
            }
        }
    }
}