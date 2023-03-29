

public class sem_2_task_3 {
    public static void main(String[] args) {
        StringBuilder isPalindrome = new StringBuilder("aabbcbbaa");
        System.out.println("You palindrome candidate ---> " + isPalindrome);
        if (isPalindrome.toString().equals(isPalindrome.reverse().toString())){
            System.out.println("Is palindrome");
        }
        else{
            System.out.println("Is not a palindrome");
        }
        }

        
    }


    

