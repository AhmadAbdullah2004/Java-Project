
package edu.std.oop.session.project.classes;


public class Book {
    private String title;
    private int pages;
    private char caterogy;
    private  static int numperofbook=0;

    public Book() {
     title ="empty title";
     pages=10;
     caterogy='o';
   numperofbook++;     
    }

    public Book(String title, int pages, char caterogy) {
        setTitle(title);
        setCaterogy(caterogy);
        setPages(pages);
        numperofbook++;
    }

    public static int getNumperofbook() {
        return numperofbook;
    }

    public char getCaterogy() {
        return caterogy;
    }

    public int getPages() {
           
        return pages;
          
        
    }

    public String getTitle() {
        return title;
    }

    public void setCaterogy(char caterogy) {
        switch(caterogy)
        {      case'o' : case 'O' :case 'f':case 'F':case 'C':case 'c':
        this.caterogy = caterogy;
        
        break;
        default:
            this.caterogy='o';
    }
    }
    public void setPages(int pages) {
        if(pages>=10)
        this.pages = pages;
        else
            this.pages=10;
    }

    public void setTitle(String title) {
  
        this.title = title;
    }

    
    private double getpagesprice(){
    
    return (pages*0.015);
    
    }
      private double getcaterogypeice(){
           switch(caterogy)
   {
       case 'c': case 'C':
          return 100;
   case 'f': case 'F':
          return 50;
   case 'O': case 'o':
          return 30;
          default:
          return 0;}
   }
   public double getbookprice(){
   
   return (getcaterogypeice()+getpagesprice());
   
   
   
   }   
      
      public String toString(){
      
      String r="";
      r+="\n title ="+title;
      r+="\n pages ="+pages;
      r+="\n category ="+caterogy;
      r+="\n pages price ="+getpagesprice();
      r+="\n category price ="+getcaterogypeice();
      r+="\n book price ="+getbookprice();
      r+="\n numper of book ="+getNumperofbook();
      return r;
      
      }
      public Book getcopy(){
      Book temp=new Book();
      temp.title=this.title;
      temp.pages=this.pages;/////// حفظظظظ
      temp.caterogy=this.caterogy;
      return temp;
      
      
      
      
      }
      
      
      
      
      
      
      
}
