public class MethodPractice {
    int max(int a, int b){
        return a > b ? a : b;
    }
    float max(float a, float b){
        return a > b ? a : b;
    }
    int max(int ...A){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        MethodPractice obj = new MethodPractice();
        System.out.println(obj.max(3, 4));
        System.out.println(obj.max(3f, 4f));
        System.out.println(obj.max(1,2,3,4,5,6));
    }
}
