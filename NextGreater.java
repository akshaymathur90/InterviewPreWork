import java.util.ArrayList;

//Checkpoint 4

public class NextGreater {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean f = false;
        for(int i = 0;i<a.size(); i++){
            f=false;
            for(int j=i+1;j<a.size();j++){
                if(a.get(j)>a.get(i)){
                    result.add(a.get(j));
                    f=true;
                    break;
                }
            }
            if(!f){
                result.add(-1);
            }
        }
        return result;
    }
}
