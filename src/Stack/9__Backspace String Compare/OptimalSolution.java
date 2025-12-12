import java.util.Stack;

public class OptimalSolution {
        public static void main(String[] args) {
            String s = "ab##";  //ab#c
            String t = "c#d#";  //ad#c
            boolean backspaceCompare = doBackspaceCompare(s, t);
            System.out.println(backspaceCompare);
        }

        public static boolean doBackspaceCompare(String s, String t) {
            int i = s.length()-1, j = t.length()-1, sSkip=0, tSkip=0;
            while (i >=0 || j >= 0){
                while (i >= 0 && s.charAt(i) == '#' || sSkip > 0){
                    if(s.charAt(i) == '#'){
                        sSkip++; i--;
                    }else{
                        sSkip--; i--;
                    }
                }
                while (j >= 0 && t.charAt(j) == '#' || tSkip > 0){
                    if(t.charAt(j) == '#'){
                        tSkip++; j--;
                    }else{
                        tSkip--; j--;
                    }
                }

                if(j < 0 && i >= 0){
                    return false;
                }
                if(i < 0 && j >= 0){
                    return false;
                }

                if(i >=0 && j >= 0 && s.charAt(i) != t.charAt(j)){
                    return false;
                }
                i--; j--;
            }
            return true;
        }
}

// TC - O(n)
// SC - O(1)
// we will move i and j pointers to the real characters and then we will compare both strings
// Here every character we are looking only once so even 2 while loops TC will be O(n)