public class SelfTry_ReverseOnlyLetter {
    public static void main(String[] args) {
        String str="ab-cd"; //op-   dc-ba
        String str1="a-bC-dEf-ghIj"; //op-   j-Ih-gFe-dCba
        String str3="Test1ng-Leet=code-Q!"; //op-   Qedo1ct-eeLg=ntse-T!

        String reverseOnlyLetters = reverseOnlyLetters(str3);
        System.out.println(reverseOnlyLetters);
    }

    private static String reverseOnlyLetters(String str) {
        char[] array = str.toCharArray();
        int i=0;
        int j=array.length-1;
        while(i<j){
            if(isLetter(array[i])){
                while(!isLetter(array[j])){
                    j--;
                }
                char temp = array[i];
                array[i]=array[j];
                array[j]=temp;
                j--;
            }
            i++;
        }
        return String.valueOf(array);
    }

    private static boolean isLetter(char ch){
        return (ch>=65 && ch<=90 || ch>=97 && ch<=122);
    }
}
