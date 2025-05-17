import java.util.*;
public class JobSequence {
  static class Job{
    int deadline;
    int profit;
    int id;
    public Job(int i, int d, int p){
      id=i;
      deadline=d;
      profit=p;
    }
  }
  public static void main(String[] args) {
    int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};

    ArrayList<Job> jobs=new ArrayList<>();
    for(int i=0;i<jobInfo.length;i++){
      jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
    }
    Collections.sort(jobs, (obj1,obj2) -> obj2.profit-obj1.profit); //Descending order of profit sort
    ArrayList<Integer> ans=new ArrayList<>();
    int time=0;
    for(int i=0;i<jobs.size();i++){
      Job curr=jobs.get(i);
      if(curr.deadline>time){
        ans.add(curr.id);
        time++;
      }
    }
    System.out.println("Max Jobs :"+ans.size());
    for(int i=0;i<ans.size();i++){
      System.out.print(ans.get(i)+" ");
    }
  }
}
