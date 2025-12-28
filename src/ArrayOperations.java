import java.util.Scanner;

public class ArrayOperations {
    static void ArrayCreationDummy(){
        int A[] = {1,2,3,4,5};
        int B[] = new int[5];
        int []C;
        C = new int[5];
        C[3]=300;
    }
    static int[] ArrayCreation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        int length = sc.nextInt();
        int []Array = new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter array element: ");
            Array[i] = sc.nextInt();
        }
        return Array;
    }
    static void ArrayPrint(int []Arr){
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i]+",");
        }
        System.out.println();
    }
    static int SumOfArray(int[] Arr){
        int sum = 0;
        for(int i=0;i<Arr.length;i++){
            sum+=Arr[i];
        }
        return sum;
    }
    static boolean FindKeyInArray(int[] Arr, int key){
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]==key){
                return true;
            }
        }
        return false;
    }
    static void FirstSecondMaxInArray(int[] Arr){
        int max1 = -1, max2 = -1;
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]>max1){
                max2 = max1;
                max1 = Arr[i];
            }
            else if(Arr[i]>max2){
                max2=Arr[i];
            }
        }
        System.out.println("max1: "+max1);
        System.out.println("max2: "+max2);
    }
    static int[] RotateArrayRightN(int[] Arr, int r){
        int temp[] = new int[r];
        for(int i=0;i<r;i++)temp[i] = Arr[i];
        for(int i=0;i<Arr.length-r;i++){
            Arr[i]=Arr[i+r];
        }
        for(int i=0;i<r;i++){
            Arr[Arr.length - r + i]=temp[i];
        }
        return Arr;
    }
    static int[] RotateArrayLeftN(int[] Arr, int l){
        int temp[] = new int[l];
        for(int i = 0;i<l;i++) temp[i] = Arr[Arr.length-l+i];
        for(int i=Arr.length-l-1;i >= 0;i--){
            Arr[i+l] = Arr[i];
        }
        for(int i=0;i<l;i++){
            Arr[i]=temp[i];
        }
        return Arr;
    }
    static int[] CopyArray(int[] Arr){
        int temp[] = new int[Arr.length];
        for(int i=0;i<Arr.length;i++){
            temp[i]=Arr[i];
        }
        return temp;
    }
    static int[] DoubleTheArraySize(int Arr[]){
        int temp[] = new int[2*Arr.length];
        for(int i=0;i<Arr.length;i++){
            temp[i]=Arr[i];
        }
        Arr = temp;
        temp = null;
        return Arr;
    }
    static int[] ReverseArray(int[] Arr){
        for(int i=0, j=Arr.length-1;i<j;i++,j--){
            Arr[i] = Arr[i] ^ Arr[j];
            Arr[j] = Arr[i] ^ Arr[j];
            Arr[i] = Arr[i] ^ Arr[j];
        }
        return Arr;
    }
    public static void main(String[] args) {
        //ArrayCreationDummy()
        // int []Arr = ArrayCreation();
        int []Arr = {1,2,3,4,5};
        ArrayPrint(Arr);
        System.out.println("Sum of array elements: " + SumOfArray(Arr));
        System.out.println("Find key in array elements: " + FindKeyInArray(Arr, 5));
        System.out.println("First and Second Max of the Array");
        FirstSecondMaxInArray(Arr);
        Arr = RotateArrayRightN(Arr, 3);
        ArrayPrint(Arr);
        Arr = RotateArrayLeftN(Arr, 3);
        ArrayPrint(Arr);
        int Arr2[] = CopyArray(Arr);
        ArrayPrint(Arr2);
        Arr2 = ReverseArray(Arr2);
        ArrayPrint(Arr2);
        DoubleTheArraySize(Arr);
        System.out.println("Size of the Arr:" + Arr.length);



    }
}
