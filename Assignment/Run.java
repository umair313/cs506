class Run{
    public static void main(String[] args) {
        String num = "a";
        // NumberFormatException
        try {
            Integer n = Integer.parseInt(num);    
            System.out.println(n);
        } catch (Exception NumberFormatException) {
            System.out.println("Invalid input");
        }
        
        
    }
}