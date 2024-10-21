import java.util.Scanner;

class DataTypes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
            String s = sc.next();
           Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            String Character = "Character";
            if(Character.equals(s) && ans==2){
                ans = 1;
            }
            System.out.println(ans); 
            sc.close();
       }
    }

class Solution{
     int dataTypeSize(String str){
        switch (str) {
            case "Character":
                return (Character.SIZE/8) ;
                
            case "Integer" :
                return (Integer.SIZE/8) ;
            
            case "Long" :
            return (Long.SIZE/8) ;

            case "Float" :
            return(Float.SIZE/8);

            case "Double" :
                 return (Double.SIZE/8);

            default:
            return -1;
                
        }

    }
}