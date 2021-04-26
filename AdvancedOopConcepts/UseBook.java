package SoftwareDevelopment;

public class UseBook {

    public static void main(String[] args) {
    	
        Fiction f=new Fiction("The Song Of Achilles");
        
        System.out.println(f.toString());
        
        NonFiction nf=new NonFiction("In Cold Blood");
        		
        System.out.println(nf.toString());
    }

}
