import upendra.Rotation;

import java.util.*;

public class Main {
    static String isBalanced(String s) {
        Stack<Character> st = new Stack<Character>();
        int strLength = s.length();
        // using simple for loop
        for (int i = 0; i < strLength; i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[')
                st.push(c);
            else{
                Character top = st.peek();
                if((top == '(' && c ==')') || (top == '{' && c =='}') || (top == '[' && c ==']'))
                    st.pop();
                else
                    return "NO";
            }
        }
        if(st.empty())
            return "YES";
        else
            return "NO";

    }

    public static void main(String args[]){
//        int[] array = new int[]{1,2,3,4,5,6,7,8};
        Rotation rotation = new Rotation();
//        rotation.rotateArray(4, array);
//        for(int i=0; i< array.length;i++){
//            System.out.print(array[i]+" ");
//        }
//        List<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();
//        for(int i=0;i< 4; i++){
//            ArrayList<Integer> list1 = new ArrayList<Integer>();
//            listOfLists.add(list1);
//            for(int j=1;j<=3 ;j++){
//                list1.add(j*i + j);
//            }
//
//        }
//
//        //int[] [] table= {{1,2,3},{4,5,6}, {7,8,9}, {10,11,12}};
//        rotation.rotateMatrix(listOfLists, 3);
//        for(int i=0 ;i < listOfLists.size(); i++)
//            System.out.println(Arrays.toString(listOfLists.get(i).toArray()));
        System.out.println(isBalanced("{{[[(())]]}}"));
    }
}
