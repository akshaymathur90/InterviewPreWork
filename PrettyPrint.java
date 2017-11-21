import java.util.ArrayList;

//Checkpoint 2

public class PrettyPrint {
    public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = (2*a-1);
        int arr[][] = new int[n][n];
        for(int i =a;i>0;i--){
            for(int j=a-i;j<n-(a-i);j++){
                for(int k=a-i;k<n-(a-i);k++){
                    arr[j][k]=i;
                }
            }
        }
        for(int i=0;i<n;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<n;j++){
                //System.out.print(arr[i][j] + " ");
                temp.add(arr[i][j]);
            }
            //System.out.println();
            result.add(temp);
        }
        return result;
    }
}
