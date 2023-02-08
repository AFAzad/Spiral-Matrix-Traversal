public class SpiralMatrix{
    public static void main(String[] args){
       int[] [] a = {{1,2,3},{4,5,6},{7,8,9}};
       int row = 3, col = 3;
       int top = 0, down =row-1,  left = 0, right = col-1, dir = 0;

       while(top<= down && left<= right){
        if(dir == 0){
            for(int i = left; i <= right; i++)
                System.out.print(a[top][i]+" ");
                top++;
            
        }
        else if(dir == 1){
            for(int i = top; i <= down; i++)
            System.out.print(a[i][right]+" ");
            right--;
        }
        else if(dir == 2){
            for(int i=right; i>= left; i--)
            System.out.print(a[down][i]+" ");
            down--;

        }
        else if(dir == 3)
        {
            for(int i = down; i >=top; i--)
            System.out.print(a[i][left]+" ");
            left++;
        }
        dir=(dir+1)%4;

       }
    }
}