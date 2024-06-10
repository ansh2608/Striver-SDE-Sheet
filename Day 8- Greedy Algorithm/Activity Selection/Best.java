import java.util.*;
class meeting{
    int start;
    int end;
    int pos;
    meeting(int start,int end,int pos){
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}
class meetingComparator implements Comparator<meeting>{
    @Override
    public int compare(meeting o1,meeting o2){
        if(o1.end<o2.end) return -1;
        else if(o1.end>o2.end) return 1;
        else if(o1.pos<o2.pos) return -1;
        return 1;
    }
}
public class Best {
    public static int maxMeetings(int start[], int end[], int n){
        ArrayList<meeting> meet=new ArrayList<>();
        for(int i=0;i<n;i++) meet.add(new meeting(start[i], end[i], i));
        meetingComparator mc=new meetingComparator();
        Collections.sort(meet,mc);
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(meet.get(0).pos);
        int limit=meet.get(0).pos;
        for(int i=1;i<n;i++){
            if(meet.get(i).start > limit){
                limit=meet.get(i).end;
                ans.add(meet.get(i).pos);
            }
        }
        return ans.size();
    }
    public static void main(String[] args) {
        int N = 6;
        int[] start = {1,3,0,5,8,5}, end =  {2,4,6,7,9,9};
        System.out.println(maxMeetings(start, end, N));
    }
}
