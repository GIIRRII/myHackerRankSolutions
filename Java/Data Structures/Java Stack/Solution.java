import java.util.*;
class Solution{
  private static boolean isBalanced(HashMap map , String str)
   {
       Deque <Character> dq = new ArrayDeque<>();
       int len = str.length();
       boolean failed =  false;
       for(int i=0; !failed && i<len; i++)
       {    
           char ch = str.charAt(i);
            //   char mc = '.';
           if(map.containsKey(ch))
           {
               dq.push(ch);
           }else if(dq.isEmpty()||ch!=map.get(dq.pop()))
           {
               return false;
               
           }
       }
      return dq.isEmpty();
         
   }
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      HashMap <Character, Character> sMap = new HashMap<>();
          sMap.put('{','}');
          sMap.put('(',')');
          sMap.put('[',']');
       
      while (sc.hasNext()) {
         String input=sc.next();   
         System.out.println(isBalanced(sMap, input));
         
           
      }
      
   }
}
