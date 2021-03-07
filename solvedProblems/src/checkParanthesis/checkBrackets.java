//import java.util.ArrayDeque;
//import java.util.Deque;
//import java.util.Stack;
//
//public class checkParanthesis {
//
//   // private static private Stack stack;
//  static  Deque<Character> stack = new ArrayDeque<Character>();
//
//    public checkParanthesis(Deque stack) {
//        this.stack = stack;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(checkBreckets("{}{}"));
//
//
//    }
//
//    private static boolean checkBreckets(String expr) {
//
//        for (int i = 0; i < expr.length(); i++) {
//            char currChar=expr.charAt(i);
//
//            if (currChar == '(' || currChar == '[' ||currChar == '{'); {
//                stack.push(currChar);
//                continue;
//            }
//            if (stack.isEmpty())
//                return false;
//
//            char  check = stack.pop();
//            switch (currChar) {
//                case ')':
//                    if (check == '{' || check == '[')  {
//                        return false;
//                        break;
//                    }
//            }
//            switch (currChar) {
//                case ']':
//                    if (check == '{' || check == '(') {
//                        return false;
//                        break;
//                    }
//            }
//            switch (currChar) {
//                case '}':
//                    if (check == '[' || check=='(' ) {
//                        return false;
//                        break;
//                    }
//            }
//
//        }
//        return true;
//    }
//}
