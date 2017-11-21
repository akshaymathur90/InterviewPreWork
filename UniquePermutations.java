import java.util.ArrayList;
import java.util.Collections;

//Checkpoint 5

public class UniquePermutations {

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Collections.sort(a);
        backtrack(result,new ArrayList<>(),a,new boolean[a.size()]);
        //System.out.println(result.toString());
        return result;
    }

    private void backtrack(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, ArrayList<Integer> a, boolean [] used){

        if(list.size()==a.size()){
            result.add(new ArrayList(list));
        }else{

            for(int s = 0;s<a.size();s++){
                if(used[s] || s > 0 && a.get(s) == a.get(s-1) && !used[s - 1]) continue;
                used[s] = true;
                list.add(a.get(s));
                backtrack(result,list,a,used);
                used[s] = false;
                list.remove(list.size()-1);
            }
        }
    }
}
