public class SelfTry_Length_Of_Last_Word {
    public static void main(String[] args) {
        String str="  fly me   to  the   moon  ";
        String str1 = "luffy is still joyboy";
        int lastWord = lengthOfLastWord(str1);
        System.out.println(lastWord);
    }

    private static int lengthOfLastWord(String str) {
        char[] arr = str.toCharArray();
        int res=0;

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=' '){
                res++;
            }else if(res>0){
                return res;
            }
        }
        return res;
    }
}
