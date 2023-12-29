public class VowelConsonentChecking {
    public static void main(String[] args) {
        String line = "This is easin";
        line = line.toLowerCase();
        int vowel = 0, consonent = line.length();

        for (int i=0; i<line.length();i++){
            if(line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u') {
                vowel++;
            }
            else if (line.charAt(i) == ' '){
                consonent = consonent-1;
            }
        }
        System.out.println("Total Vowels are: " + vowel);
        System.out.println("Total Consonents are: " + (consonent-vowel));
    }
}
