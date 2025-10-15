public class Bitwise {


    public static void main(String[] args) {
      String str = "345";
      int num  = str.length();
      pSize = 1 << num;
      for(int i =0; i < pSize ; i++){
        for(int j =0 ; j <num ; j++){
            if (i & (1<<j)!=0){
                if(str.charAt(j) !='') {System.out.print(str.charAt(j));}
                else{
                    System.out.print(str.charAt(j));
                }
            }
        }

        System.out.println();
      }
    }
    
}
