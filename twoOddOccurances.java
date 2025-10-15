public class twoOddOccurances {
public static void main(String[] args) {

    int[] arr = {3,7,7,6,8,6,9,5,4,6,6,9,8};
    int xors = 0 ;
    int res1 = 0 ;
    int res2 = 0 ;
    for(int i =0 ; i< arr.length; i++){
        xors^= arr[i];
    }

    int sn = xors & ~(xors-1); //to get the rightmost setbit
    for (int i : arr) {
        if((i % sn) != 0){
            res1^= i;
        }else{
            res2^= i;
        }
    }
    System.out.println("the two odd occurances are" +  res1 + "and " + res2);
    
}



}