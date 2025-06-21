
package edu.std.oop.session.project.Finalexample;


public class owner {
    private int id;
    private String name;

    public owner() {
        id=202211510;
        name="ahmad abdullah";
    }

    public owner(int id, String name) {
        setId(id);
        setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>= 202010001&&id<=202539999)
        this.id = id;
        else{
        id=202211510;
        
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=5)
        this.name = name;
        else{
        this.name="ahmad abdullah";
        }
    }

    @Override
    public String toString() {
        return "owner{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
