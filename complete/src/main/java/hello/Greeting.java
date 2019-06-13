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

    public void displayResults(){
        String messa="Your answer 1: " + id;
        messa+="Answer 1: Ultrasonography uses high frequency sound waves which are transmitted from a transducer (probe) into the patient.";
        messa+="Your answer 2: " +content;
        messa+="Answer 2: Reproductive breeding exam (cycle check mares, pregnancy exams), Tendons/ligaments,ect";
        messa+="Your answer 3: " + horse;
        messa+="Your answer 4: " + ghost;
        messa+="Your answer 5: " + number;
        messa+="Your answer 6: " + thot;
        messa+="Your answer 7: " + bog;
        messa+="Your answer 8: " + city;
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
