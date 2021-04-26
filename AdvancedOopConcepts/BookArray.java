package SoftwareDevelopment;

public class BookArray {

    public static void main(String[] args) {
        
        Book bookArray[]={new Fiction("The Great Gatsby"),
                            new Fiction("The Four Winds"),
                            new Fiction("The Midnight Library"),
                            new Fiction("Americanah"),
                            new Fiction("The Last Kids on Earth"),
                            new Fiction("All The Light We Cannot See"),
                            new NonFiction("In Cold Blood"),
                            new NonFiction("Becoming"),
                            new NonFiction("The Warmth of Other Suns"),
                            new NonFiction("Into the Wild")};
        
        for(int i=0;i<bookArray.length;i++)
        {
            System.out.println(bookArray[i].toString());
        }
    }

}