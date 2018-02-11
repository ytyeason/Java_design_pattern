package prototypePattern;

public class ElementCreator 
{
   private Element aPrototype = null;
	
   public static void main(String[] args) 
   {
      ElementCreator creator = new ElementCreator();
      creator.setPrototype(new ElementA());
      System.out.println(creator.create().description());
      creator.setPrototype(new ElementB());
      System.out.println(creator.create().description());
   }
	
   public void setPrototype(Element pElement)
   {
      aPrototype = pElement;
   }
	
   public Element create()
   {
      return aPrototype.clone();
   }
}

interface Element extends Cloneable 
{ 
   Element clone();
   String description();
}

class ElementA implements Element
{ 
   public String description() { return "A"; }
   public ElementA clone() 
   {
      try { return (ElementA) super.clone(); } catch( CloneNotSupportedException e ) { return null; }
   }
}

class ElementB implements Element
{ 
   public String description() { return "B"; }
   public ElementB clone() 
   {
      try { return (ElementB) super.clone(); } catch( CloneNotSupportedException e ) { return null; }
   }
}