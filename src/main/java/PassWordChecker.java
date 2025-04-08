



class PassWordChecker{
    public static void main(String[] args){
        boolean isPassword = isPasswordValid("jhvcihjs");
        if(isPassword == true) System.out.println("The password is valid");
        
        System.out.println(isPassword);

    
        
    }
  static boolean  isPasswordValid(String password){
    if(password.length() < 8){
        return  false;
    }
      

  }
}