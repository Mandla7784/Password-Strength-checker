package main.java;

/**
 * This is a password checker class , 
 * @How it works: it checks the length first if its less than 8 chars then return false
 * Loop on each charecter on on the password and check the types
 */
class PassWordChecker{
    public static void main(String[] args){
        boolean isPassword = isPasswordValid("MSdfbfdf####45");
        if(isPassword == true) System.out.println("The password is valid");

        System.out.println(isPassword);  
    }
  static boolean  isPasswordValid(String password){
    if(password.length() < 8){
        return  false; // checking the length
    }else{
        boolean hasLowercase = false;
        boolean hasUpper = false;
        boolean hasSpecialChar = false;
        boolean hasNumber = false;

    // looping the password chars ..
    for(int i = 0 ; i < password.length(); i ++){
        char letter = password.charAt(i);

    if(Character.isUpperCase(letter)){
        hasUpper = true;
    }else if(Character.isLowerCase(letter)){
        hasLowercase = true;
    }else if(Character.isDigit(letter)){
        hasNumber = true;
    }else if(!Character.isLetterOrDigit(letter)){
        hasSpecialChar = true;
    }
    }
    if(hasLowercase && hasNumber && hasSpecialChar && hasUpper){
        return  true;
    }
      return  false;
    }
   
  }

}