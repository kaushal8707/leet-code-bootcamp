public class Solution_RansomNote {
    public static void main(String[] args) {
        String ransomNote = "am"; //aa
        String magazine = "abz"; //aab
        boolean canConstruct = canConstruct(ransomNote, magazine);
        System.out.println(canConstruct);

    }

    private static boolean canConstruct(String ransomNote, String magazine){
        int[] arr = new int[26];
        for(char r : ransomNote.toCharArray()){
            arr[r - 'a']++;
        }
        for(char r : magazine.toCharArray()){
            arr[r - 'a']--;
        }
        for(int i : arr){
            if(i > 0)
                return false;
        }
        return true;
    }
}
