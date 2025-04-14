import java.security.SecureRandom;
import java.util.Scanner;
public class password {
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Password Generator");
        System.out.println("=================");
        
        // Get password length
        System.out.print("Enter password length (8-50): ");
        int length = getValidIntInput(scanner, 8, 50);
        
        // Get character type preferences
        System.out.print("Include lowercase letters? (y/n): ");
        boolean includeLowercase = getYesNoInput(scanner);
        
        System.out.print("Include uppercase letters? (y/n): ");
        boolean includeUppercase = getYesNoInput(scanner);
        
        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = getYesNoInput(scanner);
        
        System.out.print("Include special characters? (y/n): ");
        boolean includeSpecial = getYesNoInput(scanner);
        
        // Ensure at least one character type is selected
        if (!includeLowercase && !includeUppercase && !includeNumbers && !includeSpecial) {
            System.out.println("Error: At least one character type must be selected.");
            System.out.println("Defaulting to include all character types.");
            includeLowercase = includeUppercase = includeNumbers = includeSpecial = true;
        }
        
        // Generate and display the password
        String password = generatePassword(length, includeLowercase, includeUppercase, 
                                         includeNumbers, includeSpecial);
        
        System.out.println("\nGenerated Password: " + password);
        
        // Display password strength
        evaluatePasswordStrength(password);
        
        scanner.close();
    }
    
    private static String generatePassword(int length, boolean includeLowercase, 
                                          boolean includeUppercase, boolean includeNumbers, 
                                          boolean includeSpecial) {
        StringBuilder characterPool = new StringBuilder();
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();
        
        // Build character pool based on preferences
        if (includeLowercase) characterPool.append(LOWERCASE_CHARS);
        if (includeUppercase) characterPool.append(UPPERCASE_CHARS);
        if (includeNumbers) characterPool.append(NUMBERS);
        if (includeSpecial) characterPool.append(SPECIAL_CHARS);
        
        String allChars = characterPool.toString();
        
        // Ensure at least one of each required type is included
        if (includeLowercase) {
            password.append(LOWERCASE_CHARS.charAt(random.nextInt(LOWERCASE_CHARS.length())));
        }
        if (includeUppercase) {
            password.append(UPPERCASE_CHARS.charAt(random.nextInt(UPPERCASE_CHARS.length())));
        }
        if (includeNumbers) {
            password.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
        }
        if (includeSpecial) {
            password.append(SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length())));
        }
        
        // Fill the rest of the password length with random characters
        while (password.length() < length) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }
        
        // Shuffle the password characters to avoid predictable pattern at beginning
        char[] passwordArray = password.toString().toCharArray();
        for (int i = 0; i < passwordArray.length; i++) {
            int randomIndex = random.nextInt(passwordArray.length);
            char temp = passwordArray[i];
            passwordArray[i] = passwordArray[randomIndex];
            passwordArray[randomIndex] = temp;
        }
        
        return new String(passwordArray);
    }
    
    private static int getValidIntInput(Scanner scanner, int min, int max) {
        int value;
        while (true) {
            try {
                String input = scanner.nextLine();
                value = Integer.parseInt(input);
                if (value >= min && value <= max) {
                    break;
                } else {
                    System.out.print("Please enter a number between " + min + " and " + max + ": ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
        return value;
    }
    
    private static boolean getYesNoInput(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("y") || input.equals("yes")) {
                return true;
            } else if (input.equals("n") || input.equals("no")) {
                return false;
            } else {
                System.out.print("Please enter 'y' or 'n': ");
            }
        }
    }
    
    private static void evaluatePasswordStrength(String password) {
        int strength = 0;
        String evaluation;
        
        // Length check
        if (password.length() >= 12) {
            strength += 2;
        } else if (password.length() >= 8) {
            strength += 1;
        }
        
        // Check for character variety
        if (password.matches(".*[a-z].*")) strength += 1;
        if (password.matches(".*[A-Z].*")) strength += 1;
        if (password.matches(".*\\d.*")) strength += 1;
        if (password.matches(".*[!@#$%^&*()\\-_=+\\[\\]{}|;:,.<>?].*")) strength += 1;
        
        // Evaluate strength
        if (strength >= 5) {
            evaluation = "Very Strong";
        } else if (strength == 4) {
            evaluation = "Strong";
        } else if (strength == 3) {
            evaluation = "Moderate";
        } else {
            evaluation = "Weak";
        }
        
        System.out.println("Password Strength: " + evaluation);
    }
}

