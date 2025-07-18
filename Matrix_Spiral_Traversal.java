class Matrix_Spiral_Traversal {
    public static void SprialTraversal(int[][] mat,int r,int c)
    {
        int rowStart,rowEnd,colStart,colEnd;
        rowStart=colStart=0;
        rowEnd=r-1;
        colEnd=c-1;
        while (rowStart<=rowEnd && colStart<=colEnd)    
        {   
            for(int i=colStart;i<colEnd+1;i++)
            {
                System.out.println(mat[rowStart][i]);
            }
            rowStart++;
            
            for(int i=rowStart;i<rowEnd+1;i++)
            {
                System.out.println(mat[i][colEnd]);
            }
            colEnd--;
            
            if(rowStart<=rowEnd)
            {
                for(int i=colEnd;i>=colStart;i--)
                {
                    System.out.println(mat[rowEnd][i]);
                }
                rowEnd--;
            }
            
            if(colStart<=colEnd)
            {
                for(int i=rowEnd;i>=rowStart;i--)
                {
                    System.out.println(mat[i][colStart]);
                }
                colStart++;
            }
            
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix ={{3,4,5},{2,9,6},{1,8,7}};
        int row=matrix.length;
        int col=matrix[0].length;
        SprialTraversal(matrix,row,col);
    }
}
