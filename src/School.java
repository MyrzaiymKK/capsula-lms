public class School {
    String name;
    String director;
    int children;

    public String getName(){
        return name;
    }
    public void setName(String name){
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
