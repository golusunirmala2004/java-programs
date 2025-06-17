public class Nqueensproblem
{ static int n=4;
	public static void main(String[] args) {
		int [][] a=new int[n][n];
		solve(a,0);
	}
      static void solve(int [][] a,int r){
          if(r==n){
              print(a);
                  System.out.println();
                  return;
              }
              for(int c=0;c<n;c++){
                  if(safe(a,r,c)){
                      a[r][c]=1;
                      solve(a,r+1);
                      a[r][c]=0;
                  }
              }
          }
          static void print(int [][]a){
              for(int i=0;i<a.length;i++){
                  for(int j=0;j<a.length;j++){
                      System.out.print(a[i][j]+" ");
                  }
                  System.out.println();
              }
          }
          static boolean safe(int [][] a,int r,int c){
              int r1=r;
              int c1=c;
              while(r1>-1){
                  if(a[r1][c1]==1)
                      return false;
                      r1-=1;
                   
                  }
                  int r2=r;
                  int c2=c;
                  while(r2>-1 && c2>-1){
                      if(a[r2][c2]==1)
                      return false;
                      r2-=1;
                      c2-=1;
                  }
                  int r3=r;
                  int c3=c;
                  while(r3>-1 && c3<a.length){
                      if(a[r3][c3]==1)
                      return false;
                      r3-=1;
                      c3+=1;
                  }
              
                  return true;
          }
    }
      
