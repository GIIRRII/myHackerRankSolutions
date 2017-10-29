public class Solution {

        public static void main(String[] args){
            Class student =  Student.class;// ~~~Complete this line~~~;
            Method[] methods = student.getDeclaredMethods();// ~~~Complete this line~~~;

            ArrayList<String> methodList = new ArrayList<>();
            for(Method m : methods){
                methodList.add(m.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }

