public class Q3 {
    
   static final int a=256;
   private static void abc(String s){
       int count[]=new int[a];
       int len=s.length();
       for(int i=0;i<len;i++){
           count[s.charAt(i)]++;
       }
       int max=-1;
       char result=' ';
       for(int i=0;i<len;i++){
            if(max<count[s.charAt(i)]){
                max=count[s.charAt(i)];
                result=s.charAt(i);
            }
        }
       System.out.println(result);

       
   }
   public static void main(String[] args) {
       String s="Harry Potter in his magical Island";
       abc(s);
   }
    
}
