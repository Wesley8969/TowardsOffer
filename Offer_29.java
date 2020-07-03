// class Solution {
//     public int[] spiralOrder(int[][] matrix) {
//         if(matrix.length==0)
//             return new int[0];
//         int d=0,m=matrix.length,n=matrix[0].length,i=0,j=0,k=0;
//         int[] iChange={0,1,0,-1};
//         int[] jChange={1,0,-1,0};
//         boolean[][] visited=new boolean[m][n];
//         int[] res=new int[m*n];
//         while(true){
//             visited[i][j]=true;
//             res[k++]=matrix[i][j];
//             if(k>=m*n)
//                 break;
//             int inext=i+iChange[d],jnext=j+jChange[d];
//             if(inext<0 || inext>=m || jnext<0 || jnext>=n || visited[inext][jnext])
//                 d=(d+1)%4;
//             i+=iChange[d];
//             j+=jChange[d];
//         }   
//         return res;
//     }
// }
//二维数组顺时针遍历解法，遍历一个去查看下一个是否符合条件，不符合就换方向
//时间复杂度O(mn),空间复杂度O(mn);


//法2：限制上下左右边界，每次循环遍历一个圈
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int rows = matrix.length, columns = matrix[0].length;
        int[] order = new int[rows * columns];
        int index = 0;
        int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; column++) {
                order[index++] = matrix[top][column];
            }
            for (int row = top + 1; row <= bottom; row++) {
                order[index++] = matrix[row][right];
            }
            if (left < right && top < bottom) {
                for (int column = right - 1; column > left; column--) {
                    order[index++] = matrix[bottom][column];
                }
                for (int row = bottom; row > top; row--) {
                    order[index++] = matrix[row][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return order;
    }
}
