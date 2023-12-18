/*
=====================================================  2352. Equal Row and Column Pairs  ======================================================


Problem Statement : Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.


                    A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).


Examples : 

                    Example 1:
                    Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
                    Output: 1
                    Explanation: There is 1 equal row and column pair:
                    - (Row 2, Column 1): [2,7,7]


                    Example 2:
                    Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
                    Output: 3
                    Explanation: There are 3 equal row and column pairs:
                    - (Row 0, Column 0): [3,1,2,2]
                    - (Row 2, Column 2): [2,4,2,2]
                    - (Row 3, Column 2): [2,4,2,2]
*/

public class 21 {
    public int equalPairs(int[][] grid) {
        int pair=0;
        int temp=0;
        int row=0;
        while(temp<=grid.length-1)
        {
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=0;j<grid.length;j++)
            {
                map.put(j,grid[row][j]);
            }
            for(int i=0;i<grid.length;i++)
            {
                int curr=0;
                for(int k=0;k<grid.length;k++)
                {
                    if(map.get(k)!=grid[k][i])
                    {
                        curr=0;
                        break;
                    }
                    else
                        curr=1;
                }
                pair+=curr;
            }
            row++;
            temp++;
        }
        return pair;
    }
}
