package hackerRank.week2;

import java.util.LinkedList;

public class SuperDigit {

    public static int superDigit(String n, int k) {
                
        LinkedList<Integer> list = new LinkedList<>();
        
        for (int i=0; i< n.length(); i++) {
            list.add(Integer.valueOf(String.valueOf(n.charAt(i))));
        }
        
        Long sum = 0L; // huge numbers
        boolean firstLoop = true;
        
        while(!list.isEmpty()) {
            int i =list.pop();
            sum+=i;
            
            if(list.isEmpty()) {
                if(firstLoop) {
                    sum = sum * k; // avoid concatenation 
                    firstLoop = false;                    
                }
                
                if(sum<10) {
                    return sum.intValue();
                }
                
                String v = String.valueOf(sum);
                for (int j=0; j<v.length(); j++) {
                    list.add(Integer.valueOf(String.valueOf(v.charAt(j))));
                }
                sum = 0L;
            }
        }
        
        return -1;
    }

}