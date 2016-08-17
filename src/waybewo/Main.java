package waybewo;

public class Main {

    static int[] myArr = {122, 46, 45, 47, 5, 24, 65, 8};

    public static void main(String[] args) {

        bubleSort(myArr);

        // поменять местами максимальный и минимальный элементы массива
        replaceMaxAndMinElements(myArr);


        multiplication();

        double myZxc[] = {3.23, 13.5, 1.1, 34.4, 53.2};
        average(myZxc);


        increaseBy10percentAt(myZxc, 1);

        increaseBy10percentAt(myZxc, 3);

        increaseBy10percentAt(myZxc, 4);


        printArray(myZxc);

        replaceMaxAndMinElements(myArr);

        // переставить элементы в обратном порядке

        // умножить все элементы на 10
        multiplyBy(myArr, 23);

        // сложить все элементы масива и вывести результат на экран
        int arrayR[] = {5, 21, 32, 77, 53, 87, 96};
        sumElements(arrayR);

        // создать новый масив состоящий из элементов первого в обратном порядке
        int[] reversedArray = reverseArrElements(arrayR);
        printArray(reversedArray);


    }

    private static int[] reverseArrElements(int[] arrayR) {
        int newArr[] = new int[arrayR.length];

        for (int i = 0; i < arrayR.length; i++) {
            newArr[arrayR.length-i-1] = arrayR[i];
        }
        return newArr;
    }

    private static void sumElements(int[] arrayR) {
        int sum = 0;
        for (int i = 0; i <arrayR.length; i++) {
            sum = sum+arrayR[i];
        }
        System.out.println(sum);
    }

    private static void multiplyBy(int[] myArr, int multiply) {
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = myArr[i] * multiply;
            System.out.println(myArr[i]);
        }
    }

    private static void average(double[] myZxc) {
        int asd = myZxc.length;
        double dds = 0;
        for (int i = 0; i < myZxc.length ; i++) {
            dds = dds +myZxc[i];
        }
        System.out.println(dds/asd);
    }

    private static void multiplication() {
        int a = 1100;
        double b = 7.2;
        double adss = a*b;
        System.out.println(adss);
    }

    private static void bubleSort(int[] arr) {
        int var2 = 1;

        for (; var2 == 1; ) {
            var2 = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int var1 = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = var1;
                    var2 = 1;
                }
            }
        }
    }

    private static void replaceMaxAndMinElements(int[] myArray1) {
                int minVarPos = 0;
        int minVar = myArray1[0];
        for (int i = 1; i < myArray1.length; i++) {
            if (minVar > myArray1[i]) {
                minVar = myArray1[i];
                minVarPos = i;
            }
        }
        System.out.println(minVar);



        int maxVarPos = 0;
        int maxVar = myArray1[0];
        for (int i = 1; i < myArray1.length ; i++) {
            if (maxVar < myArray1[i]){
                maxVar = myArray1[i];
                maxVarPos = i;
            }
        }
        System.out.println(maxVar);

        myArray1[maxVarPos] = minVar;
        myArray1[minVarPos] = maxVar;



        printArray(myArray1);
    }

    private static void increaseBy10percentAt(double[] myZxc, int pos) {
        myZxc[pos] = myZxc[pos] * 1.1;
    }

    private static void printArray(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i]);
            if (i<myArr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    private static void printArray(double[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i]);
            if (i<myArr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}

