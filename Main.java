class Main{

public static void main (String[] args){
  People age = new People();
  People name = new People();
  People cellPhone = new People();

  age.setData("20");
  name.setData("Lea");
  cellPhone.setData("555-5555");
  
   System.out.println(age.getData());
   System.out.println(name.getData());
  System.out.println(cellPhone.getData());
   
 
}
}
class People {
  private String data;
  
  public void setData(String data){
    this.data = data;
  }

  public String getData(){
    return this.data;
  }
}
