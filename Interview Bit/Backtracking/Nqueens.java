
public class Solution {
    public ArrayList<ArrayList<String>> solveNQueens(int a) 
    {
            ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        
        if (a <= 0) {
            return result;
        }
        
        int[] colx = new int[a];
        compute(result, a, 0, colx);
        return result;
    }
    
    private void compute(ArrayList<ArrayList<String>> output, int len, int row, int[] columns) {
        
        if (row == len) {
            addResults(output, columns);
            return;
        }
        
        for (int col = 0; col < len; col++) {
            if (canQueenBePlaced(row, col, columns)) {
                columns[row] = col;
                compute(output, len, row + 1, columns);
            }
        }
    }
    
    private boolean canQueenBePlaced(int row1, int column1, int[] columns1) {
        for (int row2 = 0; row2 < row1; row2++) {
            int column2 = columns1[row2];
            
            if (column1 == column2) {
                return false;
            }
            
            int dColumn = Math.abs(column2 - column1);
            int dRow = row1 - row2;
            
            if (dColumn == dRow) {
                return false;
            }
        }
        return true;
    }
    
    private void addResults (ArrayList<ArrayList<String>> output, int[] tempCol) {
        ArrayList<String> res = new ArrayList<String>();
        
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < tempCol.length; i++) {
            int pos = tempCol[i];
            for (int j = 0; j < tempCol.length; j++) {
                if (pos == j) {
                    builder.append('Q');
                } else {
                    builder.append('.');
                }
            }
            if (i != tempCol.length - 1) {
                builder.append(' ');
            }
        }
        res.add(builder.toString());
        output.add(res);
    }
}
