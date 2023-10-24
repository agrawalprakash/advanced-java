package app;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleArraySolution {
 
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        List<Integer> row = null;
        
        List<Integer> pre = null;
        
        for (int i = 0; i < numRows; i++) {
            
            row = new ArrayList<Integer>();
            
            for (int j = 0; j <= i; j++) {
                
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                   row.add(pre.get(j-1) + pre.get(j));
                }
                

            }
            
            pre = row;
                
            result.add(row);
            
            
        }
        
        return result;
           
    }

}
