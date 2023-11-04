import static java.lang.StringTemplate.STR;

public class University {
    String name;
    int found;
    String director;
    public University(String name,int found,String director){
        this.name= name;
        this.found = found;
        this.director = director;
    }
   public String  getName(){
      return name;
   }
   public void setName(String name){
       this.name = name;
   }

    public int getFound() {
        return found;
    }

    public void setFound(int found) {
        this.found = found;
    }
    public String getDirector(){
       return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public String getUniInfo(){
        return STR."""
                Имя универа: \{name}
                Год основании: \{found}
                Декан: \{director}
                """;
    }
}
