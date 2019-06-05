package hello;

public class Greeting {

    private String id;
    private String content;
    private String horse;
    private String ghost;
    private String number;
    private String thot;
    private String bog;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void checkCity(){
        String current= getCity();
        if(current.equals("Ithaca")){
            setCity("Correct City");
        } else {
            setCity("Incorrect City");
        }
    }

    public String getBog() {
        return bog;
    }

    public void setbog(String bog) {
        this.bog = bog;
    }

    public String getThot() {
        return thot;
    }

    public void setThot(String thot) {
        this.thot = thot;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHorse(){
        return horse;
    }

    public void setHorse(String horse){
        this.horse=horse;
    }

    public String getGhost(){
        return ghost;
    }

    public void setGhost(String ghost){
        this.ghost=ghost;
    }

}
