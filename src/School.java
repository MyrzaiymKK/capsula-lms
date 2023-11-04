public class School {
    String name;
    String director;
    int children;
    public School(String name,String director,int children){
        this.name = name;
        this.director = director;
        this.children = children;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }
    public String getSchInfo(){
        return STR."""
                Имя: \{name}
                Директор: \{director}
                Кол-во школников: \{children}
                """;
    }
}
