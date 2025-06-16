public class suduko
{
	public static void main(String[] args) {
	    int [][] arr={ {3, 0, 6, 5, 0, 8, 4, 0, 0},
                       {5, 2, 0, 0, 0, 0, 0, 0, 0},
                       {0, 8, 7, 0, 0, 0, 0, 3, 1}};
	   if(solve(arr)){
	       print(arr);
	   }
	   else{
	       System.out.println("not possible");
	   }
	}
	   static void print(int[][] arr){
	       for(int i=0;i<arr.length;i++){
	           for(int j=0;j<arr[0].length;j++){
	               System.out.println(arr[i][j]+" ");
	           }
	           System.out.println();
	           
	       }
	   }
	   static boolean solve(int [][] arr){
	       for(int i=0;i<arr.length;i++){
	           for(int j=0;j<arr[0].length;j++){
	               if(arr[i][j]==0){
	                   for(int k=1;k<10;k++){
	                       if(safe(arr,i,j,k)){
	                           arr[i][j]=k;
	                           if(solve(arr)){
	                               return true;
	                           }
	                           arr[i][j]=0;
	                       }
	                   }
	                   return false;
	               }
	           }
	       }
	       return true;
	   }
	   static boolean safe(int[][] arr,int r,int c,int k){
	       for(int i=0;i<arr.length;i++){
	           if(arr[i][c]==k)return false;
	       }
	       for(int i=0;i<arr.length;i++){
	           if(arr[r][c]==k)return false;
	           
	       }
	       int row=r-(r%3);
	       int col=c=(c%3);
	       for(int q=row;q<row+3;q++){
	           for(int a=col;a<col+3;a++){
	               if(arr[q][a]==k)return false;
	           }
	       }
	       return true;
	   }
}
	               
