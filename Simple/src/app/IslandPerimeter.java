package app;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        
        
        if (grid == null) return 0;
        
        int perimeterCount = 0;
        
        for (int i = 0; i < grid.length; i++) {
            
            for (int j = 0; j < grid[0].length; j++) {
                
                if (grid[i][j] == 1) {
                    perimeterCount = perimeterCount + countAllSides(grid, i, j);
                }
                
            }
            
        }
        
        return perimeterCount;
        
        
    }
    
    private int countAllSides(int[][] grid, int i, int j) {
        
        
        int count = 0;
        
        if ( j - 1 < 0 || grid[i][j-1] == 0 ) ++count;

        if ( j + 1 >= grid[0].length || grid[i][j+1] == 0 ) ++count;
            
        if ( i - 1 < 0 || grid[i-1][j] == 0 ) ++count;
            
        if ( i + 1 >= grid.length || grid[i+1][j] == 0) ++count;
            
        return count;
    }
}
