public class Users {
    String name;
    Integer age;
    String city;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age=age;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }

    public Users(String name, Integer age, String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }

    @Override
    public String toString(){
        return "Users{"+
                "name='"+ name + '\''+
                ", age=" + age +
                ", city='" +city + '\''+
                '}';
    }
}
